import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long sum =0;
        while(true){
            long n = sc.nextLong();
            if(n==0) break;
            sum+=n;
        }
        System.out.println(sum);
    }
}