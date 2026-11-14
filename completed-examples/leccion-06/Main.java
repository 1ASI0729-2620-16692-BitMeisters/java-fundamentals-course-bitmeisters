import java.util.Scanner;

public class Main {

    static void mostrarEstado(String nombre, int vida) {
        System.out.println(nombre + " - Vida: " + vida);
    }

    static int calcularDanio(int nivel) {
        return 10 + nivel * 5;
    }

    static int atacar(int vidaObjetivo, int danio) {
        return vidaObjetivo - danio;
    }

    static int curar(int vida, int cantidad) {
        return vida + cantidad;
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Atacar");
        System.out.println("2. Curarse");
        System.out.print("Elige una opción: ");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // nextLine() lee un texto completo
        System.out.print("Escribe el nombre de tu personaje: ");
        String nombre = teclado.nextLine();

        // nextInt() lee un número entero
        System.out.print("Escribe el nivel de " + nombre + " (1 a 5): ");
        int nivel = teclado.nextInt();

        int vida = 70;
        String nombreDragon = "Dragon";
        int nivelDragon = 2;
        int vidaDragon = 100;

        System.out.println();
        System.out.println("¡Bienvenido, " + nombre + "!");
        mostrarEstado(nombre, vida);
        mostrarEstado(nombreDragon, vidaDragon);

        mostrarMenu();
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            int danio = calcularDanio(nivel);
            vidaDragon = atacar(vidaDragon, danio);
            System.out.println(nombre + " ataca y hace " + danio + " de daño.");
        } else if (opcion == 2) {
            vida = curar(vida, 15);
            System.out.println(nombre + " se cura 15 de vida.");
        } else {
            System.out.println("Opción no válida. Pierdes el turno.");
        }

        int danioDragon = calcularDanio(nivelDragon);
        vida = atacar(vida, danioDragon);
        System.out.println(nombreDragon + " ataca y hace " + danioDragon + " de daño.");

        System.out.println();
        mostrarEstado(nombre, vida);
        mostrarEstado(nombreDragon, vidaDragon);

        teclado.close();
    }
}
