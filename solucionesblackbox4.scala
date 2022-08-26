def format_price(inputPrice: Either[Float, Int]): String = {
  val price = inputPrice.merge
  val priceClass = price.getClass.getSimpleName
  val finalPrice = priceClass match {
    case "Integer" => s"${price.toString}"
    case "Float" => "%.2f".format(price).replaceAll(",00", "")
  }
  finalPrice
}

assert(format_price(Right(8)) == "8")
assert(format_price(Left(1.0f)) == "1")
assert(format_price(Left(1.5f)) == "1,50")
assert(format_price(Left(2.03f)) == "2,03")
assert(format_price(Left(0.4567f)) == "0,46")