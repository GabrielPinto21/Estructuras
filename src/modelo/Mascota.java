/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gabriel Pinto
 */
public class Mascota implements Comparable<Mascota> {

    private int id;
    private int edad;

    public Mascota() {
    }

    public Mascota(int id, int edad) {
        this.id = id;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Mascota o) {
        if (this.getEdad() > o.getEdad()) {
            return 1;
        } else if (this.getEdad() < o.getEdad()) {
            return -1;
        } else {
            return 0;
        }
    }

}
