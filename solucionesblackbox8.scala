def isMagicSquare(square: List[List[Int]]): Boolean = {

  def sumsAreEquals(sums: List[Int]): Boolean = {
    sums.toSet.size.equals(1)
  }

  def sumAll(sums: List[Int]): Int =  {
    sums.toSet.sum
  }

  val numCols: Set[Int] = square.map(_.size).toSet
  val isSquare: Boolean = if( numCols.size.equals(1) && square.size.equals(numCols.head ) ) true
  else
    false

  if (isSquare) {
    val rowsSum: List[Int] = square.map(_.sum)
    val rowsSumEquals: Boolean = sumsAreEquals(rowsSum)

    val columnIndex: List[Int] = square.indices.toList
    val colsSum: List[Int] = columnIndex.map(index =>
      square.map(row => row(index)).sum
    )
    val colsSumEquals: Boolean = sumsAreEquals(colsSum)

    val obliqueSum: Int = columnIndex.map(index => square(index)(index)).sum

    rowsSumEquals && colsSumEquals && sumAll(rowsSum) == obliqueSum
  }
  else false
}

assert(isMagicSquare(List(List(8, 1, 6), List(3, 5, 7), List(4, 9, 2))))
assert(isMagicSquare(List(List(18, 23, 16), List(17, 19, 21), List(22, 15, 20))))
assert(!isMagicSquare(List(List(-2, 5, 3), List(0, 9 , 7), List(6, 4, 1))))
assert(isMagicSquare(List(List(16, 3, 2, 13), List(5, 10, 11, 8), List(9, 6, 7, 12), List(4, 15, 14, 1))))
assert(!isMagicSquare(List(List(1,2), List(1,2,3), List(1,2))))