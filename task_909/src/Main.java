import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int count = 0;
        String s= sentence.trim().replaceAll("\\s+", " ");

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }

        }
        System.out.println(++count);
    }

}