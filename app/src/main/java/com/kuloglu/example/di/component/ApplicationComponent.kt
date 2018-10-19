package com.kuloglu.example.di.component

import android.content.Context
import android.content.SharedPreferences
import com.kuloglu.example.App
import com.kuloglu.example.di.module.ApplicationModule
import com.kuloglu.example.di.module.DatabaseModule
import com.kuloglu.example.ui.main.MainActivityViewModel

import com.kuloglu.example.di.module.NetModule

import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class))


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)
}
