package zukkey.gothic.injection

import dagger.Component
import zukkey.gothic.GoThicApplication
import zukkey.gothic.injection.module.AppModule
import zukkey.gothic.ui.activity.BaseActivity
import zukkey.gothic.ui.activity.fragment.BaseFragment
import zukkey.gothic.ui.activity.viewholder.BaseViewHolder
import javax.inject.Singleton

/**
 * Created by zukkey on 2017/06/01.
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