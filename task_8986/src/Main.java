import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = getStrIndex();
        System.out.println(s);
    }

    private static String getStrIndex() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int firstIndex = sc.nextInt();
        int lastIndex = sc.nextInt();
        return s.substring(0, firstIndex) + s.substring(lastIndex + 1);

    }
}