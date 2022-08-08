def ocultar_numeros(numeros: Either[String, Long], char_ocultar: String, visible_chars: Int): String = {

  val numerosString = numeros.merge.toString.trim
  val numerosRegex = "\\d{16}|\\d{4}[- ]\\d{4}[- ]\\d{4}[- ]\\d{4}"

  if (numerosString.matches(numerosRegex)) {
    val visibleChars = numerosString.takeRight(visible_chars)
    char_ocultar.repeat(16-visible_chars).concat(visibleChars)
  } else {
    "False"
  }
}

assert(ocultar_numeros(Left("12345678"), "x", 3) == "False", "Test 1 failed")
assert(ocultar_numeros(Left("1234123412341234"), "x", 3) == "xxxxxxxxxxxxx234", "Test 2 failed")
assert(ocultar_numeros(Left("1234-1234-1234-1234"), "x", 3) == "xxxxxxxxxxxxx234", "Test 3 failed")
assert(ocultar_numeros(Left("1234 1234 1234 1234"), "x", 3) == "xxxxxxxxxxxxx234", "Test 4 failed")
assert(ocultar_numeros(Left("    1234 1234 1234 1234    "), "x", 3) == "xxxxxxxxxxxxx234", "Test 5 failed")
assert(ocultar_numeros(Right(12345678), "x", 3) == "False", "Test 6 failed")
assert(ocultar_numeros(Right(1234123412341234L), "x", 3) == "xxxxxxxxxxxxx234", "Test 7 failed")