/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author camil
 */
public class Nodo {

    private Nodo next;
    private int info;

    public Nodo() {
    }

    public Nodo(int data) {
        this.info = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public int getInfo() {
        return info;
    }

    public void setData(int info) {
        this.info = info;
    }

}
