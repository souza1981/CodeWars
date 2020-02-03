class Accum {

    fun accum(s:String): String {
        var result = String()
        for (index in 0 until s.length){
            result += s[index].toString().capitalize().padEnd(index+1,s[index].toString().decapitalize()[0]) + "-"
        }
        return result.substring(0,result.length-1)
    }
}

fun main(args: Array<String>) {
    val accum = Accum()
    println(accum.accum("ZpglnRxqenU"))
}