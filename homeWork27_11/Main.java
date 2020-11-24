package homeWork2711;

public class Main {

    public static void main(String[] args) {

        Shape[] figures = new Shape[5];
        figures[0] = new Rectangle(4, 3);
        figures[1] = new Circle(5);
        figures[2] = new Triangle(3, 3);
        figures[3] = new Circle(4);
        figures[4] = new Rectangle(6, 33);

        for (int i = 0; i < figures.length; i ++){
            System.out.println(figures[i].getArea());
        }
    }
}
