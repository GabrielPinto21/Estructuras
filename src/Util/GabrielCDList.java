/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

public class GabrielCDList<T extends Comparable<T>> {

    private NodoDoubleList<T> cabeza;
    private NodoDoubleList<T> cola;
    private int size;

    public GabrielCDList() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertarInicio(T objeto) {
        NodoDoubleList<T> nuevo = new NodoDoubleList<>(objeto, cabeza, null);
        if (esVacio()) {
            cabeza = nuevo;
            cola = nuevo;
            cabeza.setSig(cabeza);
            cabeza.setAnt(cabeza);
        } else {
            nuevo.setSig(cabeza);
            nuevo.setAnt(cola);
            cabeza.setAnt(nuevo);
            cola.setSig(nuevo);
            cabeza = nuevo;
        }
        size++;
    }

    public void insertarFin(T objeto) {
        NodoDoubleList<T> nuevo = new NodoDoubleList<>(objeto, cabeza, null);
        if (esVacio()) {
            cabeza = nuevo;
            cola = nuevo;
            cabeza.setSig(cabeza);
            cabeza.setAnt(cabeza);
        } else {
            cola.setSig(nuevo);
            nuevo.setAnt(cola);
            nuevo.setSig(cabeza);
            cabeza.setAnt(nuevo);
        }
        cola = nuevo;
        size++;
    }

    public T remove(int i) {
        validarPos(i);
        NodoDoubleList<T> b = getPos(i);
        if (size == 1) {
            cabeza = null;
            cola = null;
        } else {
            if (b == cabeza) {
                cabeza = b.getSig();
                cola.setSig(cabeza);
                cabeza.setAnt(cola);
            } else if (b == cola) {
                cola = b.getAnt();
                cola.setSig(cabeza);
                cabeza.setAnt(cola);
            } else {
                b.getAnt().setSig(b.getSig());
                b.getSig().setAnt(b.getAnt());
            }
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
        anterior.setSig(nuevo);
        nuevo.getSig().setAnt(nuevo);
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
        StringBuilder msg = new StringBuilder("cab<> ");
        if (!esVacio()) {
            NodoDoubleList<T> i = this.cabeza;
            do {
                msg.append(i.getInfo().toString()).append(" <-> ");
                i = i.getSig();
            } while (i != cabeza);
        }
        return msg.append("null").toString();
    }

    private NodoDoubleList<T> getPos(int i) {
        validarPos(i);
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
        if (!esVacio()) {
            do {
                if (p.getInfo().compareTo(valor) > 0) {
                    System.out.println(p.getInfo() + " - ");
                }
                p = p.getSig();
            } while (p != cabeza);
        }
    }
}
