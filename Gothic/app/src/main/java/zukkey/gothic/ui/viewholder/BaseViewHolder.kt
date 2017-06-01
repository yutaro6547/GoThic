package zukkey.gothic.ui.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import zukkey.gothic.GoThicApplication

/**
 * Created by zukkey on 2017/06/01.
 * base viewholder for injection
 */
abstract class BaseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

  init {
    GoThicApplication.mainComponent.inject(this)
  }
}