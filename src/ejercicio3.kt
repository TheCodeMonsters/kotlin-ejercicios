/*
    Dado el valor de venta de un producto hallar el IGV y el precio de venta final. (IGV = 18%)
 */

fun main (args: Array<String>){

    val pStart = 100
    val igv = (0.18 * pStart)
    val pEnd = pStart - igv

    println("El igv es $pEnd")

}
