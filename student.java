/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram.worksheet;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class student {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        student1 obj1[]=new student1[100];
        for(int i=0;i<10;i++)
        {
        System.out.println("Enter the name of the student:");
        String n=obj.next();
         System.out.println("Enter the marks:");
         double m1=obj.nextDouble();
         double m2=obj.nextDouble();
         double m3=obj.nextDouble();
         System.out.println("Enter the department:");
         String d=obj.next();
        System.out.println("STUDENT DETAILS:"); 
        obj1[i]=new student1(n,m1,m2,m3,d);
        obj1[i].getvalue();
        obj1[i].calgrade();
        obj1[i].display();
        }
    }
}

class student1
{
    String name,dept,status;
    double mark1,mark2,mark3;
    double avg;
    double sum;
    student1(String n,double m1,double m2,double m3,String d)
    {
        name=n;
        mark1=m1;
        mark2=m2;
        mark3=m3;
        dept=d;
        
    }
   public void getvalue()
   {
         Scanner obj=new Scanner(System.in);
   }
   public void calgrade()
    {
        sum=mark1+mark2+mark3;
        avg= sum/3;  
        if(mark1<50 || mark2<50 || mark3<50)
        {
           status="FAIL";   
        }
        else if(avg>=80)
        {
            status="FIRSTCLASS";   
        }
        else if(avg>=70 && avg<=79)
        {
             status="SECOND CLASS";   
        }
        else if(avg>=50 && avg<69)
        {
             status="THIRD CLASS";   
        }
    }
  
    public void display()
    {
         System.out.println("\nNAME:"+name);
         System.out.println("\nDEPARTMENT:"+dept);
         System.out.println("\nMARKS:\nM1:"+mark1+"\nM2:"+mark2+"\nM3:"+mark3); 
         System.out.println("AVERAGE:"+avg);   
         System.out.println("STATUS:"+status); 
     }
}
