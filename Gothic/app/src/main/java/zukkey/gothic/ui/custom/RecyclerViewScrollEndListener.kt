package zukkey.gothic.ui.custom

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

/**
 * Scroll End listener use for load next
 */

abstract class RecyclerViewScrollEndListener(lm: RecyclerView.LayoutManager): RecyclerView.OnScrollListener() {
  private val layoutManager = lm
  private var firstVisibleItem = 0
  private var visibleItemCount = 0
  private var totalItemCount = 0
  private var previousTotal = 0
  private var current = 0
  private var loading = true

  abstract fun onLoadMore(current: Int)

  fun reset() {
    current = 0
    firstVisibleItem = 0
    visibleItemCount = 0
    totalItemCount = 0
    previousTotal = 0
  }

  override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
    super.onScrolled(recyclerView, dx, dy)
    visibleItemCount = recyclerView.childCount
    totalItemCount = layoutManager.itemCount

    if (layoutManager is LinearLayoutManager) {
      firstVisibleItem = layoutManager.findFirstVisibleItemPosition()
    }

    if (loading) {
      if (totalItemCount > previousTotal) {
        loading = false
        previousTotal = totalItemCount
      }
    }

    if (totalItemCount < 5) return
    if (!loading && totalItemCount - visibleItemCount <= totalItemCount + visibleItemCount) {
      current++
      onLoadMore(current)
      loading = true
      previousTotal = totalItemCount
    }
  }
}
