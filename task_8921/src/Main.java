import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  = sc.nextLong();
        long count= 0;
        while (n > 0) {
            count = n%10;
            n = n/10;
            System.out.println(count);
        }
    }
}