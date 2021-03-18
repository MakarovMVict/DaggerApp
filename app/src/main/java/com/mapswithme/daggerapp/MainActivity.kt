package com.mapswithme.daggerapp

import DaggerPack.Components.CarComponent
import Model.Car
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var daggerComponent:CarComponent

   // @Inject
    lateinit var car: Car
                         // если Driver  НЕ @Singleton то машины содержат разные объекта driver,если нет - один и тот же
   // @Inject
    lateinit var car1:Car

    override fun onCreate(savedInstanceState: Bundle?) {//чтоб @Singletone не пересоздавались при перевороте экрана надо делать всё это в Application
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        daggerComponent=DaggerCarComponent.create()
        daggerComponent=(application as MyApplication).getComponent()//чтоб не пересоздавалось при перевороте экрана


//        =DaggerCarComponent.builder()
//                // .petrolEngineModule(PetrolEngineModule(100)) //если используем @Component.builder то это не нужно
//                .powerCapasity(3000)//если использовать @Named, то каждое значение надо задавать тут
//                .engineCapacity(1000)
//                .build()
        daggerComponent.inject(this)

        daggerComponent.getCar().start()//если объекты у одного компонента,то синглтон,если у разных,то они отличаются
//        car1.start()
//        var component2 = DaggerCarComponent.builder()
//                // .petrolEngineModule(PetrolEngineModule(100)) //если используем @Component.builder то это не нужно
//                .powerCapasity(400)//если использовать @Named, то каждое значение надо задавать тут
//                .engineCapacity(200)
//                .build()
//        car1 = component2.getCar()
//        car1.start()
    }

}