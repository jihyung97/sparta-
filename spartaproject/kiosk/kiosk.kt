package com.example.kiosk

fun main() {
    var listOfInfo: MutableList<String> = mutableListOf("양념치킨", "후라이드치킨", "순한떡볶이","보통떡볶이","매운떡볶이","콜라","사이다","랜덤")
    var listOfPrice: MutableMap<String, Int> =
        mutableMapOf("양념치킨" to 15000, "후라이드치킨" to 14000, "순한떡볶이" to 5000, "보통떡볶이" to 5200, "매운떡볶이" to 5500,"콜라" to 2000, "사이다" to 2000, "랜덤" to 2000)
    var listOfCalories: MutableMap<String, Int> =
        mutableMapOf("양념치킨" to 2300, "후라이드치킨" to 2100, "순한떡볶이" to 870, "보통떡볶이" to 800, "매운떡볶이" to 700,"콜라" to 200, "사이다" to 200, "랜덤" to 777)
    var listOfPopular: MutableMap<String, Int> =
        mutableMapOf("양념치킨" to 100, "후라이드치킨" to 95, "순한떡볶이" to 50, "보통떡볶이" to 90, "매운떡볶이" to 70,"콜라" to 90, "사이다" to 70, "랜덤" to 100)
    var listOfAmount:MutableMap<String,Int> = mutableMapOf()

   var mainwindow = MainWindow(listOfInfo,listOfPrice, listOfCalories, listOfPopular, listOfAmount )
    var chicken = Chicken(0,"",0,0)
    var friedchicken = Chicken(listOfPrice["후라이드치킨"]!!,"후라이드치킨",listOfCalories["후라이드치킨"]!!,listOfPopular["후라이드치킨"]!!)
    var saucechicken = Chicken(listOfPrice["양념치킨"]!!,"양념치킨",listOfCalories["양념치킨"]!!,listOfPopular["양념치킨"]!!)
    var ricecake = RiceCake(0,"",0,0)
    var mildricecake = RiceCake(listOfPrice["순한떡볶이"]!!,"순한떡볶이",listOfCalories["순한떡볶이"]!!,listOfPopular["순한떡볶이"]!!)
    var middlericecake = RiceCake(listOfPrice["보통떡볶이"]!!,"보통떡볶이",listOfCalories["보통떡볶이"]!!,listOfPopular["보통떡볶이"]!!)
    var hotricecake = RiceCake(listOfPrice["매운떡볶이"]!!,"매운떡볶이",listOfCalories["매운떡볶이"]!!,listOfPopular["매운떡볶이"]!!)
    var beverage = Beverage(0,"",0,0)
    var coke = Beverage(listOfPrice["콜라"]!!,"콜라",listOfCalories["콜라"]!!,listOfPopular["콜라"]!!)
    var cider = Beverage(listOfPrice["사이다"]!!,"사이다",listOfCalories["사이다"]!!,listOfPopular["사이다"]!!)
    var random = Beverage(listOfPrice["랜덤"]!!,"랜덤",listOfCalories["랜덤"]!!,listOfPopular["랜덤"]!!)
    while(true){
        when(mainwindow.show()){
            1 -> {
                    chicken.show_first();
                    when(chicken.showChickenOption()){
                      0 -> continue
                      1 -> {
                          friedchicken.Show_FriedChicken()
                          friedchicken.showInfo()
                           listOfAmount["후라이드치킨"] = friedchicken.show_amount()

                     }
                      2 -> {
                         saucechicken.Show_SauceChicken()
                          saucechicken.showInfo()
                         listOfAmount["양념치킨"] = saucechicken.show_amount()
                      }
                    }
                    continue
                    }
            2 -> {
                ricecake.show_first();
                when(ricecake.showRiceCakeOption()){
                    0 -> continue
                    1 -> {
                        mildricecake.ShowMildRiceCake()
                        mildricecake.showInfo()
                        listOfAmount["순한떡볶이"] = mildricecake.show_amount()
                    }
                    2 -> {
                        middlericecake.ShowMiddleRiceCake()
                        middlericecake.showInfo()
                        listOfAmount["보통떡볶이"] = middlericecake.show_amount()
                    }
                    3 -> {
                        hotricecake.ShowHotRiceCake()
                        hotricecake.showInfo()
                        listOfAmount["매운떡볶이"] = hotricecake.show_amount()
                    }
                    }
                continue
                }




            3 -> {
                beverage.show_first()
                when(beverage.showBeverageOption()){
                    0 -> continue
                    1 -> {
                        coke.ShowCoke()
                        coke.showInfo()
                        listOfAmount["콜라"] = coke.show_amount()
                    }
                    2 -> {
                        cider.ShowCider()
                        cider.showInfo()
                        listOfAmount["사이다"] = cider.show_amount()
                    }
                    3 -> {
                        random.ShowRandom()
                        listOfAmount["랜덤"] = random.show_amount()
                    }
                }
                continue


            }

            4 -> {
                mainwindow.show_paying()
                continue
            }

            5 -> {
                mainwindow.cancle()
            }

            6 -> {
                listOfAmount.clear()
                continue
            }

            0 -> break


        }
    }
    return


}

