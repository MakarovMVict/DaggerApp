package Model

import javax.inject.Inject

class DieselEngine:Engine {

    @Inject
    constructor(){

    }

    override fun start() {
        println("**DieselEngine start!!!")
    }
}