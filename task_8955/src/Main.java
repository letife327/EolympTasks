import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr= new int[ n];

        for(int i=0;i<n;i++){
            int random = sc.nextInt();
            arr[i]= random;

        }
        for(int i=0 ; i<arr.length ;i++){
                if(arr[i]>0){
                count++;
               }

        }
        int newIntIndex = 0;
        int[] newArr = new int[count];
        for(int i=0 ; i<arr.length ;i++){
            if(arr[i]>0){
                newArr[newIntIndex]=arr[i];
                newIntIndex++;
            }
        }
        if(count>0){
            System.out.println(count);
            for (int i=0;i<newArr.length;i++){
                System.out.print(newArr[i]+" ");
            }
        }else{
            System.out.println("NO");
        }



    }
}