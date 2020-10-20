// Рекурсивно вычислить число Фибоначчи с номером N.
public class Fibonacci {
   public static int fibonacciNumber(int n){
        if (n == 1)
            return 0;
        if (n == 2) {
         return 1;
        } else {
             return fibonacciNumber(n-1)+ fibonacciNumber(n-2);
        }
   }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacciNumber(n));
    }
}

