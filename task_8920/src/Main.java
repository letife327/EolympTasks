import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long counter = sc.nextLong();
        while (counter > 0) {
            for (long i = 1; i > 0; i++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                    System.out.print(i + " ");
                    counter--;
                    if(counter == 0){
                        return;
                    }
                }
            }
        }
    }
}
