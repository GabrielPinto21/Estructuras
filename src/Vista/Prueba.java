/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import util.ArbolBinario;

public class Prueba {

    public static void main(String[] args) {

        ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();
        arbol.agregar(70);
        arbol.agregar(50);
        arbol.agregar(80);
        arbol.agregar(51);
        arbol.agregar(52);
        
           

        System.out.println(arbol);
        System.out.println(arbol.contains(40));

    }

}
