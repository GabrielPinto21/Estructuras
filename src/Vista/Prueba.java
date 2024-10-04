/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import util.GabrielLinkedList;
import modelo.Persona;

public class Prueba {

    public static void main(String[] args) {

        GabrielLinkedList<Persona> list = new GabrielLinkedList<>();
        list.insertarFin(new Persona("Armando"));
        list.insertarFin(new Persona("Lucia"));
        list.insertarFin(new Persona("Jhonny"));
        System.out.println(list.toString());
        list.agregarPosicion(new Persona("Esmeralda"), 1);
        list.agregarPosicion(new Persona("Román"), 2);
        list.agregarPosicion(new Persona("Valeria"), 3);
        list.agregarPosicion(new Persona("Sofía"), 4);
        list.agregarPosicion(new Persona("Perla"), 5);
        System.out.println(list.toString());
        list.agregarOrdenadoMenorMayor(new Persona("Eva"));
        list.insertarInicio(new Persona("Gabriel"));
        System.out.println(list);

    }

}
