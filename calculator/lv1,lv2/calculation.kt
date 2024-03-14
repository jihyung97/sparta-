package com.example.myapplication

fun main(){

    var num1 = readLine()!!.toInt()
    var func = readLine()!!
    var num2 = readLine()!!.toInt()
    var result = 0
    var Activate = Calculator()

    result = Activate.Calculate(num1,num2,func)
    println(result)

    while(true){
        num1 = result
        func = readLine()!!
        if(func == "-1") {
            println("계산기를 종료합니다")
            break
        }
        num2 = readLine()!!.toInt()
        result = Activate.Calculate(num1,num2,func)
        println(result)
    }

}
