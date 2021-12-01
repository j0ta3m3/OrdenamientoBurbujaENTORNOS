import javax.swing.JOptionPane

fun main() {
    var texto = JOptionPane.showInputDialog("Ingresa una serie de números separados por comas : ")
    var listaNumerosTexto = texto.split(",".toRegex()).toTypedArray()
    var cantidad = listaNumerosTexto.size
    var listaNumeros = IntArray(cantidad)
    for (i in (0 until cantidad)) {
        listaNumeros[i] = listaNumerosTexto[i].toInt()
    }
    var tem = 0
    for (i in (0 until cantidad - 1)) {
        for (j in (0 until cantidad - 1)) {
            if (listaNumeros[j] > listaNumeros[j + 1]) {
                tem = listaNumeros[j]
                listaNumeros[j] = listaNumeros[j + 1]
                listaNumeros[j + 1] = tem
            }
        }
    }
    println("Numeros ordenado de forma ascendente")
    for (i in (0 until cantidad)) {
        println(listaNumeros[i])
    }
    println("Numeros ordenados de forma descendente")
    for (i in (cantidad - 1 downTo 0)) {
        println(listaNumeros[i])
    }
}
