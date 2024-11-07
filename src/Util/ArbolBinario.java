package util;

public class ArbolBinario<T extends Comparable<T>> {

    private NodoBin<T> raiz;

    public ArbolBinario() {
    }

    public ArbolBinario(NodoBin<T> raiz) {
        this.raiz = raiz;
    }

    public void agregar(T dato) {
        raiz = agregar(dato, raiz);

    }

    private NodoBin<T> agregar(T dato, NodoBin<T> nodo) {
        if (nodo == null) {
            return new NodoBin<T>(dato);
        }

        if (dato.compareTo(nodo.getInfo()) > 0) {
            nodo.setDer(agregar(dato, nodo.getDer()));
        }
        if (dato.compareTo(nodo.getInfo()) < 0) {
            nodo.setIzq(agregar(dato, nodo.getIzq()));
        }

        return nodo;

    }

    public boolean contains(T obj) {
        return contains(raiz, obj);
    }

    private boolean contains(NodoBin<T> nodo, T obj) {
        if (nodo == null) {
            return false;
        }
        if (nodo.getInfo().equals(obj)) {
            return true;
        }

        return contains(nodo.getIzq(), obj) || contains(nodo.getDer(), obj);
    }

    @Override
    public String toString() {
        return toString(raiz);
    }

    private String toString(NodoBin<T> nodo) {
        if (nodo == null) {
            return "null";
        }

        String izquierda = toString(nodo.getIzq());
        String derecho = toString(nodo.getDer());

        return nodo.getInfo() + "(" + izquierda + "," + derecho + ")";
    }

}
