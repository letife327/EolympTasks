import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max= s.charAt(0);
        int counter=0;
        int index=s.length()-1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)>max){
                max=s.charAt(i);
            }
            if(i==s.length()-1){
                if( s.charAt(index--)==max){
                    ++counter;
                }
            }

        }
        System.out.println((char)max+" "+counter);

    }
}