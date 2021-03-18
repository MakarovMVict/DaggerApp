package DaggerPack.Modules

import Model.Rims
import Model.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun providesRims(): Rims {
        return Rims()
    }
    @Provides
    fun getWheels(rims: Rims): Wheels {
        println("**get wheels module")
        return Wheels(rims)
    }
}