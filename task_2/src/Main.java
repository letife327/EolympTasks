import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if (a>0&&b>0&&c>0) {
            if( (a == b) && (a == c)){
                System.out.println("equilateral");
            } else if (( (a == b)) || (a == c) || (b == c)) {
                System.out.println("isosceles");
            } else{
                System.out.println("versatile");
            }
        }else {
            System.out.println("invalid");
        }
    }
}