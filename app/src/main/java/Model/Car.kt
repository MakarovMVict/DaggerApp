package Model

import dagger.Provides
import javax.inject.Inject


class Car {

    @Inject
    lateinit var wheels:Wheels//не надо создавать инстансы
    lateinit var engine:Engine
    lateinit var driver:Driver



    //    @Inject
//    constructor(wheels:Wheels,engine:Engine){
//        this.wheels=wheels
//        this.engine=engine
//    }
@Inject
    constructor(engine: Engine, driver: Driver) {
        this.engine = engine
        this.driver = driver
    }


    @Inject
    fun provideCarToRemote(remote:Remote){
        remote.provideCar(this)
    }

    fun start(){
        println("**driver is $driver")
        println("**wheels $wheels")
        engine.start()
        println("**start driving!!!!!")
    }
}