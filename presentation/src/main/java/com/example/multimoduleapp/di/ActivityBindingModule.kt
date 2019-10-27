package com.example.multimoduleapp.di

import com.example.multimoduleapp.view.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector
    fun contributeMainActiivty(): MainActivity
}