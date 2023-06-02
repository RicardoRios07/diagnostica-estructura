/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elementoaula;

/**
 *
 * @author riosr
 */
public class Estante extends ElementoAula {
    private int numeroPuertas;

    public Estante(String nombre, String color, int numeroPuertas) {
        super(nombre, color);
        this.numeroPuertas = numeroPuertas;
    }

    public void mostrar() {
        System.out.println("Estante: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}