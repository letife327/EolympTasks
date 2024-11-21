import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {




        LocalDate birthday = LocalDate.of(2004,11,8);
        LocalDate today = LocalDate.now();
        if(today.getMonth() == birthday.getMonth()&&
        today.getDayOfMonth() == birthday.getDayOfMonth()) {
            System.out.println("Happy Birthday :)");
        }else{
            System.out.println("Today is not your birthday :(");
        }












    }
}