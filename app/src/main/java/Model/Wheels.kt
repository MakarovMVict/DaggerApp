package Model

import androidx.core.graphics.rotationMatrix
import javax.inject.Inject

//class Wheels { //чтоб сбилдить без WheelsModule
//    @Inject
//    constructor(){
//
//    }
//}

class Wheels { //чтоб сбилдить без WheelsModule

    lateinit var rims:Rims

    constructor(rims:Rims){
        this.rims= rims
    }
}

