package Arrays;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        //
        int N=sc.nextInt();
        int count=0;
        for(int i=1;i<=(N/i);i++){
            if(N%i==0){
                if(i==(N/i))
                    count++;
                else
                    count=count+2;
            }
        }

        System.out.println("Factors are: "+count);
    }
}
