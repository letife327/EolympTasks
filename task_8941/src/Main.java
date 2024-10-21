import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int result =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(result<=n*m){
                   matrix[i][j] = result;
                   System.out.print(matrix[i][j]+" ");
                   result++;
               }
            }
            System.out.println();
        }
    }
}