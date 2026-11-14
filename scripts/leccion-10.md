# Lección 10: Programa completo, buenas prácticas y errores comunes

| | |
|---|---|
| **Duración** | 8 minutos |
| **Empieza a programar** | copia [`starter-files/leccion-10/Main.java`](../starter-files/leccion-10/Main.java) en el editor online (OnlineGDB) y pulsa **Run** |
| **Solución** | [`completed-examples/leccion-10/Main.java`](../completed-examples/leccion-10/Main.java) |

## Qué vas a aprender

- Cómo juntar clases, métodos, bucles, decisiones y `Scanner` en un solo programa.
- Cuatro buenas prácticas para escribir código claro.
- Los errores más comunes de todo el curso.

## El plan del combate

Llegó el momento de juntar todo lo que aprendiste. El programa final es un **combate por turnos**
entre tu héroe y el dragón:

1. Pedir el nombre y el nivel del héroe.
2. Crear al héroe y al dragón.
3. Repetir, mientras los dos estén vivos: mostrar el estado, elegir una acción, el héroe actúa y el
   dragón contraataca.
4. Mostrar quién ganó.

Cada parte usa algo que ya conoces:

| Parte del programa | Lección |
|---|---|
| `while` para repetir turnos y `if / else if / else` para elegir la acción | 4 |
| Métodos como `atacar`, `curar` y `mostrarMenu` | 5 |
| `Scanner` para leer el nombre, el nivel y la opción | 6 |
| La clase `Personaje`, los objetos y el constructor | 7 |
| `private`, `getVida()` y `setVida()` para proteger la vida | 8 |

## Paso 1: la clase `Personaje`

Es la clase de la lección 8, con tres métodos nuevos que hacen el código del combate más fácil de leer:

```java
boolean estaVivo() {
    return vida > 0;
}

int calcularDanio() {
    return 10 + nivel * 5;
}

void atacar(Personaje objetivo) {
    int danio = calcularDanio();
    objetivo.recibirDanio(danio);
    System.out.println(nombre + " ataca y hace " + danio + " de daño a " + objetivo.nombre + ".");
}
```

Un personaje con más nivel hace más daño. Además, `curar(int cantidad)` suma vida y `mostrarEstado()` muestra el
nombre, la vida y el nivel en una sola línea.

## Paso 2: leer los datos del jugador

```java
Scanner teclado = new Scanner(System.in);

System.out.print("Escribe el nombre de tu héroe: ");
String nombre = teclado.nextLine();

int nivel = 0;
while (nivel < 1 || nivel > 5) {
    System.out.print("Elige el nivel de " + nombre + " (1 a 5): ");
    nivel = teclado.nextInt();
}
```

El `while` repite la pregunta hasta que el nivel sea un número entre 1 y 5. Así el programa no acepta
valores imposibles. Después creamos a los dos personajes:

```java
Personaje heroe = new Personaje(nombre, 100, nivel);
Personaje dragon = new Personaje("Dragon", 100, 2);
```

## Paso 3: el bucle del combate

```java
int turno = 1;
while (heroe.estaVivo() && dragon.estaVivo()) {
    heroe.mostrarEstado();
    dragon.mostrarEstado();

    mostrarMenu();
    int opcion = teclado.nextInt();

    if (opcion == 1) {
        heroe.atacar(dragon);
    } else if (opcion == 2) {
        heroe.curar(15);
    } else {
        System.out.println("Opción no válida. Pierdes el turno.");
    }

    if (dragon.estaVivo()) {
        dragon.atacar(heroe);
    }

    turno++;
}
```

Fíjate en dos detalles:

- La condición del `while` usa `&&`: el combate sigue solo si **los dos** están vivos.
- El dragón solo contraataca si **sigue vivo**. Si el héroe lo derrota, el combate termina sin que él ataque.

## Paso 4: mostrar quién ganó

```java
if (heroe.estaVivo()) {
    System.out.println("¡Victoria! " + heroe.nombre + " derrotó al dragón en " + (turno - 1) + " turnos.");
} else {
    System.out.println("El dragón ganó. Sube de nivel e inténtalo otra vez.");
}
```

Con nivel 3 y atacando siempre, el héroe gana en 4 turnos. Con nivel 1 el dragón gana: el nivel importa.

## Cuatro buenas prácticas

**1. Usa nombres claros.** El nombre de una variable debe decir qué guarda.

```java
// Difícil de entender
int a = 100;
int b = 2;

// Claro
int vida = 100;
int nivel = 2;
```

**2. Ordena el código con sangría.** Cada bloque entre llaves `{ }` se escribe un paso a la derecha. Así
ves de un vistazo dónde empieza y termina un `if` o un `while`.

```java
// Difícil de leer
if(vida>0&&nivel>0){System.out.println("ok");}

// Ordenado
if (vida > 0 && nivel > 0) {
    System.out.println("El personaje sigue en pie.");
}
```

**3. Divide el trabajo en métodos pequeños.** `atacar`, `curar` y `mostrarMenu` hacen una sola cosa cada
uno, y por eso `main` se lee casi como una frase.

**4. Valida lo que escribe el jugador.** El `while` del nivel evita valores como 99 o 0. Recuerda también que
la vida protegida con `setVida` nunca sale del rango de 0 a 100.

## ⏸ Tu turno

Completa [`starter-files/leccion-10/Main.java`](../starter-files/leccion-10/Main.java) siguiendo los siete
`TODO`. La clase `Personaje` ya está lista: solo tienes que armar el `main`.

Cuando funcione, prueba un reto extra: cambia el nivel del dragón, o cuánta vida cura la opción 2, y
mira cómo cambia el combate.

## Errores típicos de todo el curso

| Error | Qué pasa | Lección |
|---|---|---|
| Olvidar el `;` al final de una instrucción | el editor marca un error y no ejecuta | 1 |
| Poner comillas a un número: `int vida = "100";` | `"100"` es texto, no un número | 2 |
| Escribir `if (vida = 60)` | `=` guarda un valor, no compara | 4 |
| Olvidar cambiar algo dentro del `while` | el bucle nunca termina | 4 |
| Escribir `nextLine()` justo después de `nextInt()` | `nextLine()` lee el salto de línea que quedó pendiente y no espera tu texto | 6 |
| Escribir letras cuando el programa espera un número | `nextInt()` se detiene con un error | 6 |
| Acceder a `luna.vida` cuando es `private` | Java no deja entrar a un atributo privado | 8 |
| Usar el índice 4 en un array de 4 casillas | el programa se detiene: los índices van de 0 a 3 | 9 |
| Comparar textos con `==` | puede dar `false` aunque se vean iguales | 9 |

## Resumen

- Un programa completo combina clases, métodos, bucles, decisiones y `Scanner`.
- Los nombres claros, la sangría ordenada y los métodos pequeños hacen el código más fácil de leer y de
  corregir.
- Validar lo que escribe el jugador evita errores y valores imposibles.

**¡Felicidades!** Terminaste el curso: partiste de un `¡Hola, mundo!` y construiste un videojuego de
combate por turnos. Repasa las lecciones en el [plan del curso](../course-plan.md) o inventa tus propias
mejoras: nuevos enemigos, más acciones, un equipo de héroes con arrays…
