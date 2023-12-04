public class Rectangle extends Shape{
    double base;
    double height;
    public double getArea() {
        return base * height;
    }
    @Override
    public double getPerimeter() {
        return base*2 + height*2;
    }
}