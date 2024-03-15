package com.example.kiosk

open class Beverage(Price:Int,Infos:String,Calories:Int,Popular:Int) : Menu(Price,Infos,Calories,Popular){

    var inputb:Int = 0
    fun showBeverageOption():Int{
        println("       1. 콜라     2.사이다       3.랜덤      ")
        println("       0.메인화면으로 돌아가기                        ")
        println("--------------------------------------------------")
        inputb = readLine()!!.toInt()
        return(inputb)
    }
    fun ShowCoke(){
        println("사장님의 공기압축비비탄총이 와이프에게 당근당할 위험에 처하자 가게로 빼돌렸습니다. " +
                "콜라에 탄산을 극한까지 넣어 손님들을 골탕먹이는데 사용됩니다.")
    }
    fun ShowCider(){
        println("방금 저희가게에 탈북민 출신 종업원이 있다고 했죠. 저희 종업원이 백두산에서 천연암반수도 공수했습니다." +
                "백두산천지 호수의 깊은 청정감을 느껴보세요 ")

    }
    fun ShowRandom(){
        println("항상 음료수가 시킨대로만 나와서 식상하고 도파민 자극이 안되지 않나요? 음료수 뽑기를 통해 당신의 운을" +
                "시험에 보세요. 운이 좋다면 엄청난 탄산이 당신의 위장과 장을 즐겁게 만들것입니다. 운이 나쁘다면 그냥 " +
                "평소대로 재미없게 마시는 거죠")
    }

}