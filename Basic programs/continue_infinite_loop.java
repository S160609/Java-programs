/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class continue_infinite_loop {
      public static void main(String [] Infinite)
    {
        int i=0;
        do
        {
            System.out.println(+i+"\t");
                    if(i==5)
                continue;
                    i++;
        }
        while(i<=10);
    }
            
    
}

    

