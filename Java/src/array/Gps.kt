class Gps {
    fun gps(s:Int, x:DoubleArray):Int {
        var maiorVelocidade = 0.0
        var anterior = 0.0
        var velocidade: Double
        x.forEach {
            velocidade = (3600 * (it - anterior)) / s
            if (velocidade > maiorVelocidade) maiorVelocidade = velocidade
            anterior = it
        }
        return maiorVelocidade.toInt()
    }
}