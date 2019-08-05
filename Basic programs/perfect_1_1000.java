/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class perfect_1_1000 {
    public static void main(String [] args)
    {
        int i,sum,j;
        sum=0;
        for(i=1;i<=500;i++)
        {
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
        if(i==sum)
        {
            System.out.println(i);
        }
        sum=0;
        }
    }
}
           
 