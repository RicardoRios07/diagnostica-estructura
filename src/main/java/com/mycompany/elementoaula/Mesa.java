/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elementoaula;

/**
 *
 * @author riosr
 */
public class Mesa extends ElementoAula {
    private int numeroPatas;

    public Mesa(String nombre, String color, int numeroPatas) {
        super(nombre, color);
        this.numeroPatas = numeroPatas;
    }

    public void mostrar() {
        System.out.println("Mesa: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Número de patas: " + numeroPatas);
    }
}