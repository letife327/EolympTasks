import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = 3;

        for(int i=0;i<height;i++){

                for(int j=0;j<width;j++){
                    if(i==0 || i==2){
                        System.out.print("*");
                    }
                    else if(j == 0 || j == width-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
            System.out.println();
        }
    }
}