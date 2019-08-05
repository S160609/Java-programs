/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class prime_number {
    public static void main(String [] args)
    {
        int a=6,c,i;
        c=0;
        for(i=2;i<=a;i++)
        {
            if(a%i==0)
            {
                c=c+1;
            }
          
       
        }
        if(c==1)
        {
             System.out.println("a is prime number");
        }
        else
        {
             System.out.println("a is not a prime number");
        }
}
}
            
            

            
            
        
            
        
        
        
 
