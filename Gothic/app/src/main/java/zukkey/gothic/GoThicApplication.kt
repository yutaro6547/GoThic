package zukkey.gothic

import android.app.Application
import zukkey.gothic.injection.MainComponent

/**
 * Created by zukkey on 2017/06/01.
 * GoThic Application class
 */
class GoThicApplication: Application() {
  companion object {
    @JvmStatic
    lateinit var mainComponent: MainComponent
  }

  override fun onCreate() {
    super.onCreate()
  }
}