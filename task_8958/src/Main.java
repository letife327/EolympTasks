import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int counter =0;
        for (int i = n - 1; i >= 0; i--) {
           if(i%2!=0){
               counter++;
           }
        }
        if(counter>0){
            System.out.println(counter);
            for (int i = 0; i <n ; i++) {
                if (i % 2 != 0) {
                    System.out.print(arr[i]+" ");
                }
            }
        }else{
            System.out.println("NO");
        }

    }


}