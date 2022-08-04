import scala.util.Random

def generarCuboRubikAleatorio():List[Int] = {
  val cuboRubikList: List[Int] = List.fill(9)((0 to 5).toList).flatten
  Random.shuffle(cuboRubikList)
}

assert(generarCuboRubikAleatorio().length == 54)
assert(generarCuboRubikAleatorio().count(_==0) == 9)
assert(generarCuboRubikAleatorio().count(_==1) == 9)
assert(generarCuboRubikAleatorio().count(_==2) == 9)
assert(generarCuboRubikAleatorio().count(_==3) == 9)
assert(generarCuboRubikAleatorio().count(_==4) == 9)
assert(generarCuboRubikAleatorio().count(_==5) == 9)