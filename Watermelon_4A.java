import java.util.Scanner;
    public class Watermelon_4A{
        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        float w = sc.nextFloat();
        if (w %2==0 && w>2){
            System.out.println("YES");    
        }else{
            System.out.println("NO");
        }
    }

}