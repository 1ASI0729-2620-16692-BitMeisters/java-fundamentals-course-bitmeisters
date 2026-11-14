# Lección 4: Decisiones y bucles: if-else, for y while

| | |
|---|---|
| **Duración** | 8 minutos |
| **Empieza a programar** | copia [`starter-files/leccion-04/Main.java`](../starter-files/leccion-04/Main.java) en el editor online (JDoodle) y pulsa **Execute** |
| **Solución** | [`completed-examples/leccion-04/Main.java`](../completed-examples/leccion-04/Main.java) |

## Qué vas a aprender

- Cómo tomar decisiones con `if`, `else if` y `else`.
- Cómo repetir algo un número fijo de veces con `for`.
- Cómo repetir mientras se cumpla una condición con `while`.

## Decidir con `if`, `else if` y `else`

Un programa puede elegir qué hacer según una condición. Es como decir: «si Luna tiene mucha vida, está
bien; si no, está herida; y si tiene muy poca, está en peligro».

```java
if (vida > 60) {
    System.out.println(nombre + " está en buena forma.");
} else if (vida > 30) {
    System.out.println(nombre + " está herida.");
} else {
    System.out.println(nombre + " está en peligro.");
}
```

Java revisa las condiciones de arriba abajo y ejecuta **solo el primer bloque** que se cumple. Con
`vida = 45`, la primera condición (`45 > 60`) es falsa y la segunda (`45 > 30`) es verdadera, así que
muestra «está herida».

## Repetir un número fijo de veces con `for`

Para repetir algo 3 veces, como tres rondas de entrenamiento:

```java
for (int ronda = 1; ronda <= 3; ronda++) {
    experiencia = experiencia + 40;
    System.out.println("Ronda " + ronda + " de entrenamiento. Experiencia: " + experiencia);
}
```

El `for` tiene tres partes entre paréntesis:

| Parte | En el ejemplo | Qué significa |
|---|---|---|
| Inicio | `int ronda = 1` | empieza contando desde 1 |
| Condición | `ronda <= 3` | sigue repitiendo mientras sea verdadera |
| Paso | `ronda++` | suma 1 a `ronda` después de cada vuelta |

`ronda++` es una forma corta de escribir `ronda = ronda + 1`.

## Repetir mientras se cumpla una condición con `while`

No siempre sabemos cuántas veces hay que repetir. En un combate, se sigue peleando **mientras** los dos
estén vivos:

```java
int vidaDragon = 100;
int turno = 1;

while (vida > 0 && vidaDragon > 0) {
    vidaDragon = vidaDragon - 25;
    System.out.println("Turno " + turno + ": Luna ataca. Vida del dragón: " + vidaDragon);

    if (vidaDragon > 0) {
        vida = vida - 20;
        System.out.println("Turno " + turno + ": el dragón ataca. Vida de Luna: " + vida);
    }

    turno++;
}
```

Fíjate en dos detalles:

- La condición usa `&&` (lección 3): el combate sigue solo si **los dos** tienen vida.
- Dentro del `while` hay un `if`: el dragón solo ataca si todavía está vivo.

Al terminar el bucle, un último `if` / `else` muestra si Luna ganó o perdió.

## ⏸ Tu turno

Completa [`starter-files/leccion-04/Main.java`](../starter-files/leccion-04/Main.java) siguiendo los cinco
pasos. Después cambia el daño de Luna (25) o el del dragón (20) y observa cuántos turnos dura el combate
y quién gana.

## Errores típicos

| Error | Qué pasa | Cómo se arregla |
|---|---|---|
| Olvidar `turno++` o no cambiar nunca la vida dentro del `while` | la condición nunca se vuelve falsa y el programa se repite sin parar (bucle infinito) | asegúrate de que dentro del bucle algo cambie y acerque la condición a `false` |
| Escribir `if (vida = 60)` | `=` guarda, no compara | usa `==` para comparar |
| Escribir `for (int i = 1; i <= 3; i++);` con `;` al final | el `for` no ejecuta tu bloque | quita el `;` y abre las llaves `{ }` |
| Poner las condiciones del `if` en orden equivocado | Java ejecuta el primer bloque que se cumple y los demás nunca se revisan | empieza por la condición más exigente (`vida > 60`) y baja |

## Resumen

- `if`, `else if` y `else` eligen qué bloque ejecutar según una condición.
- `for` repite un número fijo de veces; `while` repite mientras la condición sea verdadera.
- Dentro de un bucle debe cambiar algo para que, tarde o temprano, el bucle termine.

**Siguiente:** [Lección 5: Métodos y parámetros](leccion-05.md) — ordenamos el código en acciones
reutilizables como atacar, curar y mostrar el estado.
