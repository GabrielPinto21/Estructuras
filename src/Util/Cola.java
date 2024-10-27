package util;

@SuppressWarnings("rawtypes")
public class Cola <T extends Comparable> {

    private GabrielLinkedList<T> tope = new GabrielLinkedList<>();

    public Cola() {
    }

    public void enColar(T info) {
        this.tope.insertarFin(info);
    }

    public T deColar() {
        return this.tope.remove(0);
    }

    public boolean esVacia() {
        return this.tope.esVacio();
    }

    public int size()
    {
        return this.tope.getSize();
    }

}
