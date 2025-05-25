package May_DSA_Arrays;
import java.util.*;
public class leetcode_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array");
        int len=sc.nextInt();
        int[] nums = new int[len];
        System.out.println("enter elements into array");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter Val");
        int val=sc.nextInt();

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                nums[count]=nums[i];
                count++;
            }
        }

//        System.out.println(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}
