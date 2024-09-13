import java.util.Scanner;
public class PrimaryTask_2000A{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
       while (t>0) 
       { 
        int n = sc.nextInt();
         
        String strInteger = String.valueOf(n);
        if 
        (
            (strInteger.length()>2) && (strInteger.charAt(0)=='1') && (strInteger.charAt(1)=='0') && (strInteger.charAt(2)!='0')  && (n % 100 >=2)
        ) 
        {
            System.out.println("YES");
            
        } else{
            System.out.println("NO");
        }



       t--;    
       }
           
        
    }
}