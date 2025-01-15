package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusOne {

    public static int[] logic(int[] arr){

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]=arr[i]+1;
                return arr;
            }
            arr[i]=0;
        }

        int[] newAns = new int[arr.length+1];
        newAns[0]=1;
        return newAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size=sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements into array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //logic

        System.out.println("ans:");

        int[] ans=logic(arr);

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<ans.length;i++){
            list.add(ans[i]);
        }

        System.out.println(list);

    }
}
