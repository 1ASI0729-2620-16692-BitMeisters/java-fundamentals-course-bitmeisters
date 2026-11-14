# Lección 9: Arrays y cadenas con objetos

| | |
|---|---|
| **Duración** | 6 minutos |
| **Empieza a programar** | copia [`starter-files/leccion-09/Main.java`](../starter-files/leccion-09/Main.java) en el editor online (OnlineGDB) y pulsa **Run** |
| **Solución** | [`completed-examples/leccion-09/Main.java`](../completed-examples/leccion-09/Main.java) |

## Qué vas a aprender

- Qué es un array y cómo guardar varios objetos en él.
- Cómo recorrerlo con `for-each`.
- Tres métodos para trabajar con texto: `toUpperCase()`, `length()` y `equalsIgnoreCase()`.
- Cómo buscar un personaje por su nombre.

## Un equipo en lugar de un solo héroe

Hasta ahora tenías un personaje, `luna`. Si quieres un equipo de cuatro héroes, ¿vas a crear cuatro
variables distintas? No hace falta: un **array** es una fila de casillas numeradas que guarda varios
valores del mismo tipo.

```java
Personaje[] equipo = new Personaje[4];
```

Esta línea crea un array con 4 casillas, todas para objetos `Personaje`. Se llenan una por una, y los
números de las casillas, llamados **índices**, **empiezan en 0**:

```java
equipo[0] = new Personaje("Luna", 100, 1);
equipo[1] = new Personaje("Guerrero", 90, 3);
equipo[2] = new Personaje("Mago", 70, 2);
equipo[3] = new Personaje("Arquera", 80, 4);
```

```text
equipo:   [0] Luna    [1] Guerrero    [2] Mago    [3] Arquera
```

Para saber cuántas casillas tiene el array, usa `equipo.length`, **sin paréntesis**:

```java
System.out.println("El equipo tiene " + equipo.length + " héroes.");
```

## Recorrer el equipo con `for-each`

Para hacer algo con cada héroe, el `for-each` se lee como «para cada héroe en el equipo»:

```java
for (Personaje heroe : equipo) {
    heroe.mostrarEstado();
}
```

En cada vuelta, `heroe` es el siguiente personaje del array. No necesitas contar índices.

## Trabajar con texto

El nombre de cada héroe es un `String`, y los `String` traen métodos listos para usar:

| Método | Qué hace | Ejemplo |
|---|---|---|
| `toUpperCase()` | convierte el texto a mayúsculas | `"Luna".toUpperCase()` da `"LUNA"` |
| `length()` | cuenta las letras | `"Luna".length()` da `4` |
| `equalsIgnoreCase(otro)` | compara dos textos sin importar mayúsculas | `"Mago".equalsIgnoreCase("MAGO")` da `true` |

Los usamos dentro del `for-each`:

```java
for (Personaje heroe : equipo) {
    System.out.println(heroe.nombre.toUpperCase() + " (" + heroe.nombre.length()
            + " letras) - Vida: " + heroe.getVida());
}
```

Y se muestra:

```text
LUNA (4 letras) - Vida: 100
GUERRERO (8 letras) - Vida: 90
MAGO (4 letras) - Vida: 70
ARQUERA (7 letras) - Vida: 80
```

## El dragón ataca a todo el equipo

Un array y un `for-each` también sirven para dar la misma orden a todos:

```java
for (Personaje heroe : equipo) {
    heroe.recibirDanio(30);
    System.out.println(heroe.nombre + ": " + heroe.getVida() + " de vida");
}
```

Como `recibirDanio` usa `setVida` (lección 8), la vida nunca baja de 0.

## Buscar un héroe por su nombre

Para buscar a un héroe, recorremos el equipo y comparamos cada nombre con el que buscamos:

```java
String buscado = "mago";
boolean encontrado = false;

for (Personaje heroe : equipo) {
    if (heroe.nombre.equalsIgnoreCase(buscado)) {
        System.out.println("¡Encontrado!");
        heroe.mostrarEstado();
        encontrado = true;
    }
}

if (encontrado == false) {
    System.out.println("No hay ningún héroe llamado " + buscado + ".");
}
```

Escribimos `"mago"` en minúsculas y aun así encuentra a `"Mago"`, gracias a `equalsIgnoreCase`.

## ⏸ Tu turno

Completa [`starter-files/leccion-09/Main.java`](../starter-files/leccion-09/Main.java) siguiendo los seis
`TODO`. Después busca `"LUNA"`, `"arquera"` y `"Dragon"`, y observa qué mensaje aparece en cada caso.

## Errores típicos

| Error | Qué pasa | Cómo se arregla |
|---|---|---|
| Usar el índice 4 en un array de 4 casillas: `equipo[4]` | el programa se detiene con `ArrayIndexOutOfBoundsException`, porque los índices van de 0 a 3 | usa índices desde 0 hasta `equipo.length - 1` |
| Llenar solo 3 casillas de un array de 4 y recorrerlo | las casillas vacías valen `null` y el programa se detiene con `NullPointerException` | llena todas las casillas antes de recorrer el array |
| Escribir `equipo.length()` o `nombre.length` | Java marca un error: el array usa `length` sin paréntesis y el `String` usa `length()` con paréntesis | `equipo.length` para el array, `nombre.length()` para el texto |
| Comparar textos con `==`: `heroe.nombre == buscado` | `==` no compara las letras y puede dar `false` aunque se vean iguales | usa `equals` o `equalsIgnoreCase` |

## Resumen

- Un array guarda varios objetos del mismo tipo; sus índices empiezan en 0 y `length` dice cuántos hay.
- `for-each` recorre todos los elementos sin usar índices.
- `toUpperCase()`, `length()` y `equalsIgnoreCase()` trabajan con texto.

**Siguiente:** [Lección 10: Programa completo, buenas prácticas y errores comunes](leccion-10.md) — juntamos
todo lo aprendido en un combate por turnos contra el dragón.
