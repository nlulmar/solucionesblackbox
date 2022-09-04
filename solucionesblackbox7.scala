//Solución "complicada"
val listOfColours = Map(
  10 -> "a",
  11 -> "b",
  12 -> "c",
  13 -> "d",
  14 -> "e",
  15 -> "f"
)

def getHex(num: Int): String = {
  val firstDiv = (Math.floor(num / 16).toInt, num % 16)
  val secondDiv = (Math.floor(firstDiv._1 / 16).toInt, firstDiv._1 % 16)
  val hex = (div: Tuple2[Int,Int]) => {
    div._2 match {
      case x if x < 10 => x.toString
      case _ => listOfColours(div._2)
    }
  }
  s"${hex(secondDiv)}${hex(firstDiv)}"
}

def rgbToHexHard(a: Int, b: Int, c: Int): String = {
  if(a>255 || a<0 || b>255 || b<0 || c>255 || c<0) throw new Exception("Parameters must be between 0 and 255")
  else {
    val channelList: Seq[Int] = List(a, b, c)
    s"#${channelList.map(getHex).mkString}"
  }
}

//Solución sencilla
def rgbToHexEasy(a: Int, b: Int, c: Int): String = f"#$a%02x$b%02x$c%02x"

assert(rgbToHexEasy(255,0,0) == "#ff0000")
assert(rgbToHexHard(255,0,0) == "#ff0000")
assert(rgbToHexEasy(82,31,130) == "#521f82")
assert(rgbToHexHard(82,31,130) == "#521f82")