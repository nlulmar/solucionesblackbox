# solucionesblackbox
Soluciones a los retos de la newsletter de Andros Fenollosa

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

## blackbox3
Ocultando números sensibles
Crea una función que oculte los números de una tarjeta de crédito, salvo los 3 últimos dígitos. Deberías recibir siempre 16 dígitos y puede ser string o int.
Si la longitud no es válida, devolverás un False.
Algunos parámetros esperados.
``1234567890123456
"1234567890123456"
"1234 5678 9012 3456"
``
En todos los casos anteriores devolveremos:
``xxxxxxxxxxxxx456``
La siguiente estructura puede servirte de prototipo.

### Sintaxis: Python 3.9+
``def ocultar_numeros(numeros: str|int, char_hide: str = "x") -> str:
 Código
return ""``

## blackbox4
Formatea un precio
Crea una función para transformar un input en float o int a un formato familiar para leer un precio de un producto. Devolverá un string.
Ten cuidado porque debes aplicar diferentes arreglos. Por ejemplo, mostrar con una coma en lugar de un punto, solo mostrar 2 decimales si existen decimales, redondear si hay más de 2 decimales y quitar decimales si es un número entero (23.0 pasaría a ser 23).
### Sintaxis: Python 3.9+
``def formatear_precio(price: float|int) -> str:
 Código
return``

formatear_precio(8)

8

formatear_precio(1.0)

1

formatear_precio(1.5)

1,50

formatear_precio(2.03)

2,03

formatear_precio(0.4567)

0,46

## blackbox5
Contraseña segura
Crea una función que, a partir de una longitud, genere una contraseña aleatoria con los siguientes requisitos:

•	Un carácter, como mínimo, entre la A y Z. (Mayúsculas)

•	Un carácter, como mínimo, entre la a y z. (Minúsculas)

•	Un número, como mínimo, entre el 0 y 9.

•	Un carácter, como mínimo, a partir de: !@#$%^&*.

•	No puedes generar contraseñas inferiores a 4.

### Sintaxis: Python 3.9+
``def generar_contrasenya(longitud: int) -> str:
    # Código
    return``

generar_contrasenya(10)
 j27ugn@F%E

generar_contrasenya(6)
 a&3&zQ

generar_contrasenya(2)
 Xj6^