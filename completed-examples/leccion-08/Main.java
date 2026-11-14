class Personaje {
    String nombre;
    private int vida;
    int nivel;

    Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        setVida(vida);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else if (vida > 100) {
            this.vida = 100;
        } else {
            this.vida = vida;
        }
    }

    void mostrarEstado() {
        System.out.println("Personaje: " + nombre);
        System.out.println("Vida: " + getVida());
        System.out.println("Nivel: " + nivel);
        System.out.println();
    }

    void recibirDanio(int cantidad) {
        if (cantidad > 0) {
            setVida(getVida() - cantidad);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Personaje luna = new Personaje("Luna", 100, 1);

        luna.mostrarEstado();

        luna.setVida(75);
        System.out.println("Vida despues del cambio: " + luna.getVida());

        luna.setVida(-50);
        System.out.println("Vida despues de poner -50: " + luna.getVida());

        luna.setVida(150);
        System.out.println("Vida despues de poner 150: " + luna.getVida());

        luna.recibirDanio(30);
        System.out.println("Vida despues de recibir dano: " + luna.getVida());
    }
}