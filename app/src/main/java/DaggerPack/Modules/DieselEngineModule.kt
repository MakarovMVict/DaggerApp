package DaggerPack.Modules

import Model.DieselEngine
import Model.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun providesPetrolEngine(dieselengine: DieselEngine): Engine {
        return  dieselengine
    }
}