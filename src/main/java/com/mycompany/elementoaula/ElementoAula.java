/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elementoaula;

/**
 *
 * @author riosr
 */
public abstract class ElementoAula {

    protected String nombre;
    protected String color;

    public ElementoAula(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;

    }

    public abstract void mostrar();
}
