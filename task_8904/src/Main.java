import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); //6
        for (long i = n - 1; i >= 0; i--) { //5
            if (i % 2 == 0 ) {
                for (long j = 0; j <= n - 1; j++) {
                    if (Math.pow(2, j) == i) {
                        System.out.println(i);
                        return;
                    }

                }
            }else{
                continue;
            }

        }
    }
}