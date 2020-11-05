package homeWork6_11;

public class Vector2D {
        private double x,y;

        public Vector2D(double x,double y){
            this.x = x;
            this.y = y;
        }

        public void add(Vector2D other){
            this.x += other.x;
            this.y += other.y;
        }

        public void sub(Vector2D other){
            this.x -= other.x;
            this.y -= other.y;
        }

        public void mult(double t){
            this.x = x * t;
            this.y = y * t;
        }

        public void resultsPrinter(Vector2D vectorok){
            System.out.println(vectorok.x);
            System.out.println(vectorok.y);
            System.out.println();
        }
    }

