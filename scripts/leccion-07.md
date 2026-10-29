# Leccion 7: Clases, objetos y constructores

| | |
|---|---|
| **Duracion** | 7 minutos |
| **Empieza a programar** | Abre `starter-files/leccion-07/Main.java` en OnlineGDB y pulsa Run. |
| **Solucion** | `completed-examples/leccion-07/Main.java` |

## Que vas a aprender

- Que es una clase y que es un objeto.
- Como declarar atributos y metodos.
- Para que sirve un constructor.
- Como crear varios objetos utilizando `new`.

## 1. De variables a clases

En las lecciones anteriores creamos personajes utilizando variables
para almacenar su nombre, vida y nivel.

Pero imagina que queremos crear diez personajes. Tendriamos que
organizar muchos datos por separado.

Java nos permite agrupar esos datos y sus acciones dentro de una
clase. Una clase funciona como un molde que describe como seran
los objetos que creemos.

## 2. Crear la clase Personaje

```java
class Personaje {
    String nombre;
    int vida;
    int nivel;
}
```

La palabra `class` permite declarar una clase.

En este ejemplo, `Personaje` tiene tres atributos:

- `nombre`: almacena el nombre del personaje.
- `vida`: almacena sus puntos de vida.
- `nivel`: indica su nivel actual.

Estos atributos describen los datos que tendra cada personaje.

## 3. Crear un constructor

Ahora queremos que cada personaje tenga sus propios valores
desde el momento en que lo creamos.

```java
Personaje(String nombre, int vida, int nivel) {
    this.nombre = nombre;
    this.vida = vida;
    this.nivel = nivel;
}
```

Este metodo especial se llama constructor. Se ejecuta cuando
creamos un objeto y permite inicializar sus atributos.

Observa que el constructor tiene el mismo nombre que la clase
y no declara ningun tipo de retorno.

La palabra `this` hace referencia al objeto actual. Por ejemplo,
`this.nombre` representa el atributo, mientras que `nombre`
representa el parametro recibido.

## 4. Crear objetos con new

Veamos como utilizar el constructor:

```java
Personaje luna = new Personaje("Luna", 100, 1);
Personaje dragon = new Personaje("Dragon", 200, 5);
```

La palabra `new` crea un objeto de la clase `Personaje`.

Aunque ambos objetos pertenecen a la misma clase, cada uno
tiene sus propios valores. Luna tiene 100 puntos de vida y el
Dragon tiene 200.

## 5. Agregar un metodo

Podemos incluir acciones dentro de la clase:

```java
void mostrarEstado() {
    System.out.println("Personaje: " + nombre);
    System.out.println("Vida: " + vida);
    System.out.println("Nivel: " + nivel);
}
```

El metodo `mostrarEstado()` imprime los datos del personaje
sobre el que se invoca.

Tambien podemos crear un metodo para recibir dano:

```java
void recibirDanio(int cantidad) {
    if (cantidad > 0) {
        vida -= cantidad;

        if (vida < 0) {
            vida = 0;
        }
    }
}
```

Este metodo reduce la vida sin permitir que termine por debajo
de cero.

## Tu turno

Completa `starter-files/leccion-07/Main.java`:

1. Declara los atributos de `Personaje`.
2. Escribe el constructor.
3. Implementa `mostrarEstado()`.
4. Crea dos personajes utilizando `new`.
5. Muestra sus estados y comprueba que tienen valores independientes.

## Errores tipicos

| Error | Solucion |
|---|---|
| Escribir mal el nombre del constructor | Debe coincidir exactamente con `Personaje`. |
| Olvidar `new` | Utiliza `new Personaje(...)` para crear un objeto. |
| Confundir clase y objeto | La clase es el molde; el objeto es una instancia concreta. |
| Olvidar `this` | Usa `this.nombre = nombre` para asignar el parametro al atributo. |

## Resumen

- Una clase define atributos y metodos.
- Un objeto es una instancia de una clase.
- El constructor inicializa los atributos.
- `new` permite crear objetos independientes.

**Siguiente:** [Leccion 8: Encapsulacion, getters y setters](leccion-08.md).