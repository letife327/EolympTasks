import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,11}; //4 6 7 8
        int[] arr2 = new int[]{1,2,3,4,5,18,11}; // 4 5 6 7 8
        int[] newArr  = new int[arr1.length];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       int temp =0;
        if(arr2.length>arr1.length){
            for(int i=0; i<arr2.length; i++){
                int count=0;
                for(int j=0; j<arr1.length; j++){
                    if(arr2[i]==arr1[j]){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    temp = arr2[i];
                }
            }
            System.out.println(temp);
        }
        else{
            for(int i=0; i<arr1.length; i++){
                int count=0;
                for(int j=0; j<arr2.length; j++){
                    if(arr1[i]==arr2[j]){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    temp = arr1[i];
                }
            }
            System.out.println(temp);
        }

    }
}