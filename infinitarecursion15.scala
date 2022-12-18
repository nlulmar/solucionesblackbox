//Eres libre de nombrar el archivo donde se almacenará el contenido. No obstante, te voy a sugerir test.fiabledb.
//  fichero = "test.fiabledb"
//
//datos = [
//{
//  "id": 1,
//  "value": {"nombre": "Blanca", "edad": 34},
//  "version": 0
//},
//{
//  "id": 2,
//  "value": {"nombre": "Juan", "edad": 22},
//  "version": 0
//}
//]
//
//def guardar_a_disco(datos: list[dic[int, dic, int]], fichero: str) -> bool:
//  pass
//
//def recuperar_de_disco(fichero: str) -> list[dic[int, dic, int]]:
//pass

val file = "test.fiabledb"

val data: List[Map[String, Any]] = List(
  Map(
    "id" -> 1,
    "value" -> Map(
      "nombre" -> "Blanca",
      "edad" -> 34),
    "version" -> 0
  ),
  Map(
    "id" -> 2,
    "value" -> Map(
      "nombre" -> "Juan",
      "edad" -> 22),
    "version" -> 0
  )
)

def saveToDisk(data: List[Map[String , Any]]): Boolean = {
  true
}