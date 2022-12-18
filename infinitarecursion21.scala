import scala.collection.mutable.{Map => MutableMap}

class Vitroceramica{
  private val fuegos: MutableMap[Int, (Boolean, Int)] = MutableMap(
    0 -> (false, 0),
    1 -> (false, 0),
    2 -> (false, 0)
  )

  def encender(fuego: Int): Unit = {
    if (fuegos(fuego-1)._1) println(s"el fuego $fuego ya está encendido")
    else {
      fuegos(fuego-1) = (true, 0)
      println(s"fuego $fuego encendigo")
    }
  }

  def apagar(fuego: Int): Unit = {
    if (fuegos(fuego-1)._1) {
      fuegos(fuego-1) = (false, 0)
      println(s"fuego $fuego apagado")
    }
    else println(s"el fuego $fuego ya está apagado")
  }

  def activar_temporizador(fuego: Int, segundos: Int): Unit = {
   if(fuegos(fuego-1)._1) {
     fuegos(fuego-1) = (true, segundos)
     println(s"temporizador activado para el fuego $fuego con $segundos segundos")
     Thread.sleep(segundos*1000)
     apagar(fuego)
   }
   else {
     println(s"fuego $fuego está apagado, se procede a encender")
     encender(fuego)
     activar_temporizador(fuego, segundos)
   }
  }

  def ver(): Unit = {
    val fuego1: Char = fuegos(0)._1 match {
      case true => 'o'
      case false => 'x'
    }
    val fuego2: Char = fuegos(1)._1 match {
      case true => 'o'
      case false => 'x'
    }
    val fuego3: Char = fuegos(2)._1 match {
      case true => 'o'
      case false => 'x'
    }

    println(s"---------")
    println(s"|-$fuego1-$fuego2-$fuego3-|")
    println(s"---------")
  }
}

val vitro = new Vitroceramica()
vitro.encender(1)
vitro.encender(2)
vitro.encender(3)
vitro.encender(3)
vitro.apagar(2)
vitro.apagar(2)
vitro.activar_temporizador(1,5)
vitro.activar_temporizador(2,5)
vitro.ver()
