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
        // TODO 1: Crea un array de 4 personajes llamado equipo.
        //         Pista: Personaje[] equipo = new Personaje[4];

        // TODO 2: Llena cada casilla con un héroe (los índices empiezan en 0).
        //         Pista: equipo[0] = new Personaje("Luna", 100, 1);

        // TODO 3: Muestra cuántos héroes hay usando equipo.length (sin paréntesis).

        // TODO 4: Recorre el equipo con for-each y muestra, de cada héroe, su nombre
        //         en mayúsculas (toUpperCase), cuántas letras tiene (length) y su vida.

        // TODO 5: Haz que el dragón dañe a todo el equipo: recorre el array y llama
        //         a recibirDanio(30) en cada héroe. Muestra la vida de cada uno.

        // TODO 6: Busca un héroe por su nombre. Guarda el nombre en una variable String,
        //         recorre el array y compara con equalsIgnoreCase.
        //         Si lo encuentras, muestra su estado; si no, muestra un aviso.
    }
}
