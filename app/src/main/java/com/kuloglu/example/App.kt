package com.kuloglu.example

import com.kuloglu.example.di.component.DaggerApplicationComponent
import com.kuloglu.example.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

