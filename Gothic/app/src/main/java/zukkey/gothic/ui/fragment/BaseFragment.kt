package zukkey.gothic.ui.fragment

import android.app.Fragment
import android.os.Bundle
import zukkey.gothic.GoThicApplication
import zukkey.gothic.ui.activity.BaseActivity

/**
 * Created by YUTARO SUZUKI on 2017/05/27.
 * All Fragment base class (DI)
 */

abstract class BaseFragment: Fragment() {
  /**
   * get current Activity
   */
  val baseActivity: BaseActivity get() { return activity as BaseActivity }
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GoThicApplication.mainComponent.inject(this)
  }
}