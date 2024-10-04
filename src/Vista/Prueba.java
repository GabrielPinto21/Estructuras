/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Util.GabrielLinkedList;
import modelo.Persona;

/**
 *
 * @author Gabriel Pinto
 */
public class Prueba {
    public static void main(String[] args) {
        GabrielLinkedList<Persona> list = new GabrielLinkedList<>();
        list.insertarFin(new Persona("Armando"));
        list.insertarFin(new Persona("Lucia"));
        list.insertarFin(new Persona("Jhonny"));
//        list.agregarPosicion(1, new Persona("Lucio"));
//        list.agregarPosicion(2, new Persona("Esmeralda"));
//        list.agregarPosicion(3, new Persona("Román"));
//        list.agregarPosicion(4, new Persona("Valeria"));
//        list.agregarPosicion(5, new Persona("Sofía"));
//        list.agregarPosicion(6, new Persona("Perla"));
        list.agregarOrdenadoMenorMayor(new Persona("Eva"));
        // list.add(5, new Persona("Gabriel"));
        System.out.println(list);
        
    }
    
}
