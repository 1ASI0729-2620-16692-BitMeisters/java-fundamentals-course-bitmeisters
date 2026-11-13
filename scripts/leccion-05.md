# Lección 5: Métodos y parámetros

| | |
|---|---|
| **Duración** | 6 minutos |
| **Empieza a programar** | copia [`starter-files/leccion-05/Main.java`](../starter-files/leccion-05/Main.java) en el editor online (OnlineGDB) y pulsa **Run** |
| **Solución** | [`completed-examples/leccion-05/Main.java`](../completed-examples/leccion-05/Main.java) |

## Qué vas a aprender

- Qué es un método y por qué sirve para no repetir código.
- Cómo pasarle datos a un método con parámetros.
- Cómo hacer que un método devuelva un resultado con `return`.

## Un método es una acción con nombre

En las lecciones anteriores todo el código estaba dentro de `main`. Si Luna ataca diez veces, tendrías que
copiar diez veces las mismas líneas. Un **método** guarda esas instrucciones bajo un nombre para
reutilizarlas cuando quieras: se escribe una vez y se **llama** las veces que haga falta.

```java
static void mostrarEstado(String nombre, int vida) {
    System.out.println(nombre + " - Vida: " + vida);
}
```

Cada parte tiene un trabajo:

| Parte | En el ejemplo | Qué significa |
|---|---|---|
| `static` | `static` | por ahora escríbelo siempre: permite llamar al método desde `main` |
| Tipo de retorno | `void` | el método hace algo, pero **no devuelve** ningún valor |
| Nombre | `mostrarEstado` | cómo lo llamarás después |
| Parámetros | `String nombre, int vida` | los datos que necesita recibir |

Los métodos se escriben **dentro de `Main`, pero fuera de `main`**. Para usarlo, lo llamas por su nombre y
le pasas los datos:

```java
mostrarEstado(nombre, vida);          // Luna - Vida: 100
mostrarEstado(nombreDragon, vidaDragon); // Dragon - Vida: 100
```

El mismo método sirve para Luna y para el dragón: solo cambian los datos que le pasas.

## Devolver un resultado con `return`

Algunos métodos calculan algo y **devuelven** el resultado. En vez de `void` se escribe el tipo del valor
que devuelven y se usa `return`:

```java
static int calcularDanio(int nivel) {
    return 10 + nivel * 5;
}
```

Al llamarlo, el resultado se puede guardar en una variable:

```java
int danioLuna = calcularDanio(nivelLuna);   // nivelLuna = 3 -> 25
```

Con los métodos `atacar` y `curar` ordenamos todo el combate:

```java
static int atacar(int vidaObjetivo, int danio) {
    return vidaObjetivo - danio;
}

static int curar(int vida, int cantidad) {
    return vida + cantidad;
}
```

```java
vidaDragon = atacar(vidaDragon, danioLuna);   // 100 - 25 = 75
vida = curar(vida, 15);
```

Observa que `atacar` y `curar` **no cambian** la variable original: devuelven un número nuevo y tú lo
guardas con `=`.

## ⏸ Tu turno

Completa [`starter-files/leccion-05/Main.java`](../starter-files/leccion-05/Main.java) siguiendo los ocho
pasos. Después cambia el `nivelLuna` o la cantidad que cura `curar` y observa cómo cambian los resultados.

## Errores típicos

| Error | Qué pasa | Cómo se arregla |
|---|---|---|
| Escribir el método **dentro** de `main` | error de compilación | ponlo fuera de `main`, pero dentro de `Main` |
| Olvidar `return` en un método con tipo `int` | error: falta la sentencia `return` | agrega `return` con el valor al final |
| Llamar `atacar(vidaDragon, danioLuna);` sin guardar el resultado | la vida no cambia | escribe `vidaDragon = atacar(...)` |
| Pasar los parámetros en otro orden o de otro tipo | error o resultado incorrecto | respeta el orden y el tipo de la definición |
| Olvidar `static` | error: no se puede llamar desde un contexto estático | escribe `static` antes del tipo de retorno |

## Resumen

- Un método agrupa instrucciones con un nombre para reutilizarlas.
- Los parámetros son los datos que el método recibe entre paréntesis.
- `void` no devuelve nada; con otro tipo (`int`, `String`…) el método devuelve un valor con `return`.

**Siguiente:** [Lección 6: Entrada y salida con Scanner](leccion-06.md) — dejamos que el jugador escriba
el nombre de su personaje y elija qué hacer.