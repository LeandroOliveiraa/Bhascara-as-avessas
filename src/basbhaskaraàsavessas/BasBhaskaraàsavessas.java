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

    // PROGRAMA BHASKARA AS AVESSAS
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("x1 ");
        double x1 = Double.parseDouble(leitor.nextLine());
        System.out.print("x2 ");
        double x2 = Double.parseDouble(leitor.nextLine());
        System.out.print("c ");
        double c = Double.parseDouble(leitor.nextLine());

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
