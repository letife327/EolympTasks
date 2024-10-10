import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0 ;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for(int i = arr.length-1; i >=0; i--){
            if(arr[i]<0){
                count++;
            }
        }

        int[] newInt = new int[count];
        int newArrIndex = 0;

        for(int i = arr.length-1; i >=0; i--){
            if(arr[i]<0){
                newInt[newArrIndex++] = arr[i];
            }
        }
        if(count>0){
            System.out.println(count);
            for (int i = 0; i < newInt.length; i++) {
                System.out.println(newInt[i]);
            }
        }
        else{
            System.out.println("NO");
        }

    }
}