package com.example.w01_homework;

/*
 *Create a class called Shape and calculate area using inheritance and polymporphism concepts we learned
 *To calculate the area of Square, Rectangle and Triangle
 */
public class Homework {
}
class Shape{
    double side; // side for square
    double length; // length of a rectangle / base of a triangle
    double breadth; // breadth of a rectangle / height of a triangle
    Shape(double side) {
        this.side = side;
    }
    Shape(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public String toString(){
        return "Area of ";
    }
}
class Square extends Shape{
    Square(double side){
        super(side);
    }
    public double calculateArea(){
        return(super.side * super.side);
    }
    public String toString(){
        return super.toString() + "Square : " + calculateArea();
    }
}

class Rectangle extends Shape{
    Rectangle(double length, double breadth){
        super(length, breadth);
    }
    public double calculatedArea(){
        double areaOfRectangle = super.length * super.breadth;
        return areaOfRectangle;
    }
    public String toString(){
        return super.toString() + "Rectangle : " + calculatedArea();
    }
}
class Triangle extends Shape{
    Triangle(double base, double height){
        super(base, height);
    }
    public double calculatedArea(){
        double areaOfTriangle = 0.5 * super.length * super.breadth;
        return areaOfTriangle;
    }
    public String toString(){
        return super.toString() + "Triangle : " + calculatedArea();
    }
}

