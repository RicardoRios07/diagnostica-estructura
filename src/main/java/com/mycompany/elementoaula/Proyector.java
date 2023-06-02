/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elementoaula;

/**
 *
 * @author riosr
 */
public class Proyector extends ElementoAula {
    private String resolucion;
    private boolean portatil;

    public Proyector(String nombre, String color, String resolucion, boolean portatil) {
        super(nombre, color);
        this.resolucion = resolucion;
        this.portatil = portatil;
    }

    public void mostrar() {
        System.out.println("Proyector: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Resolución: " + resolucion);
        System.out.println("Portátil: " + (portatil ? "Sí" : "No"));
    }
}
