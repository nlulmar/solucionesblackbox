def rectangleHeight(actualWidth:Int, actualHeight: Int, newWidth: Int): Int = {
  //By similarity we can set up the proportions
  // AW/NW = AH/NH
  val aspectRatio: Double = actualHeight.toDouble/actualWidth.toDouble
  val newHeight: Int = (newWidth*aspectRatio).toInt
  newHeight
}

assert(rectangleHeight(1280,720,1920) == 1080)
assert(rectangleHeight(640,480,1024) == 768)
assert(rectangleHeight(4096,2160,8192) == 4320)