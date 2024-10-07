import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        if (a>0){
            a=a%10;
            System.out.println(a);
        }else {
            return;
        }

    }
}