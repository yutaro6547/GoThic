package zukkey.gothic.injection.module

import android.app.Application
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides

/**
 * [WIP]
 * Write Overview here.
 */
@Module
class MediaModule(val application: Application) {

  @Provides
  fun provideImageLoader(): Picasso {
    return Picasso.with(application)
  }
}