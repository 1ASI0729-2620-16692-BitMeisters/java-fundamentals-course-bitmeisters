public class Main {
    public static void main(String[] args) {
        String nombre = "Luna";
        int vida = 100;
        int nivel = 1;
        int experiencia = 0;
        int danio = 30;

        System.out.println(nombre + " empieza con " + vida + " de vida.");

        // Operadores aritméticos: recibir daño
        vida = vida - danio;
        System.out.println("Primer golpe (-" + danio + "). Vida: " + vida);

        int danioCritico = danio * 2;
        vida = vida - danioCritico;
        System.out.println("Golpe crítico (-" + danioCritico + "). Vida: " + vida);

        // División entera y resto: ganar experiencia y subir de nivel
        experiencia = experiencia + 250;
        int nivelesGanados = experiencia / 100;
        int experienciaSobrante = experiencia % 100;
        nivel = nivel + nivelesGanados;

        System.out.println("Experiencia ganada: " + experiencia);
        System.out.println("Niveles ganados: " + nivelesGanados);
        System.out.println("Experiencia sobrante: " + experienciaSobrante);
        System.out.println("Nivel actual: " + nivel);

        // Operadores de comparación: el resultado es true o false
        boolean sigueViva = vida > 0;
        boolean esNivelUno = nivel == 1;
        System.out.println("¿Sigue viva? " + sigueViva);
        System.out.println("¿Es nivel 1? " + esNivelUno);

        // Operadores lógicos: combinan condiciones
        boolean puedeEnfrentarJefe = nivel >= 3 && vida > 50;
        boolean necesitaCurarse = vida < 20 || nivel == 1;
        System.out.println("¿Puede enfrentar al jefe? " + puedeEnfrentarJefe);
        System.out.println("¿Necesita curarse? " + necesitaCurarse);
    }
}