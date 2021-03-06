package zukkey.gothic.ui.activity

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import zukkey.gothic.GoThicApplication

/**
 * Created by YUTARO SUZUKI on 2017/05/27.
 */

abstract class BaseActivity: AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GoThicApplication.mainComponent.inject(this)
    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
  }

  override fun finish() {
    super.finish()
  }

  override fun onSaveInstanceState(outState: Bundle?) {
    super.onSaveInstanceState(outState)
  }
}