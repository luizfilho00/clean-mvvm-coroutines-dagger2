package com.example.multimoduleapp.di

import android.content.Context
import com.example.multimoduleapp.MultiModuleAppApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        ApiProviderModule::class,
        ApplicationBindingModule::class,
        ActivityBindingModule::class
    ]
)
interface AppComponent {

    fun inject(application: MultiModuleAppApplication): MultiModuleAppApplication

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }
}