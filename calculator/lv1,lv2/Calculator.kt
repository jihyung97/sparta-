package com.example.myapplication

class Calculator {

    constructor()


    fun Calculate(p: Int, q: Int, middle:String): Int {
        when (middle) {
            "+" -> return p + q
            "-" -> return p - q
            "*" -> return p * q
            "/" -> return p / q
        }
        return 0

    }


}

