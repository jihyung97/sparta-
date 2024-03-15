package com.example.kiosk

class MainWindow(listOfInfo:MutableList<String>,listOfPrice:MutableMap<String,Int>,
    listOfCalories:MutableMap<String,Int>, listOfPopular:MutableMap<String,Int>,listOfAmount:MutableMap<String,Int>) {

     var listOfInfo:MutableList<String>
     var listOfPrice:MutableMap<String,Int>
     var listOfCalories:MutableMap<String,Int>
     var listOfPopular:MutableMap<String,Int>
     var listOfAmount:MutableMap<String,Int> = mutableMapOf()
     var total:Int = 0
     var Input:Int = 0

    init{
        this.listOfInfo = listOfInfo
        this.listOfPrice = listOfPrice
        this.listOfCalories = listOfCalories
        this.listOfPopular = listOfPopular
        this.listOfAmount = listOfAmount

    }
    fun show() : Int {
        println("\n \n \n \n \n")
        println("--------------꼬꼬치떡에 오신 것을 환영합니다-------------------")
        println("               원하시는 메뉴를 선택해주세요                     ")
        println("1.치킨                  2.떡볶이                      3.음료수")
        println("^^^^^^^^^^^^^^^^ 지금까지 시키신 메뉴 목록^^^^^^^^^^^^^^^^^^^^^")
        for ((index,amount) in listOfAmount) {
            println("  ${index} ${amount}개를 시키셨습니다                     ")
        }
        println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
        println("$$$$$$$$$$$$$$$$$$$ 현재까지 총 금액 $$$$$$$$$$$$$$$$$$$$$$$$")
        total = 0
        for ((index,amount) in listOfAmount) {
            total += listOfAmount[index]!! * listOfPrice[index]!!

        }
        println("                     ${total}원입니다                       ")
        println("                          4.결제하기                        ")
        println("                     5.담았던 음식 취소하기                   ")
        println("                    6.처음으로 돌아가기(초기화)                ")
        println("                        0.전원끄기                          ")
        println("-----------------원하시는 번호를 선택해주세요-------------------")
        Input = readLine()!!.toInt()
        /*
        when(Input){
            1 -> Chicken.show
            2 -> RiceCake.show
            3 -> SetMenu.show
            4 -> {
                println("결제가 완료되었습니다")
                return }
            }
            */
         return(Input)
        }
    fun show_paying(){
        println("-------------------------------------------------------------------")
        println("                      결제수단을 입력해주세요                           ")
        println("    1. 카드          2.현금         3.카카오페이         4.삼성페이")
        var Input:Int = readLine()!!.toInt()
        when(Input){
            1 -> println("카드 결제가 완료되었습니다")
            2 -> println("사장님이 당신 몰래 맛있는 거를 소매넣기 할겁니다")
            3 -> println("카카오페이가 완료되었습니다. 사장님이 카카오톡이 있으신지는 모르겠네요")
            4 -> println("삼성페이로 결제하셨습니다. 애국자이시군요")
        }

    }

    fun cancle(){
        println("-------------------------------------------------------------------")
        println(" 변경할 항목을 입력해주세요")
        var idxOflistOfAmount:MutableMap<Int,String> = mutableMapOf()
        var count = 0
        var idx = 0
        var amount = 0
        for ((index,amount) in listOfAmount) {
            println("${++count}번 : ${index} ${listOfAmount[index]}개")
            idxOflistOfAmount[count] = index

        }
        println("------------------------------------------------------------------")
        println("           몇번을 바꿀지 입력해 주세요                                 ")
        idx = readLine()!!.toInt()
        println("------------------------------------------------------------------")
        println("                    바꿀 수량을 입력해주세요                          ")
        amount = readLine()!!.toInt()
        if (amount == 0)
            listOfAmount.remove(idxOflistOfAmount[idx])
        else
            listOfAmount.put(idxOflistOfAmount[idx]!!,amount)

    }
    }

