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
 class customerinvoice {
       public static void main(String[] args){
           customer obj=new customer(101,"aaa",20);
           System.out.println(obj.getid());
           System.out.println(obj.getname());
           System.out.println(obj.getdiscount());
           obj.setdiscount(30);
           System.out.println(obj.getdiscount());
           System.out.println(obj);
           
            invoice in=new invoice(200,obj,1000);
             System.out.println(in.getid());
              System.out.println(in.getcustomer());
            customer c2=new customer(200,"AAA",30);
            in.setcustomer(c2);
            System.out.println(in.getamount()); 
            in.setamount(2000);
             System.out.println(in.getcustomername());
             System.out.println(in.getamountafterdiscount());
              
       }
    
}
class customer
{
    int id;
    String name;
    int discount;
    customer(int i,String n,int d)
    {
        id=i;
        name=n;
        discount=d;
    }
    int getid()
    {
       return id; 
    }
     String getname()
     {
         return name;
     }
       int getdiscount()
       {
           return discount;
       }
       void setdiscount(int d1)
       {
           discount=d1;
       }
       public String toString()
       {
           return "ID:"+id+"\nNAME:"+name+"\nDISCOUNT:"+discount;
       }
}
class invoice
{
    int id;
    customer o;
    double amount;
    invoice(int i,customer o1,double a)
    {
        id=i;
        o=o1;
        amount=a;
    }
    int getid()
    {
        return id;
    }
     customer getcustomer()
    {
        return o;
    }
     void setcustomer(customer o2)
     {
         o= o2;
     }
     double getamount()
     {
         return amount;
     }
     void setamount(double a1)
     {
         amount= a1;
     }
     String getcustomername()
     {
        return o.name; 
     }
     double getamountafterdiscount()
     {
       return amount-(amount)*o.discount/100;  
     }
   
}