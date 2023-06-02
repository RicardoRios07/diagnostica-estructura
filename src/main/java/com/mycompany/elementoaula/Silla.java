/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elementoaula;

/**
 *
 * @author riosr
 */
public class Silla extends ElementoAula {
    private String material;

    public Silla(String nombre, String color, String material) {
        super(nombre, color);
        this.material = material;
    }

    public void mostrar() {
        System.out.println("Silla: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
    }
}

