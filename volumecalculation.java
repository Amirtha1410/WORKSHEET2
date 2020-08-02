/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram.worksheet;

/**
 *
 * @author ELCOT
 */
public class volumecalculation {
    
    
    public static void main(String[] args)
    {
        test obj=new test();
         obj.depth=10;
         obj.height=20;
         obj.width=30;
         obj.volume();
        
        test obj1=new test();
         obj1.depth=1;
         obj1.height=2;
         obj1.width=3;
         obj1.volume();
        
    }
}



class test
{
    double depth;
    double height;
    double width;
    double vol;
    
    public void volume()
 {
     vol=depth*width*height;
     System.out.println("VOLUME:\n"+vol);
 }
 
}