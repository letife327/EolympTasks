import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long counter = 0;
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        System.out.println(counter);
    }
}