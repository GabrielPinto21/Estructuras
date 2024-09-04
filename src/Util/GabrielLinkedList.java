/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author camil
 */
public class GabrielLinkedList {

    private Nodo cabeza;

    public GabrielLinkedList(Nodo head) {
        this.cabeza = null;
    }

    public void addLast(int val) {
        if (cabeza == null) {
            cabeza = new Nodo(val);
        } else {
            Nodo p = cabeza;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            Nodo s = new Nodo(val);
            p.setNext(s);
        }
    }

    public void agregarDespues(int valorAgregar, int valorEncontrar) {
        if (cabeza == null) {
            cabeza = new Nodo(valorAgregar);
        } else {
            Nodo p = cabeza;
            while (p.getInfo() != valorEncontrar) {
                p = p.getNext();
            }//validar cuando no encuentra el valor a encontar 
            Nodo x = new Nodo(valorAgregar);
            Nodo s = p.getNext();
            p.setNext(x);
            x.setNext(s);

        }
    }
//    agregarPrimero
//    agregar antes  
//            agregar enposicion
//                    encontrar
//                            delate 

}
