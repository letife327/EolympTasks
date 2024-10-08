import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;
        for( long i = n; i > 0; i=i/10 ){
            count++;
        }
        long result  = (long) Math.pow(10, count);
        if(count ==1 ){
            System.out.println(10);

        }
        else{
            System.out.println(result);
        }

    }
}