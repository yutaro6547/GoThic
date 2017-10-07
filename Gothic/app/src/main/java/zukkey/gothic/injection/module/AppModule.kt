package zukkey.gothic.injection.module

import android.app.Application
import dagger.Module
import dagger.Provides

/**
 * App module provide application object
 */
@Module
class AppModule(val application: Application) {

  @Provides
  fun provideApplication(): Application {
    return application
  }
}