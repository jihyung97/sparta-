package com.example.kiosk


open class RiceCake(Price:Int,Infos:String,Calories:Int,Popular:Int) : Menu(Price,Infos,Calories,Popular){

    var inputr:Int = 0
    fun showRiceCakeOption():Int{
        println("       1. 순한맛     2.보통맛        3.매운맛        ")
        println("       0.메인화면으로 돌아가기                        ")
        println("--------------------------------------------------")
        inputr = readLine()!!.toInt()
        return(inputr)
    }
    fun ShowMildRiceCake(){
        println("방금 태어난 아기에게 이유식에 넣어 먹여도 맛있게 먹을 만큼 순합니다. ")
    }
    fun ShowMiddleRiceCake(){
        println("맵부심의 나라 대한민국에서 이걸 먹고 얼굴이 빨개지실 것 같으면 직원에게 윙크를 해주세요.")
        println("당장 히터를 최대로 틀어 더워서 그런 척 해드리죠.")
    }
    fun ShowHotRiceCake(){
        println("저희 탈북민 출신 종업원이 탈북전 폭발직전인 백두산 꼭대기에서 채취한 용암으로 만들었습니다." +
                "그렇기 때문에 이것을 먹고 얼굴이 화산이 된다고 해서 부끄러워 할 필요는 없습니다.")
    }

}