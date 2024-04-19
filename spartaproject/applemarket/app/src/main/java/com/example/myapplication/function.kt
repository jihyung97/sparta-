package com.example.myapplication

interface function {
    fun makePrice(price:String) :String{
        val priceLen = price.length
        var divide = priceLen % 3
        var newPrice:String = ""

        for (x in 1 .. priceLen)
        {
            newPrice = String.format("%s%c", newPrice, price[x - 1])
            if ((x == divide || (x - divide) % 3 == 0) && x != priceLen){
                newPrice = String.format("%s%c", newPrice, ',')
            }
        }
        newPrice = String.format("%s%c", newPrice, '원')
        return(newPrice)
    }
}