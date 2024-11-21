import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int left  = arr.get(0).get(0);
        int right = arr.get(0).get(arr.size()-1);
        for(int i=1; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                if(j==i){
                    left+=arr.get(i).get(j);
                    right+=arr.get(i).get(arr.size()-j - 1);
                }
            }
        }
        return Math.abs(left-right);
    }
}