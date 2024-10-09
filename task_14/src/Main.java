import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Fibanocci ededleri
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int result = 0;
        if(n==1){
            System.out.println(0);
        }else if(n==2){
            System.out.println(1);
        }else{
            for(int i=3; i<=n; i++){
                result=a+b; //0 1 ondan evvel 0 1 1,2, 3, 5
                a=b;  //a=1, a=1 , a=2
                b=result; //b=1, b=2 , b=3

            }

            System.out.println(result);
        }

    }
}