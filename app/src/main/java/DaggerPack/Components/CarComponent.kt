package DaggerPack.Components

import Model.Car
import DaggerPack.Modules.PetrolEngineModule
import DaggerPack.Modules.WheelsModule
import com.mapswithme.daggerapp.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton//надо чтоб поле объекта модуля(? урок 10) могло быть синглтоном!!!
@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent  {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)


    @Component.Builder
    interface Builder { //добавляет отдельный компонент при построении главного компонента(этого)

        @BindsInstance
        fun powerCapasity(@Named("power")powerCapacity:Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engine")engineCapacty:Int):Builder

        fun build():CarComponent
    }

}