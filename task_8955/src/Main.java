import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 0;
        long[] arr= new long[(int) n];
        long[] newArr = new long[(int) count];
        for(int i=0;i<n;i++){
            long random = sc.nextLong();
            arr[i]= random;

        }
        for(long i=0 ; i<arr.length ;i++){
                if(arr[(int) i]>0){
                newArr[(int) count] = arr[(int) i];
                count++;
               }

        }


        if(count>0){
            System.out.println(count);
            for(long j=0 ; j<newArr.length ;j++){
                System.out.print(newArr [(int) j]);
            }

        }else{
            System.out.println("NO");
        }
    }
}