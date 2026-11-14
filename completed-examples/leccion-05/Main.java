public class Main {

    // Método sin retorno (void): hace algo, pero no devuelve nada.
    static void mostrarEstado(String nombre, int vida) {
        System.out.println(nombre + " - Vida: " + vida);
    }

    // Métodos con retorno (int): reciben datos y devuelven un resultado.
    static int calcularDanio(int nivel) {
        return 10 + nivel * 5;
    }

    static int atacar(int vidaObjetivo, int danio) {
        return vidaObjetivo - danio;
    }

    static int curar(int vida, int cantidad) {
        return vida + cantidad;
    }

    public static void main(String[] args) {
        String nombre = "Luna";
        int nivelLuna = 3;
        int vida = 100;

        String nombreDragon = "Dragon";
        int nivelDragon = 2;
        int vidaDragon = 100;

        mostrarEstado(nombre, vida);
        mostrarEstado(nombreDragon, vidaDragon);
        System.out.println();

        // Luna ataca al dragón
        int danioLuna = calcularDanio(nivelLuna);
        vidaDragon = atacar(vidaDragon, danioLuna);
        System.out.println(nombre + " ataca y hace " + danioLuna + " de daño.");
        mostrarEstado(nombreDragon, vidaDragon);
        System.out.println();

        // El dragón contraataca
        int danioDragon = calcularDanio(nivelDragon);
        vida = atacar(vida, danioDragon);
        System.out.println(nombreDragon + " ataca y hace " + danioDragon + " de daño.");
        mostrarEstado(nombre, vida);
        System.out.println();

        // Luna se cura
        vida = curar(vida, 15);
        System.out.println(nombre + " se cura 15 de vida.");
        mostrarEstado(nombre, vida);
    }
}
