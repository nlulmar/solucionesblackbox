# solucionesblackbox
Soluciones a los restos de la newsletter de Andros Fenollosa

## blackbox1
Filtrador de años

A partir de una secuencia con un listado de fechas en formato YYYY-MM-DD, filtra por el año indicado.

### Sintaxis: Python 3.9+

`def filtro_por_anyo(secuencia list[str], anyo: int) -> list[str]:
    Código
    return []
filtro_por_anyo(["2020-1-4", "2019-4-7", "2021-12-11", "2020-8-9"], 2020)
["2020-1-4", "2020-8-9"]`

## blackbox2
Un cubo de Rubik posé 6 colores, uno por cada cara. En total disponemos de 54 casillas, que están formadas por 6 caras por 9 casillas por cada cara (6 * 9 = 54 casillas).
El objetivo es crear una función que genere aleatoriamente un cubo de Rubik mezclado. Para ello construye una función que genere una lista de 54 posibles valores (6 * 9), con números aleatorios entre 0 y 5 (cada número representa un color).
¡Recuerda! Exactamente, debe existir 9 repeticiones de cada número.
Extra: Sustituye los números por emojis.

### Sintaxis: Python 3.9+
`def generar_cubo_rubik_aleatorio() -> list[int]:
Código
return []
generar_cubo_rubik_aleatorio()
 [3, 5, 0, 2, 1, 4, 5, 0, 1, 2, 4, 1, 2, 1, 3, 5, 5, 4, 1, 3, 5, 3, 2, 4, 3, 0, 0, 2, 2, 3, 5, 3, 0, 0, 1, 1, 2, 4, 4, 3, 5, 4, 3, 0, 5, 4, 1, 5, 1, 4, 0, 2, 2, 0]
`