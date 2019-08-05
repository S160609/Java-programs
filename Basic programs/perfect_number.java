/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class perfect_number {
    public static void main(String [] args)
    {
        int n=5,sum,i;
        sum=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n==sum)
        {
            System.out.println("n is a perfect number");
            
        }
        else
        {
            System.out.println("n is not a perfect number");
        }
        
        
    }
    
}