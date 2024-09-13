
import java.util.Scanner;

public class WordOnThePaper_1850C{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t>0){ 
            
        
            for (int i=0; i<8; i++){
                String input = sc.next();
                
                for (int j=0; j<8; j++){
                    
                    if (input.charAt(j) != '.'){
                        System.out.print(input.charAt(j));

                    }
                
                }
                
            }
            System.out.println();

            t--;
            
        }

    }

}