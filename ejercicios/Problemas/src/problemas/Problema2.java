/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        int opcion;
            System.out.println("Ingrese '1' para obtener area de un cuadrado, "
                    + "'2' para obtener el area de un triangulo, '3' para obtener"
                    + " el area de un rectangulo");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    obtenerAreaCuadrado();
                    break;
                case 2:
                    obtenerAreaTriangulo();
                    break;
                case 3:
                    obtenerAreaRectangulo();
                    break;
                default:
                    System.out.println("Opcion ingresada no valida");
                    break;
            }

        
    }

    public static void obtenerAreaCuadrado() {
        Scanner sc = new Scanner(System.in);
        double lado;
        System.out.println("Ingrese el valor de un lado");
        lado = sc.nextDouble();
        lado = lado * lado * lado * lado;
        System.out.println("El area de el Cuadrado es: " + lado);

    }

    public static void obtenerAreaTriangulo() {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        base = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = sc.nextDouble();
        area = (base * altura) / 2;
        System.out.println("El area de el Triangulo es: " + area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        base = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = sc.nextDouble();
        area = (base * altura);
        System.out.println("El area de el Rectangulo es: " + area);
    }

}
