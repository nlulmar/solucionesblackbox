import scala.collection.mutable.ListBuffer

def deleteRepeated(list: List[Int]): List[Int] = {
  val newList = new ListBuffer[Int]

  list.foldLeft(newList)( (_,curr) => if( !newList.contains(curr) ) {
    newList += curr
  } else newList
  )
  newList.toList
}

assert(deleteRepeated(List(5, 2, 6, 5, 5, 6, 3, 1, 4, 2, 4)) == List(5, 2, 6, 3, 1, 4))
assert(deleteRepeated(List()) == List())