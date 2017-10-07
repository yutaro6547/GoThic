package zukkey.gothic

import android.app.Application
import zukkey.gothic.injection.MainComponent

/**
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