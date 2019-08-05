/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class nestedif {
    public static void main(String [] args)
    {
        int a=30,b=90,c=36;
        System.out.println("There are a=30,b=90,c=36");
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is largest number");
            }
            
                
        }
        if(b>a)
        {
            if(b>c)
            {
                System.out.println("b is largest number");
            }
        }
        if(c>a)
        {
            if(c>b)
            {
                System.out.println("c is largest number");
            }
        }
    }
    
}
