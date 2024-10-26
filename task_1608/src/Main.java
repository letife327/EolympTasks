import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String result = checkPalindrome()? "Yes":"No";
        System.out.println(result);
    }

    private static boolean checkPalindrome(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];
        System.out.println(str);
        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println("salam");
        int lngth = str.length()-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[lngth-i]){
                return false;
            }
        }
        return true;
    }

}