class Personaje {
    String nombre;
    int vida;
    int nivel;

    Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    void mostrarEstado() {
        System.out.println("Personaje: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Nivel: " + nivel);
        System.out.println();
    }

    void recibirDanio(int cantidad) {
        if (cantidad > 0) {
            vida -= cantidad;

            if (vida < 0) {
                vida = 0;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Personaje luna = new Personaje("Luna", 100, 1);
        Personaje dragon = new Personaje("Dragon", 200, 5);
        Personaje guerrero = new Personaje("Guerrero", 150, 3);

        luna.recibirDanio(20);

        luna.mostrarEstado();
        dragon.mostrarEstado();
        guerrero.mostrarEstado();
    }
}