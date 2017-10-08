package zukkey.gothic.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import zukkey.gothic.R

/**
 * Home Fragment in Main Activity
 */

class HomeFragment: BaseFragment() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    return inflater.inflate(R.layout.fragment_home, container, false)
  }
}