# Lección 6: Entrada y salida con Scanner

| | |
|---|---|
| **Duración** | 5 minutos |
| **Empieza a programar** | copia [`starter-files/leccion-06/Main.java`](../starter-files/leccion-06/Main.java) en el editor online (OnlineGDB), pulsa **Run** y escribe tus respuestas en la consola |
| **Solución** | [`completed-examples/leccion-06/Main.java`](../completed-examples/leccion-06/Main.java) |

## Qué vas a aprender

- Cómo leer lo que el jugador escribe con `Scanner`.
- La diferencia entre `nextLine()` (texto) y `nextInt()` (números).
- Cómo usar lo que escribe el jugador para decidir qué pasa en el juego.

## Leer datos con `Scanner`

Hasta ahora los valores los escribías tú dentro del código. Con `Scanner` el **jugador** los escribe
mientras el programa corre. Primero hay que importarlo, arriba del todo, y crear el lector dentro de
`main`:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    }
}
```

- `import java.util.Scanner;` le avisa a Java dónde encontrar `Scanner`.
- `System.in` significa «lo que se escribe en el teclado».
- `teclado` es el nombre que le damos al lector; puedes llamarlo como quieras.

## Leer texto y números

```java
System.out.print("Escribe el nombre de tu personaje: ");
String nombre = teclado.nextLine();

System.out.print("Escribe el nivel de " + nombre + " (1 a 5): ");
int nivel = teclado.nextInt();
```

| Método | Lee | Se guarda en |
|---|---|---|
| `nextLine()` | una línea de texto completa | `String` |
| `nextInt()` | un número entero | `int` |

`System.out.print` (sin `ln`) muestra el mensaje **sin saltar de línea**, para que el jugador escriba justo
a continuación.

## Decidir según lo que escribe el jugador

Mostramos un menú con un método y usamos `if` / `else if` / `else` (lección 4) para reaccionar:

```java
mostrarMenu();
int opcion = teclado.nextInt();

if (opcion == 1) {
    int danio = calcularDanio(nivel);
    vidaDragon = atacar(vidaDragon, danio);
    System.out.println(nombre + " ataca y hace " + danio + " de daño.");
} else if (opcion == 2) {
    vida = curar(vida, 15);
    System.out.println(nombre + " se cura 15 de vida.");
} else {
    System.out.println("Opción no válida. Pierdes el turno.");
}
```

Al final, el dragón contraataca y se muestra el estado de los dos. Así, cada vez que ejecutes el programa,
el resultado depende de lo que escriba el jugador.

## ⏸ Tu turno

Completa [`starter-files/leccion-06/Main.java`](../starter-files/leccion-06/Main.java) siguiendo los seis
pasos. Después ejecútalo tres veces: una con la opción 1, otra con la 2 y otra con un número que no esté
en el menú.

## Errores típicos

| Error | Qué pasa | Cómo se arregla |
|---|---|---|
| Olvidar `import java.util.Scanner;` | error: no se encuentra el símbolo `Scanner` | agrega el `import` arriba del todo |
| Escribir un texto cuando el programa espera un número | el programa se detiene con `InputMismatchException` | escribe un número entero cuando se pida un número |
| Usar `nextInt()` y después `nextLine()` | `nextLine()` lee un texto vacío porque el Enter del número queda pendiente | en este curso lee primero el texto y luego los números, como en el ejemplo |
| No escribir nada en la consola del editor | el programa espera sin avanzar | haz clic en la consola, escribe la respuesta y pulsa Enter |
| Comparar con `=` en vez de `==` | error de compilación | usa `==` para comparar |

## Resumen

- `Scanner` lee lo que el jugador escribe: `nextLine()` para texto y `nextInt()` para números enteros.
- `System.out.print` muestra un mensaje sin salto de línea; `System.out.println` salta de línea.
- Lo que el jugador escribe se combina con `if` / `else` para que el juego reaccione.

**Siguiente:** [Lección 7: Clases, objetos y constructores](leccion-07.md) — agrupamos los datos y las
acciones del personaje en una clase `Personaje`.
