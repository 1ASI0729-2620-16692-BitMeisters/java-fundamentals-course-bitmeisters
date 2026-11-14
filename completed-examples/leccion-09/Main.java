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
        // 1. Un array con espacio para 4 héroes
        Personaje[] equipo = new Personaje[4];

        // 2. Llenamos cada casilla (los índices empiezan en 0)
        equipo[0] = new Personaje("Luna", 100, 1);
        equipo[1] = new Personaje("Guerrero", 90, 3);
        equipo[2] = new Personaje("Mago", 70, 2);
        equipo[3] = new Personaje("Arquera", 80, 4);

        // 3. length (sin paréntesis) dice cuántas casillas tiene el array
        System.out.println("El equipo tiene " + equipo.length + " héroes.");
        System.out.println();

        // 4. for-each: "para cada héroe en el equipo"
        //    toUpperCase() y length() trabajan con el texto del nombre
        for (Personaje heroe : equipo) {
            System.out.println(heroe.nombre.toUpperCase() + " (" + heroe.nombre.length()
                    + " letras) - Vida: " + heroe.getVida());
        }

        // 5. El dragón lanza fuego y daña a todo el equipo
        System.out.println();
        System.out.println("¡El dragón lanza fuego! Todos reciben 30 de daño.");
        for (Personaje heroe : equipo) {
            heroe.recibirDanio(30);
            System.out.println(heroe.nombre + ": " + heroe.getVida() + " de vida");
        }

        // 6. Buscar un héroe por su nombre, sin importar mayúsculas o minúsculas
        String buscado = "mago";
        boolean encontrado = false;

        System.out.println();
        for (Personaje heroe : equipo) {
            if (heroe.nombre.equalsIgnoreCase(buscado)) {
                System.out.println("¡Encontrado!");
                heroe.mostrarEstado();
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("No hay ningún héroe llamado " + buscado + ".");
        }
    }
}
