package com.example.kiosk

 open class Chicken(Price:Int,Infos:String,Calories:Int,Popular:Int) : Menu(Price,Infos,Calories,Popular){
     var inputc: Int = 0
     init {
         this.Price = Price
         this.Infos = Infos
         this.Calories = Calories

     }

    fun showChickenOption():Int{
        println("       1. 후라이드치킨          2.양념치킨            ")
        println("       0.메인화면으로 돌아가기                        ")
        println("--------------------------------------------------")
        inputc = readLine()!!.toInt()
        return(inputc)
    }
     fun Show_FriedChicken(){
         println("신선한 중국산 고추기름으로 1050도 화덕에서 바삭하게 튀겼습니다. 발암을 걱정하기 전에 우선 맛부터 봐야 하지 않을까요?")
     }
     fun Show_SauceChicken(){
         println("진한 이탈리아산 고추장과 제주산 데미그라스를 합친 풍미깊은 소스가 당신의 혀를 괴롭힐 것입니다")
     }

}