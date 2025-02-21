import java.math.RoundingMode


fun main(){
    val articulo1 = Articulo("Secador", 25.0)
    val articulo2 = Articulo("Batidora", 45.0)
    val ordenador1 = Ordenador("PCom Gold", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("HP 1400", 399.99)
    val articulos = listOf<Articulo>(articulo1, articulo2, ordenador1, ordenador2)

    for (articulo in articulos){
        var i = 1
        println("Articulo $i")
        println(articulo)
        articulo.promocionNavidad(50)
        println(articulo)
        i++
    }
}


fun Double.redondear(decimales: Int): Double{
    return this.toBigDecimal().setScale(decimales, RoundingMode.HALF_UP).toDouble()
}