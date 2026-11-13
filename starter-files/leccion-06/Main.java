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

        // 1. Pide el nombre con System.out.print y guárdalo en String nombre usando teclado.nextLine()

        // 2. Pide el nivel (1 a 5) y guárdalo en int nivel usando teclado.nextInt()

        int vida = 70;
        String nombreDragon = "Dragon";
        int nivelDragon = 2;
        int vidaDragon = 100;

        // 3. Da la bienvenida al jugador y muestra el estado de su personaje y del dragón

        // 4. Llama a mostrarMenu() y guarda la opción elegida en int opcion con teclado.nextInt()

        // 5. Con if / else if / else:
        //    opción 1 -> el personaje ataca al dragón con calcularDanio(nivel) y atacar(...)
        //    opción 2 -> el personaje se cura 15 con curar(...)
        //    otra opción -> muestra "Opción no válida. Pierdes el turno."

        // 6. El dragón contraataca a tu personaje y muestra el estado final de los dos

        teclado.close();
    }
}
