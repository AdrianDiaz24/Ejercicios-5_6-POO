class Ordenador(nombre: String, precio: Double, tipo: TipoOrdenador = TipoOrdenador.BASICO): Articulo(nombre, precio) {

    override fun promocionNavidad(descuento: Int): Boolean {
        if (precio > 500){
            precio -= (precio * (descuento.toDouble() / 100.0))
            return true
        } else {
            return false
        }
    }


}