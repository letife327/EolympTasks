import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int count =  getStrCount();
        System.out.println(count);
    }
  private  static  int getStrCount() {
      Scanner sc = new Scanner(System.in);
      String sentence = sc.nextLine();
      String s1 = sentence.toUpperCase();
      int count = 0;
      for (int i = 0; i < s1.length(); i++) {
          switch (s1.charAt(i)) {
              case 'A':
                  count++;
                  break;
              case 'E':
                  count++;
                  break;
              case 'I':
                  count++;
                  break;
              case 'O':
                  count++;
                  break;
              case 'U':
                  count++;
                  break;
              case 'Y':
                  count++;
                  break;
              default:
                  break;

          }
      }
     return count;
  }
}