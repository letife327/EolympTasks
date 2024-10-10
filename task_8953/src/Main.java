import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       long[] arr= new long[(int) n];
       for(int i=0;i<n;i++){
           long random = sc.nextLong();
           arr[i]= random;

       }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}