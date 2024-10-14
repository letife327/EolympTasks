import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        long count = 0;
        String[] words = sentence.split(" ");
        for (String word : words) {
            count++;

        }
        System.out.println(count);
    }

}