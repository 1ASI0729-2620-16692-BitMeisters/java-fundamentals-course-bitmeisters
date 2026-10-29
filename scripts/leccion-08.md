# Leccion 8: Encapsulacion, getters y setters

| | |
|---|---|
| **Duracion** | 6 minutos |
| **Empieza a programar** | Abre `starter-files/leccion-08/Main.java` en OnlineGDB y pulsa Run. |
| **Solucion** | `completed-examples/leccion-08/Main.java` |

## Que vas a aprender

- Que significa encapsular un atributo.
- Para que sirve la palabra `private`.
- Como consultar valores mediante getters.
- Como modificar valores mediante setters.
- Como validar la vida de un personaje.

## 1. El problema de modificar la vida directamente

En la leccion anterior, el atributo `vida` podia modificarse
directamente desde otras partes del programa:

```java
Personaje luna = new Personaje("Luna", 100, 1);
luna.vida = -500;
```

Esto permite asignar un valor negativo, aunque no tenga sentido
en nuestro videojuego.

Necesitamos proteger la vida para controlar que valores puede
recibir.

## 2. Utilizar private

Para proteger el atributo, cambiamos su declaracion:

```java
private int vida;
```

La palabra `private` impide acceder directamente a `vida`
desde fuera de la clase `Personaje`.

Sin embargo, todavia necesitamos consultar y modificar ese
valor. Para eso utilizaremos getters y setters.

## 3. Crear un getter

Un getter permite consultar el valor de un atributo:

```java
public int getVida() {
    return vida;
}
```

El metodo `getVida()` devuelve un numero entero con la vida
actual del personaje.

Por ejemplo:

```java
System.out.println(luna.getVida());
```

De esta manera consultamos la vida sin acceder directamente
al atributo privado.

## 4. Crear un setter

Un setter permite modificar un atributo de manera controlada:

```java
public void setVida(int vida) {
    if (vida < 0) {
        this.vida = 0;
    } else if (vida > 100) {
        this.vida = 100;
    } else {
        this.vida = vida;
    }
}
```

En nuestro juego, la vida debe permanecer entre 0 y 100.

- Si intentamos establecer -50, la vida pasa a 0.
- Si establecemos 150, la vida pasa a 100.
- Si establecemos 75, la vida queda en 75.

El setter valida el valor antes de asignarlo al atributo.

## 5. Validar tambien el constructor

El constructor tambien recibe un valor inicial para la vida.
Por eso debemos asegurarnos de que ese valor pase por la
misma validacion.

```java
Personaje(String nombre, int vida, int nivel) {
    this.nombre = nombre;
    this.nivel = nivel;
    setVida(vida);
}
```

Observa que usamos `setVida(vida)` en lugar de asignar
directamente el parametro al atributo.

Asi aplicamos las mismas reglas desde el principio.

## 6. Consultar y modificar la vida

Podemos probar los metodos desde `main`:

```java
Personaje luna = new Personaje("Luna", 100, 1);

luna.setVida(75);
System.out.println(luna.getVida());

luna.setVida(-50);
System.out.println(luna.getVida());

luna.setVida(150);
System.out.println(luna.getVida());
```

Los resultados seran:

```text
75
0
100
```

La vida nunca sale del rango permitido.

## Tu turno

Completa `starter-files/leccion-08/Main.java`:

1. Declara `vida` como `private`.
2. Implementa `getVida()`.
3. Implementa `setVida(int vida)` con la validacion.
4. Actualiza `mostrarEstado()` para utilizar `getVida()`.
5. Prueba los valores -50, 75 y 150.
6. Comprueba los resultados en la consola.

## Errores tipicos

| Error | Solucion |
|---|---|
| Intentar acceder a `luna.vida` desde `main` | Utiliza `luna.getVida()` o `luna.setVida(...)`. |
| Olvidar el tipo de retorno del getter | `getVida()` debe devolver un `int`. |
| Permitir cualquier valor en el setter | Valida los limites antes de asignar. |
| Escribir `vida = vida` | Utiliza `this.vida = vida` para referirte al atributo. |
| Validar solo las modificaciones posteriores | Usa `setVida(vida)` tambien en el constructor. |

## Resumen

- `private` protege el acceso directo a un atributo.
- Un getter permite consultar su valor.
- Un setter permite modificarlo de forma controlada.
- La validacion evita valores fuera del rango definido.

**Siguiente:** Leccion 9: Arrays y cadenas con objetos.