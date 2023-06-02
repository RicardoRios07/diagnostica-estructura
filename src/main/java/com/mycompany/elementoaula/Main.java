/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.elementoaula;

import java.util.Scanner;

/**
 *
 * 
 * @author riosr
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("Creación de objetos en un aula de clases");
        System.out.println("-----------------------------------------");
        System.out.println("---------------RICARDO RIOS--------------");

        System.out.println("Selecciona el objeto que deseas crear: ");
        System.out.println("1. Silla ");
        System.out.println("2. Mesa");
        System.out.println("3. Marcador");
        System.out.println("4. Pizarra");
        System.out.println("5. Proyector");
        System.out.println("6. Estante");
        System.out.println("7. Ventana");
        System.out.println("0. SALIR");

        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        ElementoAula objeto = null;

        switch (opcion) {
            case 1:
                objeto = crearSilla(scanner);
                break;
            case 2:
                objeto = crearMesa(scanner);
                break;
            case 3:
                objeto = crearMarcador(scanner);
                break;
            case 4:
                objeto = crearPizarra(scanner);
                break;
            case 5:
                objeto = crearProyector(scanner);
                break;
            case 6:
                objeto = crearEstante(scanner);
                break;
            case 7:
                objeto = crearVentana(scanner);
                break;
            case 0:
                return;
            default:
                System.out.println("Opción inválida");
        }

        if (objeto != null) {
            System.out.println();
            System.out.println("Objeto creado:");
            System.out.println("--------------------------");
            objeto.mostrar();
        }
    }

    private static Silla crearSilla(Scanner scanner) {
        System.out.println("Ingrese el nombre de la silla:");
        String nombreSilla = scanner.nextLine();
        System.out.println("Ingrese el color de la silla:");
        String colorSilla = scanner.nextLine();
        System.out.println("Ingrese el material de la silla:");
        String materialSilla = scanner.nextLine();

        return new Silla(nombreSilla, colorSilla, materialSilla);
    }

    private static Mesa crearMesa(Scanner scanner) {
        System.out.println("Ingrese el nombre de la mesa:");
        String nombreMesa = scanner.nextLine();
        System.out.println("Ingrese el color de la mesa:");
        String colorMesa = scanner.nextLine();
        System.out.println("Ingrese el número de patas de la mesa:");
        int numeroPatasMesa = scanner.nextInt();

        return new Mesa(nombreMesa, colorMesa, numeroPatasMesa);
    }

    private static Marcador crearMarcador(Scanner scanner) {
        System.out.println("Ingrese el nombre del marcador:");
        String nombreMarcador = scanner.nextLine();
        System.out.println("Ingrese el color del marcador:");
        String colorMarcador = scanner.nextLine();
        System.out.println("Ingrese el tipo de marcador:");
        String tipoMarcador = scanner.nextLine();

        return new Marcador(nombreMarcador, colorMarcador, tipoMarcador);
    }

    private static Pizarra crearPizarra(Scanner scanner) {
        System.out.println("Ingrese el nombre de la pizarra:");
        String nombrePizarra = scanner.nextLine();
        System.out.println("Ingrese el color de la pizarra:");
        String colorPizarra = scanner.nextLine();
        System.out.println("Ingrese el ancho de la pizarra:");
        double anchoPizarra = scanner.nextDouble();
        System.out.println("Ingrese el alto de la pizarra:");
        double altoPizarra = scanner.nextDouble();

        return new Pizarra(nombrePizarra, colorPizarra, anchoPizarra, altoPizarra);
    }

    private static Proyector crearProyector(Scanner scanner) {
        System.out.println("Ingrese el nombre del proyector:");
        String nombreProyector = scanner.nextLine();
        System.out.println("Ingrese el color del proyector:");
        String colorProyector = scanner.nextLine();
        System.out.println("Ingrese la resolución del proyector:");
        String resolucionProyector = scanner.nextLine();
        System.out.println("Ingrese si el proyector es portátil (true/false):");
        boolean portatilProyector = scanner.nextBoolean();

        return new Proyector(nombreProyector, colorProyector, resolucionProyector, portatilProyector);
    }

    private static Estante crearEstante(Scanner scanner) {
        System.out.println("Ingrese el nombre del estante:");
        String nombreEstante = scanner.nextLine();
        System.out.println("Ingrese el color del estante:");
        String colorEstante = scanner.nextLine();
        System.out.println("Ingrese el número de puertas del estante:");
        int numeroPuertasEstante = scanner.nextInt();

        return new Estante(nombreEstante, colorEstante, numeroPuertasEstante);
    }

    private static Ventana crearVentana(Scanner scanner) {
        System.out.println("Ingrese el nombre de la ventana:");
        String nombreVentana = scanner.nextLine();
        System.out.println("Ingrese el color de la ventana:");
        String colorVentana = scanner.nextLine();
        System.out.println("Ingrese si la ventana tiene cortinas (true/false):");
        boolean tieneCortinasVentana = scanner.nextBoolean();

        return new Ventana(nombreVentana, colorVentana, tieneCortinasVentana);
    }
}