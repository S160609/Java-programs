/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class number_factorial {
    public static void main(String [] args)
    {
        int n=5,fact,i;
        fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of given number: "+fact);
    }
}
