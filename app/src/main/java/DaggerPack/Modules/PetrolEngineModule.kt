package DaggerPack.Modules

import Model.Engine
import Model.PetrolEngine
import dagger.Module
import dagger.Provides

//@Module  только если 1 модуль с классом, у которого интерфейс,реализуемый во многих классах
//class PetrolEngineModule {
//
//    @Provides
//    fun providesPetrolEngine(petrolengine:PetrolEngine):Engine{
//        return  petrolengine
//    }
//}

//@Module
//abstract class PetrolEngineModule {
//
//    @Binds
//    abstract fun providesPetrolEngine(petrolengine:PetrolEngine):Engine
//
//}

@Module
 class PetrolEngineModule {

//    var powerCapatity:Int  //если использовать @Component.builder , то это всё не нужно
//
//    constructor(powerCapatity: Int) {
//        this.powerCapatity = powerCapatity
//    }


//    @Provides  //не нужно если использовать @Named("имя аргумента")
//     fun providesPetrolEngine(powerCapacity:Int,engineCapacity:Int):Engine{
//         return PetrolEngine(powerCapacity,engineCapacity)
//     }

        @Provides  //не нужно если использовать @Named("имя аргумента")
     fun providesPetrolEngine(petrolEngine: PetrolEngine): Engine {
         return petrolEngine
     }

}