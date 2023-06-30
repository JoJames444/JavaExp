/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp11;

/**
 *
 * @author shail
 */
public class InheritanceDemo {
    
    
    public static void main(String[] args) {
        Rectangle R=new Rectangle(10, 5);
        System.out.println("Peimeter "+R.getPerimeter());
        System.out.println("Area "+R.getArea());
        
        
        Box B = new Box(10, 5, 7);
        System.out.println("Peimeter "+B.getPerimeter());
        System.out.println("Area "+B.getArea());
        System.out.println("Volume : "+B.getVolume());
        
    }
    
}

class Rectangle{
    
    protected int length;
    protected int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    int getPerimeter()
    {
        return 2*(length+breadth);
    }
    int getArea()
    {
        return length*breadth;
    }
   
}

class Box extends Rectangle{
    
    private int height;

    public Box( int length, int breadth, int height) {
        super(length, breadth);
        this.height=height;
  
    }
    int getPerimeter()
    {
        return 4*(length+breadth+height);
    }
    
     int getArea()
    {
        return 2*(length*breadth+height*breadth+length*height);
    }
    int getVolume()
    {
        return 2*(length*breadth*height);
    }
    
}



