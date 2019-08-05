/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class inc_dec_operators {
    public static void main(String [] args)
    {
        int a=12;
        int b=a++;
        int c=++a;
        int d=a--;
        int e=--a;
        System.out.println("post increment value of a:"+b);
        System.out.println("pre increment value of a:"+c);
        System.out.println("post decrement value of a:"+d);
        System.out.println("pre decrement value of a:"+e);
    }
    
}
