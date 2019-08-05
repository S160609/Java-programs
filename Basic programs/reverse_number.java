/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class reverse_number {
    public static void main(String [] args)
    {
        int n=341,r,reverse;
        reverse=0;
        while(n!=0)
        {
            r=n%10;
            reverse= reverse*10+r;
            n=n/10;
            
        }
        System.out.println("reverse of the given number is:"+reverse);
        
    }
    
}
