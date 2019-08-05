/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class prime_1_100 {
    public static void main(String [] args)
    {
        int i,c,j;
        c=0;
        for(i=1;i<=100;i++)
        {
        for(j=2;j<=i;j++)
        {
            if(i%j==0)
            {
                c=c+1;
            }
          
       
        }
        
        if(c==1)
        {
             System.out.println(i);
           
             
         }
        c=0;
        }
 
}
}
            
            

            
            
        
            
        
        
        
 
