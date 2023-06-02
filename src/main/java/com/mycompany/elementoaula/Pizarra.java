/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elementoaula;

/**
 *
 * @author riosr
 */
public class Pizarra extends ElementoAula {
    private double ancho;
    private double alto;

    public Pizarra(String nombre, String color, double ancho, double alto) {
        super(nombre, color);
        this.ancho = ancho;
        this.alto = alto;
    }

    public void mostrar() {
        System.out.println("Pizarra: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Dimensiones: " + ancho + " x " + alto);
    }
}
