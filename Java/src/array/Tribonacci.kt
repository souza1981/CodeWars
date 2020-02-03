import kotlin.math.absoluteValue

class Tribonacci {
    fun tribonacci(signature : DoubleArray, n:Int) : DoubleArray{
        if (n==0) return doubleArrayOf()
        var resultado = mutableListOf<Double>()

        var i = 0
        while (i < n){
            if (i <= 2){
                resultado.add(i, signature[i])
            } else {

               resultado.add(i,(resultado[i-1].plus(resultado[i-2]).plus(resultado[i-3]).absoluteValue))
            }
            i++
        }
        return resultado.toDoubleArray()
    }
}

fun main() {

    val tribonacci = Tribonacci()

    println(tribonacci.tribonacci(doubleArrayOf(1.0,1.0,1.0),20).joinToString(","))
}