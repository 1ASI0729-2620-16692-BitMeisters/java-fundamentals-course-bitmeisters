# Lección 1: ¿Qué es programar y qué es Java?

| | |
|---|---|
| **Duración** | 5 minutos |
| **Empieza a programar** | copia [`starter-files/leccion-01/Main.java`](../starter-files/leccion-01/Main.java) en el editor online y pulsa **Run** |
| **Solución** | [`completed-examples/leccion-01/Main.java`](../completed-examples/leccion-01/Main.java) |

## Qué vas a aprender

- Qué es un programa.
- Para qué se usa Java.
- Cómo escribir y ejecutar tu primera instrucción.

## Programar es dar instrucciones

¿Sabías que Minecraft se creó en Java? Los juegos, las apps de Android y muchos sistemas de bancos
funcionan con Java.

Un programa es como una **receta**: una lista de instrucciones en orden que la computadora sigue al
pie de la letra. Si la receta tiene un error, el plato sale mal; si el programa tiene un error, no
funciona o hace algo distinto de lo que querías.

## El editor online

No hace falta instalar nada. El editor tiene tres partes:

- **el área de código**, donde escribes;
- **el botón Run**, que ejecuta el programa;
- **la consola**, donde aparece lo que el programa muestra.

## Tu primera instrucción

Dentro de las llaves de `main` escribe:

```java
System.out.println("¡Hola, mundo!");
```

Pulsa **Run** y en la consola aparece `¡Hola, mundo!`.

- `System.out.println(...)` muestra en la consola lo que pongas entre los paréntesis.
- El texto va **entre comillas**.
- Cada instrucción termina en **punto y coma** `;`.

Puedes escribir varias instrucciones, una debajo de otra; la computadora las ejecuta en orden:

```java
System.out.println("¡Hola, mundo!");
System.out.println("Soy un programa escrito en Java.");
```

## ⏸ Tu turno

Muestra en la consola tu nombre y tu juego favorito, cada uno en su propia línea.

## Errores típicos

| Error | Qué pasa | Cómo se arregla |
|---|---|---|
| Olvidar el `;` al final | el editor marca un error y no ejecuta | añade `;` al final de la instrucción |
| Escribir `system` en minúscula | Java no lo reconoce | escribe `System`: Java distingue mayúsculas de minúsculas |
| Olvidar una comilla | el texto no se cierra y aparece un error | abre y cierra el texto con `"` |

## Resumen

- Un programa es una lista de instrucciones que se ejecutan en orden.
- `System.out.println("texto");` muestra un texto en la consola.

**Siguiente:** [Lección 2: Variables y tipos de datos](leccion-02.md) — le damos vida a nuestro
personaje de videojuego.
