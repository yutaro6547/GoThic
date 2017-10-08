package zukkey.gothic.ui.viewholder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import zukkey.gothic.GoThicApplication
import kotlin.reflect.jvm.internal.impl.javax.inject.Inject

/**
 * base viewholder for injection
 */
abstract class BaseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

  companion object {
    fun getView(parent: ViewGroup, layoutId: Int): View {
      val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
      return view
    }
  }

  @Inject lateinit var picasso: Picasso

  init {
    GoThicApplication.mainComponent.inject(this)
  }
}