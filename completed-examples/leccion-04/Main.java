public class Main {
    public static void main(String[] args) {
        String nombre = "Luna";
        int vida = 45;
        int experiencia = 0;

        // if - else if - else: decidir según la vida
        if (vida > 60) {
            System.out.println(nombre + " está en buena forma.");
        } else if (vida > 30) {
            System.out.println(nombre + " está herida.");
        } else {
            System.out.println(nombre + " está en peligro.");
        }

        // for: repetir un número fijo de veces
        for (int ronda = 1; ronda <= 3; ronda++) {
            experiencia = experiencia + 40;
            System.out.println("Ronda " + ronda + " de entrenamiento. Experiencia: " + experiencia);
        }

        // while: repetir mientras se cumpla una condición
        vida = 100;
        int vidaDragon = 100;
        int turno = 1;

        System.out.println("¡Comienza el combate!");

        while (vida > 0 && vidaDragon > 0) {
            vidaDragon = vidaDragon - 25;
            System.out.println("Turno " + turno + ": " + nombre + " ataca. Vida del dragón: " + vidaDragon);

            if (vidaDragon > 0) {
                vida = vida - 20;
                System.out.println("Turno " + turno + ": el dragón ataca. Vida de " + nombre + ": " + vida);
            }

            turno++;
        }

        if (vida > 0) {
            System.out.println("¡Victoria! " + nombre + " derrotó al dragón.");
        } else {
            System.out.println("Derrota: el dragón ganó el combate.");
        }
    }
}