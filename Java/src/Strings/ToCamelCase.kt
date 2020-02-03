package Strings

class ToCamelCase {
    fun toCamelCase(str:String):String = if (str.length == 0) "" else
            str
            .replace("_","###")
            .replace("-","###")
            .split("###")
            .get(0) + str
                    .replace("_","###")
                    .replace("-","###")
                    .split("###")
                    .subList(1,str
                            .replace("_","###")
                            .replace("-","###")
                            .split("###").size).joinToString ("") { it.capitalize() }





}
fun main(args: Array<String>) {
    val toCamelCase = ToCamelCase()
    var retorno = toCamelCase.toCamelCase("");
    println("Retorno 1: $retorno")

    retorno = toCamelCase.toCamelCase("the_stealth_warrior")
    println("Retorno 2: $retorno")

    retorno = toCamelCase.toCamelCase("The-Stealth-Warrior")

    println("Retorno 3: $retorno")

    retorno = toCamelCase.toCamelCase("A-B-C")

    println("Retorno 4: $retorno")

}

