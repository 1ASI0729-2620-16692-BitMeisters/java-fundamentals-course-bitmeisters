# Lección 2: Variables y tipos de datos

| | |
|---|---|
| **Duración** | 6 minutos |
| **Empieza a programar** | copia [`starter-files/leccion-02/Main.java`](../starter-files/leccion-02/Main.java) en el editor online y pulsa **Run** |
| **Solución** | [`completed-examples/leccion-02/Main.java`](../completed-examples/leccion-02/Main.java) |

## Qué vas a aprender

- Qué es una variable.
- Los cuatro tipos de datos básicos: `String`, `int`, `double` y `boolean`.
- Cómo mostrar variables junto con texto.

## Una variable es una caja con nombre

Piensa en la ficha de un personaje de videojuego: tiene un nombre, puntos de vida, un nivel… Cada
dato de esa ficha es una **variable**: una caja con un nombre donde guardamos un valor.

Toda variable se crea igual:

```java
tipo nombre = valor;
```

## Los cuatro tipos básicos

```java
String nombre = "Luna";        // texto, siempre entre comillas
int vida = 100;                // número entero
int nivel = 1;
double velocidad = 1.5;        // número con decimales
boolean tieneEscudo = true;    // verdadero (true) o falso (false)
```

## Mostrar los datos

Con `+` unimos texto y variables dentro de `println`:

```java
System.out.println("Personaje: " + nombre);
System.out.println("Vida: " + vida);
System.out.println("¿Tiene escudo? " + tieneEscudo);
```

Cambia el valor de `vida`, vuelve a pulsar **Run** y verás que el resultado cambia: por eso se llama
*variable*.

## ⏸ Tu turno

Crea tu propio personaje: dale un nombre, una vida, un nivel, una velocidad y decide si tiene escudo.
Muestra toda su ficha en la consola.

## Errores típicos

| Error | Qué pasa | Cómo se arregla |
|---|---|---|
| Poner comillas a un número: `int vida = "100";` | `"100"` es texto, no un número, y Java marca un error | escribe el número sin comillas |
| Escribir `Vida` donde la variable se llama `vida` | Java no la encuentra | usa exactamente el mismo nombre, con las mismas mayúsculas |
| Usar coma en los decimales: `1,5` | Java no lo entiende como número | usa punto: `1.5` |

## Resumen

- Una variable guarda un dato y tiene un tipo, un nombre y un valor.
- `String` es texto, `int` un entero, `double` un número con decimales y `boolean` verdadero o falso.
- `+` une texto y variables al mostrarlos.

**Siguiente:** [Lección 3: Operadores y expresiones](leccion-03.md) — nuestro personaje recibe su
primer golpe.
