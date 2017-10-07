package zukkey.gothic.injection

import dagger.Component
import zukkey.gothic.GoThicApplication
import zukkey.gothic.injection.module.AppModule
import zukkey.gothic.ui.activity.BaseActivity
import zukkey.gothic.ui.fragment.BaseFragment
import zukkey.gothic.ui.viewholder.BaseViewHolder
import javax.inject.Singleton

/**
 * Network component to define inject
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface MainComponent {
  fun inject(application: GoThicApplication)
  fun inject(activity: BaseActivity)
  fun inject(fragment: BaseFragment)
  fun inject(viewHolder: BaseViewHolder)
}