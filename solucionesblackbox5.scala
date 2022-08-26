import scala.annotation.tailrec
import scala.util.Random

def getRandomElement(list: Seq[Char], random: Random):Char = {
    list(random.nextInt(list.length))
}

@tailrec def generar_contrasenya(length: Int, password: String = ""): String = {
    val upperCaseChars: Seq[Char] = ('A' to 'Z').toList
    val lowerCaseChars: Seq[Char] = ('a' to 'z').toList
    val numberChars: Seq[Char] = ('0' to '9').toList
    val specialChars: Seq[Char] = "!@#$%^&*".toList

    val random = new Random()

    val mapChars = Map(
        0 -> getRandomElement(upperCaseChars, random),
        1 -> getRandomElement(lowerCaseChars, random),
        2 -> getRandomElement(numberChars, random),
        3 -> getRandomElement(specialChars, random),
    )

    val mapValues = mapChars.values.toList
    if (length <= 4 ) password.concat(random.shuffle(mapValues).mkString(""))
    else {
        val prevPassword: String = password.concat(getRandomElement(mapValues,random).toString)
        generar_contrasenya(length-1,prevPassword)
    }
}

assert(generar_contrasenya(10).length == 10)
assert(generar_contrasenya(6).length == 6)
assert(generar_contrasenya(4).length == 4)
assert(generar_contrasenya(2).length == 4)