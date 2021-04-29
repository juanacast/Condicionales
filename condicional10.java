/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castellanodesarrollo;

import java.util.Scanner;

/**
 *
 * @author pc11
 */
public class condicional10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("");
        System.out.println("Ingrese un numero y se le mostraran los multiplos de 5: ");
        Scanner teclado= new Scanner(System.in);
        int num=teclado.nextInt();
        int a=1;
        while(a<=num) {
            a++;
            if(a%5==0)
                System.out.println("Los multiplos son: " +a);
            
            
        }
    }
    
}
