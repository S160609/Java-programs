/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class else_if {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        
      
        System.out.println("There are a=35,b=1,c=23");
        if((a>b)&&(a>c))
            System.out.println("a is largest number");
        else if((b>c)
            System.out.println("b is largest number");
        else
            System.out.println("c is largest number");
    }
    
}
