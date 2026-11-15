package ejercicio3;

public class Avion implements Volador {

    // --- Comenta este método para ver el error de compilación ---
    // Error: 'Avion' is not abstract and does not override abstract method volar() in 'Volador'
    @Override
    public void volar() {
        System.out.println("El avión está volando.");
    }
}