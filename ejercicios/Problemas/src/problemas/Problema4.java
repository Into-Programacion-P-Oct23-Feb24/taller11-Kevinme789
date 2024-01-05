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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        String nombre;
        String cedula;
        int opcion;
        System.out.println("Ingrese el nombre de el cliente");
        nombre = sc.nextLine();
        System.out.println("Ingrese la cedula de el cliente");
        cedula = sc.nextLine();
        System.out.println("Ingrese '1' para calcular el valor de la luz, '2' "
                + "para calcular el predio");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                calcularValorLuz(nombre, cedula);
                break;
            case 2:
                calcularPredio(nombre, cedula);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void calcularValorLuz(String n, String c) {
        Scanner sc = new Scanner(System.in);
        double valorKilowatio;
        int numKilowatio;
        double total;
        System.out.println("Ingrese el valor de el Kilowatio");
        valorKilowatio = sc.nextDouble();
        System.out.println("Ingrese el numero de Kilowatios consumidos");
        numKilowatio = sc.nextInt();
        total = (double) numKilowatio * valorKilowatio;
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor "
                + "de $%.0f\n", n, c, total);
    }

    public static void calcularPredio(String n, String c) {
        Scanner sc = new Scanner(System.in);
        double inmueble;
        double predio;
        System.out.println("Ingrese el valor de el inmueble");
        inmueble = sc.nextDouble();
        predio = inmueble * 0.02;
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble "
                + "valorado en $%.0f y tiene que pagar de predio $%.0f\n",
                n, c, inmueble, predio);
    }

}
