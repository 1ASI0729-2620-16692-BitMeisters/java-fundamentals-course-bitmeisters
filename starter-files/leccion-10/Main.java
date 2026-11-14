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

        // TODO 1: Pide el nombre del héroe con nextLine() y su nivel con nextInt().
        //         Repite la pregunta del nivel con un while hasta que esté entre 1 y 5.

        // TODO 2: Crea al héroe (vida 100 y el nivel elegido)
        //         y al dragón (nombre "Dragon", vida 100, nivel 2).

        // TODO 3: Crea un contador de turnos y un while que se repita
        //         mientras el héroe y el dragón estén vivos (estaVivo()).

        // TODO 4: Dentro del while: muestra el estado de los dos,
        //         llama a mostrarMenu() y lee la opción con nextInt().

        // TODO 5: Con if / else if / else: la opción 1 ataca al dragón (heroe.atacar(dragon)),
        //         la opción 2 cura 15 de vida (heroe.curar(15)) y cualquier otra pierde el turno.

        // TODO 6: Si el dragón sigue vivo, contraataca al héroe. Suma 1 al contador de turnos.

        // TODO 7: Fuera del while: muestra quién ganó, según si el héroe sigue vivo.

        teclado.close();
    }
}
