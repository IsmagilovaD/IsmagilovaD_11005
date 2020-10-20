// Рекурсивно вычислить функцию Аккермана от двух целых чисел M, N > 0.
public class AckermannFunction {
    public static long ackermannFunction(long m,long n){
        if (m == 0)
           return n+1;
        else
            if  (n == 0)
                return ackermannFunction(m - 1, 1);
            else
                return ackermannFunction(m - 1, ackermannFunction(m, n - 1));
    }
    public static void main(String[] args) {
    long n = 2;
    long m = 2;
        System.out.println(ackermannFunction(m,n));
    }
}
