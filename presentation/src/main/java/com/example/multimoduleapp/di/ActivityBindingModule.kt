package com.example.multimoduleapp.di

import com.example.multimoduleapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector
    fun contributeMainActiivty(): MainActivity
}