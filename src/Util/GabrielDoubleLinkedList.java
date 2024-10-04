/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

public class GabrielDoubleLinkedList<T extends Comparable<T>> {

    private NodoDoubleList<T> cabeza;
    private NodoDoubleList<T> cola;
    private int size;

    public GabrielDoubleLinkedList() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertarInicio(T objeto) {
        NodoDoubleList<T> nuevo = new NodoDoubleList<>(objeto, cabeza, null);
        if (cabeza != null) {
            cabeza.setAnt(nuevo);
        } else {
            cola = nuevo;
        }
        cabeza = nuevo;
        size++;
    }

    public void insertarFin(T objeto) {
        if (this.esVacio()) {
            insertarInicio(objeto);
        } else {
            NodoDoubleList<T> nuevo = new NodoDoubleList<>(objeto, null, cola);
            cola.setSig(nuevo);
            cola = nuevo;
            size++;
        }
    }

    public T remove(int i) {
        this.validarPos(i);
        NodoDoubleList<T> b = getPos(i);
        if (b.getAnt() != null) {
            b.getAnt().setSig(b.getSig());
        } else {
            cabeza = b.getSig();
        }
        if (b.getSig() != null) {
            b.getSig().setAnt(b.getAnt());
        } else {
            cola = b.getAnt();
        }
        b.setSig(null);
        b.setAnt(null);
        size--;
        return b.getInfo();
    }

    public void agregarPosicion(T elem, int pos) {
        pos--;

        if (pos < 0 || pos > size) {
            throw new RuntimeException("Índice fuera de rango");
        }
        if (pos == size) {
            insertarFin(elem);
            return;
        }
        NodoDoubleList<T> nuevo = new NodoDoubleList<>(elem, null, null);
        if (pos == 0) {
            insertarInicio(elem);
            return;
        }
        NodoDoubleList<T> anterior = getPos(pos - 1);
        nuevo.setSig(anterior.getSig());
        nuevo.setAnt(anterior);
        if (anterior.getSig() != null) {
            anterior.getSig().setAnt(nuevo);
        }
        anterior.setSig(nuevo);
        size++;
    }

    public void clear() {
        this.cabeza = null;
        this.cola = null;
        this.size = 0;
    }

    public T get(int i) {
        return this.getPos(i).getInfo();
    }

    public void set(int i, T elemento) {
        this.getPos(i).setInfo(elemento);
    }

    public boolean esVacio() {
        return this.cabeza == null;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        String msg = "cab<> ";
        for (NodoDoubleList<T> i = this.cabeza; i != null; i = i.getSig()) {
            msg += i.getInfo().toString() + " <-> ";
        }
        return msg + "null";
    }

    private NodoDoubleList<T> getPos(int i) {
        this.validarPos(i);
        NodoDoubleList<T> pos = this.cabeza;
        for (int j = 0; j < i; j++) {
            pos = pos.getSig();
        }
        return pos;
    }

    private void validarPos(int i) {
        if (this.esVacio() || i < 0 || i >= this.size) {
            throw new RuntimeException("Índice: " + i + " fuera de rango");
        }
    }

    public void imprimirMayores(T valor) {
        NodoDoubleList<T> p = cabeza;
        while (p != null) {
            if (p.getInfo().compareTo(valor) > 0) {
                System.out.println(p.getInfo() + " - ");
            }
            p = p.getSig();
        }
    }
}
