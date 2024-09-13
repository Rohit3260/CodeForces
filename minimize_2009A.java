

import java.util.Arrays;
import java.util.Scanner;

public class minimize_2009A{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Number of test case :");
    int t = sc.nextInt();
    while(t-->0){
        System.out.print("Enter first Integer :");
        int num1 = sc.nextInt();
        System.out.print("Enter second Integer :");
        int num2 = sc.nextInt();

        int[] r = new int[num2-num1+1];
        int a = num1;

         for (int i = 0 ;i<(num2-num1);i++){
            r[i] = (a-num1)+(num2-a);
               
            a++;
        }
           
        
        Arrays.sort(r);
        if (num1==num2){
             System.out.println(r[0]);
        }
        else if (num1<num2){
             System.out.println(r[1]);
        }
        

        


        
    }

    }
}