/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp12;

/**
 *
 * @author shail
 */
public class InterfacesDemo {
    
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(5, 7);
        System.out.println("\nArea : "+rect.getArea() + "\nPerimter : "+rect.getPerimeter());
        
        Circle cir = new Circle( 7);
        System.out.println("\nArea : "+cir.getArea() + "\nPerimter : "+cir.getPerimeter());
        
    }
    
}


interface Shape2D
{
    public double getArea();
    public double getPerimeter();
}

class Rectangle implements Shape2D{

    
    double l,b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    
    @Override
    public double getArea() {
        return l*b;
    }

    @Override
    public double getPerimeter() {
         return 2*(l+b);
    }
    
}
class Circle implements Shape2D{
    
    double r;
    final double pi=3.15;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return pi*r*r;
    }

    @Override
    public double getPerimeter() {
        return 2*pi*r;
    }
    
    
}