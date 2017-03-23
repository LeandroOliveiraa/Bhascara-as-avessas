/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basbhaskaraàsavessas;

import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class BasBhaskaraàsavessas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("x1 ");
        double x1 = leitor.nextDouble();
        System.out.print("x2 ");
        double x2 = leitor.nextDouble();
        System.out.print("c ");
        double c = leitor.nextDouble();

        // PROCESSAMENTO
        double s = x1 * x2;
        double p = x1 * x2;
        double a = c / p;
        double b = -(s * a);

        // SAIDA
        System.out.println("operacao que tem raizes "
        +x1
        + " e "
        + x2
        + a       
        + "x² "      
        + c);
        
        
        
        
    }

}
