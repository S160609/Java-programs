/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Anjali
 */
public class arithmetic_using_switch {
    public static void main(String [] args)
    {
        int a=78,b=45,d,e,f,g,h;
        char c;
        c='%';
        switch(c)
        {
            case '+':d=a+b;
                    System.out.println("addition of a and b:"+d);
                break;
            case '-':e=a-b;
                    System.out.println("subtraction of a and b:"+e);
                break;
            case '*':f=a*b;
                    System.out.println("multipication of a and b:"+f);
                break;
            case '/':g=a/b;
                    System.out.println("quotient of a and b:"+g);
                break;
            case '%':h=a%b;
                System.out.println("Remainder of a and b:"+h);
                break;
            default :System.out.println("invalid");    
        }
    }
    
}
