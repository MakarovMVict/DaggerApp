package com.mapswithme.daggerapp

import DaggerPack.Components.CarComponent
import DaggerPack.Components.DaggerCarComponent
import android.app.Application

class MyApplication : Application() {

    lateinit var carComponent:CarComponent

    override fun onCreate() {
        super.onCreate()
        carComponent= DaggerCarComponent.builder()
                // .petrolEngineModule(PetrolEngineModule(100)) //если используем @Component.builder то это не нужно
                .powerCapasity(3000)//если использовать @Named, то каждое значение надо задавать тут
                .engineCapacity(1000)
                .build()
    }

    fun getComponent():CarComponent {
        return carComponent
    }
}