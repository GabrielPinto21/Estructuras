/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriel Pinto
 */
public class Persona implements Comparable {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Object o) {
        if (o != null) {
            Persona p = (Persona) o;
            return nombre.compareTo(p.getNombre());
        }
        throw new RuntimeException("No se puede mamawebo");
    }

    public String getNombre() {
        return nombre;
    }

    public boolean equals(Object o) {
        if (o != null) {
            Persona p = (Persona) o;
            return this.nombre.equals(p.getNombre());
        }
        throw new RuntimeException("Nosematipoti");
    }

    @Override
    public String toString() {
        return nombre;
    }

}
