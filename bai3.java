
package lab4;
 class Shape {
   private String color = "red";
   private boolean filled = true;
 public Shape(String color){
     this.color = color;
     this.filled = true;
 }
public Shape() {
    this.color = "red";
    this.filled = true;
}
 public Shape(String color, boolean filled){
     this.color = color;
     this.filled = filled;
 }
 public String getcolor(){
     return color;
 }
 public void setcolor(String color){
     this.color = color;
 }
 public boolean isfilled(){
     return filled;
 }
 public void setfilled(boolean filled){
     this.filled = filled;
 }
 @Override
 public String toString(){
     return "Shape[color=" + color + ", filled=" + filled + "]";
 }
}
class Circle extends Shape {
    private double radius = 1.0;
public Circle(){
   super();
   this.radius = 1.0;
}
public Circle(double radius, String color, boolean filled){
    super(color, filled);
    this.radius = radius;
}
public double getradius(){
    return radius;
}
public void setradius(double radius){
    this.radius = radius;
}
public double getArea(){
    return Math.PI * radius * radius;
}
public double getPerimeter(){
    return 2 * Math.PI * radius;
}
@Override
public String toString(){
    return "Circle[" + super.toString() + ", radius=" + radius + "]";
}}
class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
public Rectangle(){
    super();
    this.width = 1.0;
    this.length = 1.0;
}
public Rectangle(double width, double length){
    super();
    this.width = width;
    this.length = length;
}
public Rectangle(double width, double length,String color,boolean filled){
    super(color, filled);
    this.width = width;
    this.length = length;
}
public double getwidth(){
    return width;
}
public void setwidth(double width){
    this.width= width;
}
public double getlength(){
    return length;
}
public void setlength(double length){
    this.length = length;
}
public double getarea(){
    return width * length;
}
public double getperimeter(){
    return 2*(width+length);
}
@Override
public String toString(){
   return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
}}
class Square extends Rectangle{
public Square(){
    super();
}
public Square(double side){
    super(side, side);
}
public Square(double side,String color, boolean filled){
    super(side,side);
}
public double getSide() {
        return getwidth();
    }
    public void setSide(double side) {
        setwidth(side);
        setlength(side);
    }
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
public class bai3 {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape);

        Circle circle = new Circle(2.0, "green", true);
        System.out.println(circle);
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0,"yellow",false);
        System.out.println(rectangle);
        System.out.println("Area of Rectangle: " + rectangle.getarea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getperimeter());

        Square square = new Square(2.5, "purple", true);
        System.out.println(square);
        System.out.println("Area of Square: " + square.getarea());
        System.out.println("Perimeter of Square: " + square.getperimeter());
    }
}

