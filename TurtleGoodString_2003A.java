import java.util.Scanner;
public class TurtleGoodString_2003A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            
            
            int t1 = sc.nextInt();
            
            String s = sc.next().toLowerCase();
            if (s.charAt(0)!=s.charAt(t1-1)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            
            
            t--;
        }

    }
}