package Arrays;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int N=sc.nextInt();
        //Logic
        int ans=0;
        int i=1;
        while(i*i<=N){
            ans=i;
            i++;
        }
        System.out.println("Answer is: "+ans);
    }
}
