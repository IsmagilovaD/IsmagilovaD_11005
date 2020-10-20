// Рекурсивно вывести целые числа от A до B (A < B)
public class PrintNumbersFromAToB {
    public static void printNumbersFromAToB(int a, int b){
        if (b < a)
            return;
        System.out.print(" " + a);
        printNumbersFromAToB(a+1,b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        printNumbersFromAToB(a,b);
    }
}
