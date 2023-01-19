def applyOperation(operation: String): Int => Int => Int = {
  def add(x: Int): Int => Int = (y: Int) => x + y
  def subs(x: Int): Int => Int = (y: Int) => x - y
  def mult(x: Int): Int => Int = (y: Int) => x * y
  def div(x: Int): Int => Int = (y: Int) => x / y

  operation match {
    case "add" => add
    case "subs" => subs
    case "mult" => mult
    case "div" => div
  }
}

val addition = applyOperation ("add")
val substraction = applyOperation("subs")
val multiplication = applyOperation("mult")
val division = applyOperation("div")

assert(addition(5)(4) == 9)
assert(substraction(10)(9) == 1)
assert(multiplication(5)(9) == 45)
assert(division(6)(3) == 2)