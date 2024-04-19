package com.example.myapplication

fun main(){
    var count = 0
    val list : MutableList<String> = mutableListOf()

    var Snum1:String
    var num1:Int = 0 
    var func:String
    var Snum2 :String
    var num2:Int = 0
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
    nb = Calculator(num1,num2)
    num1 = nb.Input(list).toInt()
    func = nb.Input(list)
    num2 = nb.Input(list).toInt()

    res = Calculate(num1,num2,func)
    list.add("result ")
    list.add(res.toString())
    list.add("___________________")
    println(res)


    while(true){
        num1 = res
        list.add(num1.toString())
        func = nb.Input(list)
        if(func == "-1") {
            println("계산기를 종료합니다")
            break
        }
        else if(func == "show")
        {
            nb.Show(list,count)
        }

        num2 = nb.Input(list).toInt()
        res = Calculate(num1,num2,func)
        list.add("result ")
        list.add(res.toString())
        list.add("___________________")
        println(res)

    }

}

open class Calculator(_num1:Int, _num2:Int){
    var num1 = _num1
    var num2 = _num2
    open var result = 0

    fun Input(  list : MutableList<String>):String{
        var num :String = readLine()!!
        list.add(num)
        return num
    }

    fun Show(list : MutableList<String>, count:Int)
    {
        for (array in 0 until list.size - 2 ){
            println(list[array])
        }
    }
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


