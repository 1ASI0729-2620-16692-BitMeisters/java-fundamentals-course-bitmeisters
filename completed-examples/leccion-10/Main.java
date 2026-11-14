import java.util.Scanner;

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

    boolean estaVivo() {
        return vida > 0;
    }

    int calcularDanio() {
        return 10 + nivel * 5;
    }

    void recibirDanio(int cantidad) {
        if (cantidad > 0) {
            setVida(getVida() - cantidad);
        }
    }

    void atacar(Personaje objetivo) {
        int danio = calcularDanio();
        objetivo.recibirDanio(danio);
        System.out.println(nombre + " ataca y hace " + danio + " de daño a " + objetivo.nombre + ".");
    }

    void curar(int cantidad) {
        int vidaAntes = vida;
        setVida(vida + cantidad);
        System.out.println(nombre + " se cura " + (vida - vidaAntes) + " de vida.");
    }

    void mostrarEstado() {
        System.out.println(nombre + " - Vida: " + vida + " - Nivel: " + nivel);
    }
}

public class Main {

    static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Atacar");
        System.out.println("2. Curarse");
        System.out.print("Elige una opción: ");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Pedir los datos del héroe
        System.out.print("Escribe el nombre de tu héroe: ");
        String nombre = teclado.nextLine();

        // Se repite la pregunta hasta que el nivel esté entre 1 y 5
        int nivel = 0;
        while (nivel < 1 || nivel > 5) {
            System.out.print("Elige el nivel de " + nombre + " (1 a 5): ");
            nivel = teclado.nextInt();
        }

        // 2. Crear al héroe y al dragón
        Personaje heroe = new Personaje(nombre, 100, nivel);
        Personaje dragon = new Personaje("Dragon", 100, 2);

        System.out.println();
        System.out.println("¡Comienza el combate!");

        // 3. El combate sigue mientras los dos estén vivos
        int turno = 1;
        while (heroe.estaVivo() && dragon.estaVivo()) {
            System.out.println();
            System.out.println("--- Turno " + turno + " ---");
            heroe.mostrarEstado();
            dragon.mostrarEstado();

            mostrarMenu();
            int opcion = teclado.nextInt();

            if (opcion == 1) {
                heroe.atacar(dragon);
            } else if (opcion == 2) {
                heroe.curar(15);
            } else {
                System.out.println("Opción no válida. Pierdes el turno.");
            }

            // El dragón solo contraataca si sigue vivo
            if (dragon.estaVivo()) {
                dragon.atacar(heroe);
            }

            turno++;
        }

        // 4. Mostrar quién ganó
        System.out.println();
        if (heroe.estaVivo()) {
            System.out.println("¡Victoria! " + heroe.nombre + " derrotó al dragón en " + (turno - 1) + " turnos.");
        } else {
            System.out.println("El dragón ganó. Sube de nivel e inténtalo otra vez.");
        }

        teclado.close();
    }
}
