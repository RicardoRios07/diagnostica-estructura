/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elementoaula;

/**
 *
 * @author riosr
 */
public class Ventana extends ElementoAula {
    private boolean tieneCortinas;

    public Ventana(String nombre, String color, boolean tieneCortinas) {
        super(nombre, color);
        this.tieneCortinas = tieneCortinas;
    }

    public void mostrar() {
        System.out.println("Ventana: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Tiene cortinas: " + (tieneCortinas ? "Sí" : "No"));
    }
}