
import java.util.*

fun main() {
    println("¿Quieres jugar una partida de piedra, papel y tijera?")
    println("Elige 1 para SÍ jugar")
    println("Elige 2 para NO jugar")

    val elegir = Scanner(System.`in`) //pone el numero que quiera
    val decision: Int = elegir.nextInt()
    if (decision == 2) {
        println("Has decidido NO jugar")
    }
    else if (decision == 1){
        println("Has decidido jugar")
        println("Elige tu jugada")
        println("1. Piedra")
        println("2. Papel")
        println("3. Tijera")

        val elegirMano = Scanner(System.`in`)
        val jugadaElegida: Int = elegirMano.nextInt()
        val jugadorMano: Int = jugadaElegida

        val randomNumber: Int = (1..3).random()
        val jugadaOrdenador: Int = randomNumber

        if (jugadorMano == jugadaOrdenador) {
            println("El ordenador eligió lo mismo que tú.\n Es un EMPATE")
        }
        else if (jugadorMano == 1) {
            if (jugadaOrdenador == 2) {
                println("El ordenador eligió papel.\n Has perdido")
            } else if (jugadaOrdenador == 3) {
                println("\"El ordenador eligió tijera.\n Has ganado")
            }
        }
        else if (jugadorMano == 2) {
            if (jugadaOrdenador == 1) {
                println("Has ganado")
            } else if (jugadaOrdenador == 3) {
                println("Has perdido")
            }
        }
        else if (jugadorMano == 3) {
            if (jugadaOrdenador == 1) {
                        println("Has perdido")
            } else if (jugadaOrdenador == 2) {
                        println("Has ganado")
            }


        }
    }
}


