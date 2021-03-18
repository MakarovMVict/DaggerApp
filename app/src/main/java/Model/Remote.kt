package Model

import javax.inject.Inject

class Remote {
    lateinit var car:Car

    @Inject
    constructor(){

    }

    fun provideCar(car:Car){
        println("**providing car to remote")
        this.car=car
    }
}