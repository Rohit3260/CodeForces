
import java.util.Scanner;

public class Fibonacci_219774{

     public static long fib(int n){
       
        long a = 0;
        long b = 1;
        long fib = 0;
        for (int i = 1; i <= n; i++) {

            fib = a;
           long c=a+b;
            a=b;
            b=c;

        }
        return fib;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(fib(n));

    }

}