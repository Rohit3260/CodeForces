
import java.util.Scanner;

public class NextRound_158A{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    int k = sc.nextInt();
    int count  = 0;

    int[] score = new  int[n];
    for (int i = 0 ; i<n ; i++) {
        score[i] = sc.nextInt();     
    }

    for (int i = 0 ; i < n ; i++ ){
        if (score[i]==0) {
            
        }
        else if (score[i] >= score[k-1]){
            count++;
        }

    }
    System.out.print(count);



    

    }

}