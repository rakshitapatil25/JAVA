/*Develop a Java program to create an abstract class named
Shape that contains two integers and an empty method
named printArea(). Provide three classes named
Rectangle, Triangle and Circle such that each one of the
classes extends the class Shape. Each one of the classes
contain only the method printArea() that prints the area of
the given shape. */
abstract class Shape{
  int a,b;
  abstract void printArea();
}

class Rectangle extends Shape{
  public Rectangle(int length,int breadth){
    this.a=length;
    this.b=breadth;
  }
  public void printArea(){
    double Area = a*b;
    System.out.println("Area of Rectangle is " + Area);
  }
}

class Triangle extends Shape{
  public Triangle(int base, int height){
    this.a = base;
    this.b = height;
  }
  public void printArea(){
    double Area = 0.5*a*b;
    System.out.println("Area of Triangle is " + Area);
  }
}

class Circle extends Shape{
  public Circle(int radius){
    this.a=radius;
  }
  public void printArea(){
    double Area=3.14*a*a;
    System.out.println("Area of Circle is " + Area);
  }
}
public class prog4 {
  public static void main(String[] args) {
    Rectangle r = new Rectangle(4,5);
    Triangle t = new Triangle(6, 3);
    Circle c = new Circle(5);
    r.printArea();
    t.printArea();
    c.printArea();
  }
}
