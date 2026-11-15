package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Ave ave = new Ave();
        ave.volar();
        ave.cantar();

        // El mismo objeto visto a través de cada "contrato"
        Volador v = ave;
        Cantante c = ave;
        v.volar();
        c.cantar();
    }
}