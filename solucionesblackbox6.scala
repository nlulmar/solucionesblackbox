val disco: List[(Int, String, Int)] = List((4, "Unicornio", 2), (3, "Pegasus", 6), (1, "Dragón", 3), (5, "Griffin", 4), (2, "Minotaur", 1), (6, "Quimera", 5))

def defragDisk(list: List[(Int, String, Int)]): List[(Int, String, Int)] = {
  val firstNodeId: Int = list.map(_._1).min
  val firstNode: List[(Int, String, Int)] = list.filter( _._1 ==firstNodeId)
  val discoWithoutFirst: List[(Int, String, Int)] = list.filter(_!=firstNode.head)

  val defraggedDisk = discoWithoutFirst.foldLeft(firstNode) { (acc, _) =>
    val nextNodeId: Int = acc.last._3
    val nextNode: (Int, String, Int) = discoWithoutFirst.filter(_._1 == nextNodeId).head
    acc:+nextNode
  }
  defraggedDisk
}

assert(defragDisk(disco) == List((1, "Dragón", 3), (3, "Pegasus", 6), (6, "Quimera", 5), (5, "Griffin", 4), (4, "Unicornio", 2), (2, "Minotaur", 1)), "No same list")
assert(defragDisk(disco).length == disco.length, "No same length")