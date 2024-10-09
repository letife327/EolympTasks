import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = 0;
        long sum = 0;
        while (n > 0) {
            temp = n % 10;
            if(temp%2==0){
                    sum += temp;
            }

            n = n / 10;
        }
        if(sum==0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
        }

    }
}