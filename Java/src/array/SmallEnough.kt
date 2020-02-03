class SmallEnough {

    fun smallEnough(a: IntArray, limit: Int): Boolean {
        return a.all { it <= limit }
    }

    fun main() {
        val smallEnough = SmallEnough()
        val resultado = smallEnough.smallEnough(intArrayOf(66, 101), 200)
        println("O resultado é $resultado")
    }

}

