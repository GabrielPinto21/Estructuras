/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

public class NodoDoubleList<T> {

    private T info;
    private NodoDoubleList<T> sig;
    private NodoDoubleList<T> ant;

    NodoDoubleList() {
    }

    NodoDoubleList(T info, NodoDoubleList<T> sig, NodoDoubleList<T> ant) {
        this.info = info;
        this.sig = sig;
        this.ant = ant;
    }

    T getInfo() {
        return info;
    }

    NodoDoubleList<T> getSig() {
        return sig;
    }

    NodoDoubleList<T> getAnt() {
        return ant;
    }

    void setInfo(T info) {
        this.info = info;
    }

    void setSig(NodoDoubleList<T> sig) {
        this.sig = sig;
    }

    void setAnt(NodoDoubleList<T> ant) {
        this.ant = ant;
    }
}
