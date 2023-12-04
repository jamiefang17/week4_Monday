public class Circle extends Shape{

    double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
}