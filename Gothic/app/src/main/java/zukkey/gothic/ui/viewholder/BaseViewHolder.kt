package zukkey.gothic.ui.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import zukkey.gothic.GoThicApplication

/**
 * base viewholder for injection
 */
abstract class BaseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

  init {
    GoThicApplication.mainComponent.inject(this)
  }
}