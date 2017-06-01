package zukkey.gothic.ui.activity.fragment

import android.app.Fragment
import zukkey.gothic.ui.activity.BaseActivity

/**
 * Created by YUTARO SUZUKI on 2017/05/27.
 * All Fragment base class
 */

abstract class BaseFragment: Fragment() {
  val baseActivity: BaseActivity get() { return activity as BaseActivity }

}