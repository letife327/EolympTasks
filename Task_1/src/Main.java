import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if( n%2!=0 || (n>=100 && n<=999)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}