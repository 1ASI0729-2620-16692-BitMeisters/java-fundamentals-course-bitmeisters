public class Main{
    public static void main(String[] args){
        String nombre = "Luna";
        int vida = 100;
        int nivel = 1;
        int experiencia = 0;
        int dmg = 30;
        
        System.out.println(nombre + "empieza con " + vida + " de vida.");

        // 1. Resta danio a vida y muestra la vida que le queda
        // 2. Crea int danioCritico con el doble de danio (danio * 2), réstalo a vida y muestra la vida
        // 3. Suma 250 a experiencia
        // 4. Crea int nivelesGanados = experiencia / 100 (cada 100 puntos sube un nivel)
        // 5. Crea int experienciaSobrante = experiencia % 100 (lo que sobra después de subir)
        // 6. Suma nivelesGanados a nivel y muestra el nivel actual
        // 7. Crea boolean sigueViva = vida > 0 y muéstralo
        // 8. Crea boolean puedeEnfrentarJefe = nivel >= 3 && vida > 50 y muéstralo
        // 9. Crea boolean necesitaCurarse = vida < 20 || nivel == 1 y muéstralo
    }
}