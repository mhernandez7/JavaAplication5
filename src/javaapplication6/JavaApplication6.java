/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class JavaApplication6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        float number1 = 0;
        
        Number n1 = new Number();
        Number n2 = new Number();
        
        System.out.println("Ingrese un numero: ");
        number1 = read.nextFloat();
        
        //n1.setNumber(number1);
        //n1.NumberCuad();
        
        n2.setNumber(number1);
       
        System.out.println("El resultado de la operacion es: "+n2.NumberCuadRet());
        
        
    }
    
}
