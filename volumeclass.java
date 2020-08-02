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
public class volumeclass {
    public static void main(String[] args)
    {
      box obj=new box();
      obj.depth=10;
      obj.height=20;
      obj.height=30;
      obj.volume();
     
    }
}


class box
{
    double depth;
    double height;
    double width;
    double vol;
    
  void volume()
  {
      vol=depth+height+width;
      System.out.println("VOLUME:"+vol);
  }
}