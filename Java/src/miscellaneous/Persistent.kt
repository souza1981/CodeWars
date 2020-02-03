import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalTime
import java.util.*

class Persistent {
    fun persistence(num: Int) : Int {
        var value = num
        var tentativas = 0
        while (value.toString().length > 1){
            tentativas++
            var aux = 1
            for (digito in value.toString().toCharArray()){
                aux *= digito.toString().toInt()
            }
            value = aux
        }
        return tentativas
    }
}

fun main(args: Array<String>) {

/*
    var persistent = Persistent()
    println(persistent.persistence(39))
    println(persistent.persistence(4))
    println(persistent.persistence(25))
    println(persistent.persistence(999))
*/




}