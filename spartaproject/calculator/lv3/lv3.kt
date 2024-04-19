package com.example.myapplication


fun main(){

    var num1 = readLine()!!.toInt()
    var func = readLine()!!
    var num2 = readLine()!!.toInt()
    var nb:Calculator
    var res:Int = 0

    fun Calculate(num1:Int,num2:Int,func:String) : Int{
        when(func){

            "+" -> {

                nb = AddOperation(num1 , num2 )
                return nb.result
            }
            "-" -> {
                nb = SubstractOperation(num1 , num2)
                return nb.result
            }
            "*" -> {
                nb = MultiplyOperation(num1 , num2)
                return nb.result
            }
            "/" -> {
                nb = DivideOperation(num1 , num2)
                return nb.result
            }
        }
        return 0
    }

    res = Calculate(num1,num2,func)
    println(res)

    while(true){
        num1 = res
        func = readLine()!!
        if(func == "-1") {
            println("계산기를 종료합니다")
            break
        }
        num2 = readLine()!!.toInt()
        res = Calculate(num1,num2,func)
        println(res)
    }

}

    open class Calculator(_num1:Int, _num2:Int){
        var num1 = _num1
        var num2 = _num2
        open var result = 0

    }

    class AddOperation(_num1:Int, _num2:Int) : Calculator(_num1,_num2) {
       override var result = num1 + num2
    }

    class SubstractOperation(_num1:Int, _num2:Int) : Calculator(_num1,_num2) {
        override var result = num1 - num2
    }

    class MultiplyOperation(_num1:Int, _num2:Int) : Calculator(_num1,_num2)
    {
       override var result = _num1 * _num2
    }

    class DivideOperation(_num1:Int, _num2:Int) : Calculator(_num1,_num2)
    {
        override var result = _num1 / _num2
    }




