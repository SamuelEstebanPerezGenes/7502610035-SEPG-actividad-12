package ejercicio3;

// Mala práctica: un árbol no corre
public class Arbol implements Corredor {
    @Override
    public void correr() {
        System.out.println("Los árboles no pueden correr.");
    }
}