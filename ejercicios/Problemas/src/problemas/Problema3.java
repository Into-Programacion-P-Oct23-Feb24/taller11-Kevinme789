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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double n4;
        String respuesta;
        System.out.println("Ingrese primera nota");
        n1 = sc.nextDouble();
        System.out.println("Ingrese segunda nota");
        n2 = sc.nextDouble();
        System.out.println("Ingrese tercera nota");
        n3 = sc.nextDouble();
        System.out.println("Ingrese cuarta nota");
        n4 = sc.nextDouble();
        respuesta = promedioCualitativo(n1, n2, n3, n4);
        System.out.printf("El promedio de las notas: %.2f, %.2f. %.2f, %.2f"
                + " es %s", n1, n2, n3, n4, respuesta);
    }

    public static String promedioCualitativo(double nt1, double nt2, double nt3,
            double nt4) {
        double promedio = (nt1 + nt2 + nt3 + nt4) / 4;
        String cualitativo = "";
        if (promedio >= 0 && promedio <= 5) {
            cualitativo = "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            cualitativo = "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            cualitativo = "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            cualitativo = "Muy Bueno";
        }
        return cualitativo;
    }

}
