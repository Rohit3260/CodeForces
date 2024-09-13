
import java.util.Scanner;

public class Three_2010B{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int first  = sc.nextInt();
    int second = sc.nextInt();

    

    if ((first == 1 && second == 2) || (first == 2 && second == 1)){
        System.out.println("3");
    }
    else if ((first == 2 && second == 3) || (first == 3 && second == 2)){
        System.out.println("1");
    }
    else{
       System.out.println("2");
    }

    }

}