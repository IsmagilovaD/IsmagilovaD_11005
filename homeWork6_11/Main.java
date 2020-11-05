package homeWork6_11;

public class Main {

    public static void main(String[] args) {
	int t = 5;
	Vector2D vector = new Vector2D(5,4);
	Vector2D vector2 = new Vector2D(6,4);

		vector.add(vector2);
		vector.resultsPrinter(vector);

		vector.sub(vector2);
		vector.resultsPrinter(vector);

		vector.mult(t);
		vector.resultsPrinter(vector);

    }
}
