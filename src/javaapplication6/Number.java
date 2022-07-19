/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Miguel
 */
public class Number {
    
    private float number1;
    
    public Number (float number1){
        this.number1 = number1;
    }
    
    public Number(){
        this.number1 = 0;
    }
    public float getNumber(){
        return number1;
    }
    
    public void setNumber(float number1){
        this.number1 = number1;
    }
    
    public void NumberCuad(){
        
        
        if (this.number1 %4 == 0 || this.number1 %16 == 0)
        {
            this.number1 = (float)(Math.pow(this.number1, 2));
            
            System.out.println( "el cuadrado del numero es: "+this.number1);
        }
        else {
            System.out.println( "el numero ingresado no es multiplo de 4 o 16") ;
        }
    
    
    }
    
     public float NumberCuadRet(){
        float resul = 0;
        
        if (this.number1 %4 == 0 || this.number1 %16 == 0)
        {
            this.number1 = (float)(Math.pow(this.number1, 2));
            
            resul= this.number1;
        }
        else {
            System.out.println( "el numero ingresado no es multiplo de 4 o 16") ;
            resul= this.number1;
        }
        
     return resul;
     }
}
