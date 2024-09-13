import java.util.Scanner;
public class AlternatingSumOfNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of test case : ");
        int n = sc.nextInt();
        

        int sum = 0;
        int diff = 0;
        for (int m = 0 ; m<n ;m++){
            int p = sc.nextInt();
            int[] num = new int[p];
            for (int i = 0 ; i < p ; i++) {
                num[i] = sc.nextInt();    
            }

            for (int i = 0 ; i < p ; i++){
                if (i%2==0){
                sum += num[(i)];
                }
                else{
                    diff += num[(i)];
                }
            }
            System.out.println("Sum = "+(sum-diff));
            sum = 0;
            diff = 0;
        }


        
    }
}