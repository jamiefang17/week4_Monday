public class Triangle extends Shape {
    
    double Height;
    double Base;
    double side1;
    double side2;
    double side3;
    
    public Triangle(double Base, double Height, double side1, double side2, double side3) {
        super();
        this.Height = Height;
        this.Base = Base;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    public double getArea() {
        return (Height * Base) / 2;
    }

    
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}