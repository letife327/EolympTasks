import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public static void plusMinus(List<Integer> arr) {
        arr.size();
        int zeroCount =0;
        int plusCount= 0;
        int minusCount= 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0){
                zeroCount++;
            }
            else if(arr.get(i)>0){
                plusCount++;
            }else{
                minusCount++;
            }
        }
        System.out.println((double)plusCount/arr.size());
        System.out.println((double)minusCount/arr.size());
        System.out.println((double)zeroCount/arr.size());


    }
}