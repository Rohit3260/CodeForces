import java.util.Scanner;

public class DoraSet_2007A{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t> 0){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int a = num1;
            int b = num1 + 1;
            int c = num1 + 2;
            int cnt = 0;
            while(c <= num2){
                if((a % 2== 0 && b % 2 == 0) || (b % 2== 0 && c % 2 == 0) ||  (a % 2== 0 && c % 2 == 0)){
                    c += 1;
                }
                else{
                    cnt += 1;
                    a = c + 1;
                    b = a + 1;
                    c = b + 1;
                }
            }
        System.out.println(cnt);         
          
        t--;
        }
        
     
        
          
        
        
    }
}
