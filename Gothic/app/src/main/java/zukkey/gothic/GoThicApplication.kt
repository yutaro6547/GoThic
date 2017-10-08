package zukkey.gothic

import android.app.Application
import zukkey.gothic.injection.DaggerMainComponent
import zukkey.gothic.injection.MainComponent
import zukkey.gothic.injection.module.AppModule

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

    mainComponent = DaggerMainComponent.builder()
        .appModule(AppModule(this))
        .build()
    mainComponent.inject(this)
  }
}