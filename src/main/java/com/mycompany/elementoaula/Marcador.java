/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elementoaula;

/**
 *
 * @author riosr
 */
public class Marcador extends ElementoAula {
    private String tipo;

    public Marcador(String nombre, String color, String tipo) {
        super(nombre, color);
        this.tipo = tipo;
    }

    public void mostrar() {
        System.out.println("Marcador: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
    }
}
