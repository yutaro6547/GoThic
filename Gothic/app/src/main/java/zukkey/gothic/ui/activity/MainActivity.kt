package zukkey.gothic.ui.activity

import android.os.Bundle
import zukkey.gothic.R
import zukkey.gothic.ui.fragment.HomeFragment

class MainActivity : BaseActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    supportFragmentManager.beginTransaction()
        .replace(R.layout.fragment_home, HomeFragment())
        .commit()
  }
}