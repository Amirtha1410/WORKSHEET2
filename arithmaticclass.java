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
public class arithmaticclass {
     public static void main(String[] args)
     {
        
        arithmatic obj=new arithmatic();
        System.out.println("The numbers are");
        int a=20;
        int b=10;
       System.out.println("\nA="+a+"\nB="+b);
        System.out.println("ADDITION");
         System.out.println(obj.add(a,b));
           System.out.println("SUBTRACTION");
         System.out.println(obj.sub(a,b));
            System.out.println("MULTIPLICATION");
         System.out.println(obj.mul(a,b));
            System.out.println("DIVISION");
         System.out.println(obj.div(a,b));
    }
    
}
class arithmatic {
        
    //int a=10;
    //int b=20;
    int add(int a,int b)
    {
      return a+b;  
    }
    int sub(int a,int b)
    {
       return a-b; 
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;
    }
}
