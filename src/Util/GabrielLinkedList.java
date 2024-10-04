/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

public class GabrielLinkedList<T extends Comparable> {

    private Nodo<T> cabeza;
    private int size;

    public GabrielLinkedList() {
        this.cabeza = null;
    }

    public void insertarInicio(T objeto) {
        Nodo<T> nuevo = new Nodo<>(objeto, this.cabeza);
        this.cabeza = nuevo;
        size++;
    }

    public void insertarFin(T objeto) {
        if (this.esVacio()) {
            this.insertarInicio(objeto);
        } else {
            Nodo<T> nuevo = new Nodo<>(objeto, null);
            Nodo<T> ultimo = this.getPos(this.size - 1);
            ultimo.setSig(nuevo);
            size++;
        }
    }

    public boolean contains(T objeto) {
        if (objeto == null || this.esVacio()) {
            throw new RuntimeException("No puede buscar un elemento nulo o en una lista vacía");
        }
        for (Nodo<T> i = this.cabeza; i != null; i = i.getSig()) {
            if (i.getInfo().equals(objeto)) {
                return true;
            }
        }
        return false;
    }

    public T remove(int i) {
        this.validarPos(i);
        Nodo<T> b;
        Nodo<T> anterior;
        if (i == 0) {
            b = this.cabeza;
            this.cabeza = b.getSig();
        } else {
            anterior = this.getPos(i - 1);
            b = anterior.getSig();
            anterior.setSig(b.getSig());
        }
        b.setSig(null);
        this.size--;
        return b.getInfo();
    }

    public void agregarOrdenadoMenorMayor(T valor) {
        if (this.esVacio()) {
            insertarInicio(valor);
        } else {
            Nodo<T> x = this.cabeza;
            Nodo<T> y = x;
            while (x != null) {
                if (valor.compareTo(y.getInfo()) < 0) {
                    break;
                }
                y = x;
                x = x.getSig();
            }
            if (x == y) {
                insertarInicio(valor);
            } else {
                y.setSig(new Nodo<>(valor, x));
                size++;
            }
        }
    }

    public void agregarOrdenadoMayorMenor(T valor) {
        if (this.esVacio()) {
            insertarInicio(valor);
        } else {
            Nodo<T> x = this.cabeza;
            Nodo<T> y = x;
            while (x != null) {
                if (valor.compareTo(y.getInfo()) > 0) {
                    break;
                }
                y = x;
                x = x.getSig();
            }
            if (x == y) {
                insertarInicio(valor);
            } else {
                y.setSig(new Nodo<>(valor, x));
                size++;
            }
        }
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
        Nodo<T> nuevo = new Nodo<>(elem, null);
        if (pos == 0) {
            nuevo.setSig(cabeza);
            cabeza = nuevo;
        } else {
            Nodo<T> anterior = getPos(pos - 1);
            nuevo.setSig(anterior.getSig());
            anterior.setSig(nuevo);
        }
        size++;
    }

    public void clear() {
        this.cabeza = null;
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
        for (Nodo<T> i = this.cabeza; i != null; i = i.getSig()) {
            msg += i.getInfo().toString() + " -> ";
        }
        return msg + "null";
    }

    private Nodo<T> getPos(int i) {
        this.validarPos(i);
        Nodo<T> pos = this.cabeza;
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
        Nodo<T> p = cabeza;
        while (p != null) {
            if (p.getInfo().compareTo(valor) > 0) {
                System.out.println(p.getInfo() + " - ");
            }
            p = p.getSig();
        }
    }
}
