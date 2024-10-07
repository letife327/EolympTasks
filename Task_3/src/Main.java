import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long tens = a/10;
        if (a >=10 && a<=99){
            a=a%10;
            System.out.println(tens+" "+a);
        }else {
            return;
        }

    }
}