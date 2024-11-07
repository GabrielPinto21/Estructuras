package util;

public class NodoBin<T extends Comparable> {

    private T info;
    private NodoBin<T> izq, der;

    public NodoBin() {
    }

    public NodoBin(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodoBin<T> getIzq() {
        return izq;
    }

    public void setIzq(NodoBin<T> izq) {
        this.izq = izq;
    }

    public NodoBin<T> getDer() {
        return der;
    }

    public void setDer(NodoBin<T> der) {
        this.der = der;
    }

}
