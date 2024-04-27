package ArraysDemo;

import java.util.Arrays;

public class Max {
    public static void main(String[] args){
        int[] arr={1,3,4,5,6,32};
         System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
              if(arr[i]>maxi) maxi=arr[i];
        }

        return maxi;
    }
}
