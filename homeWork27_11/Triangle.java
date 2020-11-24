package homeWork2711;

import homeWork2711.Shape;

public class Triangle extends Shape {

    private int height;
    private int base;

    Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }

    @Override
    double getArea() {
        return (height*base)/2;
    }
}
