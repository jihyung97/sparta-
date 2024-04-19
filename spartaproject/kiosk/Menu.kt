package com.example.kiosk

open class Menu(Price:Int,Infos:String,Calories:Int,Popular:Int) {
    var Price:Int
    var Infos:String
    var Calories:Int
    var Popular:Int
    var Input:Int = 0
    init{
        this.Price=Price
        this.Infos=Infos
        this.Calories=Calories
        this.Popular=Popular
    }
    fun show_first() {
        println("----------------${Infos}----------------------")
        println("              옵션을 선택하세요                  ")

    }
    fun show_last():Int{
        println("              번호를 입력해주세요                 ")
        Input = readLine()!!.toInt()
        return(Input)
    }
    fun showInfo() {
        println("                가격:${Price}                   ")
        println("              칼로리:${Calories}                ")
        println("              인기도:${Popular}                ")

    }
    fun show_amount():Int{
        println("              수량을 입력해주세요                  ")
        Input = readLine()!!.toInt()
        return(Input)
    }
}