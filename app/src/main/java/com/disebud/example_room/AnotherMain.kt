package com.disebud.example_room

fun main(){



//    val terios = Car("Terios","Daihatsu")
    val terios = Car.getSingleCar()
    val lancer = Car.getSingleCar()
    val toyota = Car.getSingleCar()

    println(terios)
    println(lancer)
    println(toyota)
//    println(terios.brand)

}

class Car(var  name: String, var brand: String){

    companion object{
        private var SINGLE_CAR: Car? = null

        fun getSingleCar(): Car?{

            if (SINGLE_CAR!=null) return SINGLE_CAR
            // jika kosong
            SINGLE_CAR = Car("","")
            return SINGLE_CAR

        }

    }
}

//var PENUMPANG = "ANGGA"
//fun cetakPenumpang(){
//    println(PENUMPANG)
//}