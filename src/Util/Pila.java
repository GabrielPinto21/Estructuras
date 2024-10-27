package util;

@SuppressWarnings("rawtypes")
public class Pila <T extends Comparable> {

    private GabrielLinkedList<T> tope = new GabrielLinkedList<>();

    public Pila() {
    }

    public void push(T info) {
        this.tope.insertarInicio(info);
    }

    public T pop() {
        return this.tope.remove(0);
    }

    public boolean esVacia() {
        return this.tope.esVacio();
    }

    public int size() {
        return this.tope.getSize();
    }

}
