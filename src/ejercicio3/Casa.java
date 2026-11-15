package ejercicio3;

// Mala práctica: una casa no se mueve
public class Casa implements Movible {
    @Override
    public void moverse() {
        System.out.println("Las casas no se mueven.");
    }
}