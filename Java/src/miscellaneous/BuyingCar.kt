import kotlin.math.roundToInt

class BuyingCar {
    fun nbMonths(
            startPriceOld: Int,
            startPriceNew: Int,
            savingperMonth: Int,
            percentLossByMonth: Double
    ): Pair<Int, Int> {
        // your code
        if (startPriceOld >= startPriceNew) return Pair(0,startPriceOld-startPriceNew)

        var month = 0
        var actualPercentLoss = percentLossByMonth
        var actualPriceOld = startPriceOld.toDouble()
        var actualPriceNew = startPriceNew.toDouble()
        var savedMoney = 0
        var saldo = 0.0
        while (saldo <= 0){
            month++
            savedMoney += savingperMonth
            if (month%2 == 0) actualPercentLoss+=0.5
            actualPriceOld = (actualPriceOld * (100-actualPercentLoss)/100)
            actualPriceNew = (actualPriceNew * (100-actualPercentLoss)/100)
            saldo = (actualPriceOld + savedMoney) - actualPriceNew
        }
        return Pair(month,saldo.roundToInt())
    }
}

fun main(args: Array<String>) {
    var buyCar = BuyingCar()
    val actual = buyCar.nbMonths(18000, 32000, 1500, 1.25)
    println(actual)
}
