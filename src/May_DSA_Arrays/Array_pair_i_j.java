package May_DSA_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_pair_i_j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size=sc.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }

        System.out.println("Enter K");
        int k=sc.nextInt();
        int cnt=0;

        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) + list.get(j) == k){
                    System.out.println("Pair exists");
                    cnt=1;
                    break;
                }
            }
        }
        if(cnt==0)
            System.out.println("pair does not exists");


    }
}
