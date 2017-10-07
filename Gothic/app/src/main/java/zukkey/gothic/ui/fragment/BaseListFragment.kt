package zukkey.gothic.ui.fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_list.*
import zukkey.gothic.R
import zukkey.gothic.ui.custom.RecyclerViewScrollEndListener

/**
 * Base class for all list fragment
 */

abstract class BaseListFragment: BaseFragment() {
  open val emptyTitleText: String? = null
  open val emptyDescriptionText: String? = null

  lateinit var scrollEndListener: RecyclerViewScrollEndListener

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    return inflater.inflate(R.layout.fragment_list, container, false)
  }

  override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val layoutManager = layoutManager()
    recyclerview.layoutManager = layoutManager
    recyclerview.setHasFixedSize(true)
    recyclerview.isMotionEventSplittingEnabled = false

    scrollEndListener = object : RecyclerViewScrollEndListener(layoutManager) {
      override fun onLoadMore(current: Int) {
        fetch(current)
      }
    }
    recyclerview.addOnScrollListener(scrollEndListener)
    refresh_layout.setOnRefreshListener { fetch(0) }

    adapter()?.let {
      it.registerAdapterDataObserver(object : RecyclerView.AdapterDataObserver() {
        override fun onChanged() {
          if (it.itemCount == 0) showEmptyView() else hideEmptyView()
        }
      })
      recyclerview.adapter = it
    }
  }

  abstract fun adapter(): RecyclerView.Adapter<*>?

  fun layoutManager(): RecyclerView.LayoutManager {
    return LinearLayoutManager(activity)
  }

  open fun fetch(page: Int) {
    if (page == 0) scrollEndListener.reset()
  }

  open fun showEmptyView() {
    empty_title_textview?.text = emptyTitleText
    empty_description_textview?.text = emptyDescriptionText
    empty_layout?.visibility = View.VISIBLE
    recyclerview?.setBackgroundResource(android.R.color.transparent)
  }

  open fun hideEmptyView() {
    empty_layout?.visibility = View.INVISIBLE
    recyclerview?.setBackgroundResource(android.R.color.darker_gray)
  }
}