package May_DSA_Arrays;

public class maximun_in_array {
    public static void main(String[] args) {

        int[] arr = {12,9,6,2,5,12,43,98,23,76,98,23,98,12};

        int max =arr[0];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max)
                count++;
        }

        System.out.println(arr.length-count);
    }
}
