/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class fibnocci_series {
    public static void main(String [] args)
    {
        int a=0,b=1,c,d,i;
         System.out.print(a+" "+b);
        d=5;
        for(i=2;i<d;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            
            
        }
    }
    
}
