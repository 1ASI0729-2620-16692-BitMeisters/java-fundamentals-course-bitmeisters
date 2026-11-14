# Fundamentos de Java para principiantes

Curso en video de **Java para estudiantes de secundaria (12 a 17 años) sin experiencia previa en
programación**. Son 10 lecciones cortas, de unos 60 minutos en total, en las que se construye paso a
paso un **personaje de videojuego** hasta terminar con un combate por turnos.

**No hay que instalar nada.** Todo se hace en un editor de Java online y gratuito, desde el
navegador: Chrome, Firefox, Safari o Edge.

El plan completo del curso, con los enlaces a los videos, está en [`course-plan.md`](course-plan.md).

## Cómo usar este repositorio

1. Abre el video de la lección.
2. Abre el editor online que indica la lección (Replit, JDoodle u OnlineGDB). En la descripción de
   cada video hay un enlace con el código inicial ya cargado.
3. Si prefieres empezar desde cero, copia el contenido de `starter-files/leccion-NN/Main.java` en el
   editor y pulsa **Run**.
4. Pausa el video en cada ⏸ y resuelve el reto antes de seguir.
5. Si te atascas, compara con `completed-examples/leccion-NN/Main.java`.
6. Para repasar sin ver el video, lee la lección escrita en `scripts/leccion-NN.md`: el código
   explicado paso a paso, el reto y los errores típicos.

Todos los programas usan una sola clase pública llamada `Main` en un único archivo, que es lo que
esperan los editores online.

## Carpetas

| Carpeta | Contenido |
|---|---|
| [`/starter-files`](starter-files) | el código con el que empieza cada lección, con los pasos a completar |
| [`/completed-examples`](completed-examples) | el código resuelto de cada lección |
| [`/scripts`](scripts) | cada lección por escrito: qué vas a aprender, el código explicado paso a paso, el reto y los errores típicos |

## Lecciones

| # | Lección | Duración | Editor | Archivos |
|---|---|---|---|---|
| 1 | ¿Qué es programar y qué es Java? | 5 min | Replit | [inicial](starter-files/leccion-01/Main.java) · [resuelto](completed-examples/leccion-01/Main.java) · [lección escrita](scripts/leccion-01.md) |
| 2 | Variables y tipos de datos | 6 min | Replit | [inicial](starter-files/leccion-02/Main.java) · [resuelto](completed-examples/leccion-02/Main.java) · [lección escrita](scripts/leccion-02.md) |
| 3 | Operadores y expresiones | 5 min | JDoodle | [inicial](starter-files/leccion-03/Main.java) · [resuelto](completed-examples/leccion-03/Main.java) · [lección escrita](scripts/leccion-03.md) |
| 4 | Decisiones y bucles: if-else, for y while | 8 min | JDoodle | [inicial](starter-files/leccion-04/Main.java) · [resuelto](completed-examples/leccion-04/Main.java) · [lección escrita](scripts/leccion-04.md) |
| 5 | Métodos y parámetros | 6 min | OnlineGDB | [inicial](starter-files/leccion-05/Main.java) · [resuelto](completed-examples/leccion-05/Main.java) · [lección escrita](scripts/leccion-05.md) |
| 6 | Entrada y salida con Scanner | 5 min | OnlineGDB | [inicial](starter-files/leccion-06/Main.java) · [resuelto](completed-examples/leccion-06/Main.java) · [lección escrita](scripts/leccion-06.md) |
| 7 | Clases, objetos y constructores | 7 min | OnlineGDB | [inicial](starter-files/leccion-07/Main.java) · [resuelto](completed-examples/leccion-07/Main.java) · [lección escrita](scripts/leccion-07.md) |
| 8 | Encapsulación: getters y setters | 6 min | OnlineGDB | [inicial](starter-files/leccion-08/Main.java) · [resuelto](completed-examples/leccion-08/Main.java) · [lección escrita](scripts/leccion-08.md) |
| 9 | Arrays y cadenas con objetos | 6 min | Replit | [inicial](starter-files/leccion-09/Main.java) · [resuelto](completed-examples/leccion-09/Main.java) · [lección escrita](scripts/leccion-09.md) |
| 10 | Programa completo, buenas prácticas y errores comunes | 8 min | Replit | [inicial](starter-files/leccion-10/Main.java) · [resuelto](completed-examples/leccion-10/Main.java) · [lección escrita](scripts/leccion-10.md) |

## Requisitos técnicos

- Un navegador web actualizado.
- Java 17 o superior en el editor online; todos los ejemplos compilan con `javac --release 17`.
