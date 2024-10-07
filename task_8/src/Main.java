import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if((a>=0 || b>=0 || c>=0) && (a<0 || b<0 || c<0)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}