package homeWork2711;

public class Circle extends Shape {
    private int radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius*radius*Math.PI;
    }
}
