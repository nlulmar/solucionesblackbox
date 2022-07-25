def filtroPorAnyo (secuencia: List[String], anyo: Int): List[String] = secuencia.filter(_.take(4) == anyo.toString)

val secuencia = List("2020-1-4", "2019-4-7", "2021-12-11", "2020-8-9")
val anyo = 2020

assert(filtroPorAnyo(secuencia,anyo) == List("2020-1-4", "2020-8-9"))