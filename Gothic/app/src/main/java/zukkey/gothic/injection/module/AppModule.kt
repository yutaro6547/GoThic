package zukkey.gothic.injection.module

import android.app.Application
import dagger.Module
import dagger.Provides

/**
 * Created by zukkey on 2017/06/01.
 * App module provide application object
 */
@Module
class AppModule(val application: Application) {

  @Provides
  fun provideApplication(): Application {
    return application
  }
}