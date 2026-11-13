class Personaje {
    String nombre;
    int vida;
    int nivel;

    Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    // TODO 1: Cambiar vida a private.

    // TODO 2: Crear getVida() para consultar la vida.

    // TODO 3: Crear setVida(int vida).
    // La vida no debe ser menor que 0 ni mayor que 100.

    void mostrarEstado() {
        System.out.println("Personaje: " + nombre);

        // TODO 4: Mostrar la vida usando getVida().

        System.out.println("Nivel: " + nivel);
    }
}

public class Main {
    public static void main(String[] args) {
        Personaje luna = new Personaje("Luna", 100, 1);

        // TODO 5: Cambiar la vida a 75 y mostrarla.

        // TODO 6: Probar los valores -50 y 150.
        // La vida debe mantenerse entre 0 y 100.
    }
}