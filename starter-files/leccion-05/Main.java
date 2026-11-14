public class Main {

    // 1. Crea el método void mostrarEstado(String nombre, int vida)
    //    que muestre: nombre + " - Vida: " + vida

    // 2. Crea el método int calcularDanio(int nivel)
    //    que devuelva 10 + nivel * 5

    // 3. Crea el método int atacar(int vidaObjetivo, int danio)
    //    que devuelva vidaObjetivo - danio

    // 4. Crea el método int curar(int vida, int cantidad)
    //    que devuelva vida + cantidad

    public static void main(String[] args) {
        String nombre = "Luna";
        int nivelLuna = 3;
        int vida = 100;

        String nombreDragon = "Dragon";
        int nivelDragon = 2;
        int vidaDragon = 100;

        // 5. Muestra el estado de Luna y del dragón con mostrarEstado

        // 6. Luna ataca: guarda en danioLuna el resultado de calcularDanio(nivelLuna),
        //    actualiza vidaDragon con atacar(...) y muestra el estado del dragón

        // 7. El dragón contraataca: haz lo mismo con danioDragon y la vida de Luna

        // 8. Luna se cura 15 con curar(...) y muestra su estado
    }
}
