def average(xs: List[Int]):Double = xs.reduce((a,b)=>a+b).toDouble / xs.length

val list: List[Int] = List(2,4,6,9)
lazy val average: Double = average(list)

println(average)