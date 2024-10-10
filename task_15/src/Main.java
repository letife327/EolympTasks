import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int[] arr = new int[]{3,32,1,5};
       int[] newArr = new int[arr.length];
       for(int i=0;i<arr.length-1; i++){
           for(int j=1;j<arr.length-i;j++){
               if(arr[i]>arr[j]){
                   newArr[i]=arr[j];
               }
           }
       }
        System.out.println(Arrays.toString(newArr));
























//        while (n > 0) {
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    for(int j = 1; j <Math.sqrt(i); j++) {
//                        if (i % j == 0) {
//                            count++;
//                        }
//                        if(count==0 || count==1){
//                            System.out.println(i);
//                        }
//                    }
//
//                }
//
//            }
//        }



//        for(int i = 1; i <= n; i++) {
//            sum =sum*i;
//        }
//        System.out.println(sum);
    }
}
