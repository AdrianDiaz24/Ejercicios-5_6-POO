open class Articulo(var nombre: String, var precio: Double) {

    companion object{

        var totalArticulos = 0

        fun generarId(): Int{
            return ++totalArticulos
        }

    }

    private val id = generarId()

    open fun promocionNavidad(descuento: Int): Boolean{
        precio -= (precio * (descuento.toDouble() / 100.0))
        return true
    }

    override fun toString(): String {
        return "$nombre - ${precio.redondear(2)}€ ID: $id"
    }

}