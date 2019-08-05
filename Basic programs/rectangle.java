/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
class rec
{
    int l=20,b=40;
    void area()
    {
        int a;
        a=l*b;
        System.out.println(a);
    }
    void parameter()
    {
        int p;
        p=2*(l+b);
         System.out.println(p);
    }
}
public class rectangle {
    public static void main(String [] args)
    {
        rec a=new rec();
        a.area();
        a.parameter();
    }
}
        
        
    
    

