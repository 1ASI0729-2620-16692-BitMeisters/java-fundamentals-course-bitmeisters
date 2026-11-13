# Lección 3: Operadores y expresiones

| | |
|---|---|
| **Duración** | 5 minutos |
| **Empieza a programar** | copia [`starter-files/leccion-03/Main.java`](../starter-files/leccion-03/Main.java) en el editor online (JDoodle) y pulsa **Execute** |
| **Solución** | [`completed-examples/leccion-03/Main.java`](../completed-examples/leccion-03/Main.java) |

## Qué vas a aprender

- Cómo hacer cálculos con los operadores `+`, `-`, `*`, `/` y `%`.
- Cómo comparar valores con `>`, `<`, `>=` y `==`.
- Cómo combinar condiciones con `&&` y `||`.

## Los cálculos: operadores aritméticos

En la lección anterior guardamos la ficha de Luna en variables. Ahora Luna recibe su primer golpe, y
necesitamos **calcular** su nueva vida.

| Operador | Qué hace | Ejemplo | Resultado |
|---|---|---|---|
| `+` | suma | `10 + 5` | `15` |
| `-` | resta | `100 - 30` | `70` |
| `*` | multiplica | `30 * 2` | `60` |
| `/` | divide | `250 / 100` | `2` |
| `%` | resto de la división | `250 % 100` | `50` |

Así recibe daño Luna:

```java
int vida = 100;
int danio = 30;

vida = vida - danio;      // ahora vida vale 70
int danioCritico = danio * 2;   // 60
```

Si `vida` vale 100 y `danio` vale 30, la línea `vida = vida - danio;` calcula `100 - 30` y guarda el
resultado `70` otra vez en `vida`.

## Subir de nivel con `/` y `%`

Cada 100 puntos de experiencia, Luna sube un nivel. Con 250 puntos:

```java
int nivelesGanados = experiencia / 100;       // 2 niveles
int experienciaSobrante = experiencia % 100;  // sobran 50 puntos
```

Cuando divides dos números `int`, Java descarta los decimales: `250 / 100` da `2`, no `2.5`. El resto
lo obtienes con `%`.

## Comparar: el resultado es verdadero o falso

Los operadores de comparación responden con un `boolean` (`true` o `false`):

| Operador | Significa |
|---|---|
| `>` | mayor que |
| `<` | menor que |
| `>=` | mayor o igual que |
| `==` | igual a |

```java
boolean sigueViva = vida > 0;    // true
boolean esNivelUno = nivel == 1; // false
```

Atención: `=` guarda un valor y `==` compara dos valores.

## Combinar condiciones: `&&` y `||`

- `&&` significa **y**: las dos condiciones deben cumplirse.
- `||` significa **o**: basta con que se cumpla una.

```java
boolean puedeEnfrentarJefe = nivel >= 3 && vida > 50;  // necesita las dos cosas
boolean necesitaCurarse = vida < 20 || nivel == 1;     // basta con una
```

## ⏸ Tu turno

Completa [`starter-files/leccion-03/Main.java`](../starter-files/leccion-03/Main.java): haz que Luna reciba
un golpe y uno crítico, gane 250 puntos de experiencia y suba de nivel. Después comprueba si sigue viva y
si puede enfrentar al jefe. Cambia los valores y vuelve a ejecutar para ver cómo cambian los resultados.

## Errores típicos

| Error | Qué pasa | Cómo se arregla |
|---|---|---|
| Escribir `nivel = 1` dentro de una comparación | `=` guarda un valor, no compara | usa `==` para comparar |
| Esperar `2.5` de `250 / 100` con números `int` | Java devuelve `2`, sin decimales | recuerda que `/` entre enteros da un entero; el resto está en `%` |
| Escribir un solo `&` o un solo `\|` | no son los operadores lógicos que necesitas | usa `&&` (y) o `\|\|` (o) |
| Escribir `vida - danio;` sin guardar el resultado | `vida` no cambia | escribe `vida = vida - danio;` |

## Resumen

- `+ - * / %` hacen cálculos; `/` entre enteros descarta los decimales y `%` da el resto.
- `>`, `<`, `>=` y `==` comparan y devuelven `true` o `false`.
- `&&` exige que se cumplan las dos condiciones y `||` que se cumpla al menos una.

**Siguiente:** [Lección 4: Decisiones y bucles: if-else, for y while](leccion-04.md) — Luna ya sabe
calcular; ahora aprende a decidir y a repetir acciones en un combate.