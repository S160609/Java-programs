/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class continue_statement {
    public static void main(String [] args)
    {
        int i=0;
        do
        {
           i++;
            if(i==5)
                continue;
           
            System.out.println(+i+"\t");
    
        }
        while(i<=10);
    }
            
    
}
