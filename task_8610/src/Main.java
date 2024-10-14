import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char prev = (char) (ch-1);
        char next = (char) (ch+1);
        if(Character.isUpperCase(ch)){
            System.out.print(Character.toUpperCase(prev)+" ");
            System.out.print(Character.toUpperCase(next));
        }else{
            System.out.print(Character.toLowerCase(prev)+" ");
            System.out.print(Character.toLowerCase(next));
        }
    }
}