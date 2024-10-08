import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 10) {
            switch (a) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dord");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yeddi");
                    break;
                case 8:
                    System.out.println("sekkiz");
                    break;
                case 9:
                    System.out.println("doqquz");
                    break;
            }
        }
        else if (a<=99) {
            if (a % 10 == 0) {
                switch (a) {
                    case 10:
                        System.out.println("on");
                        break;
                    case 20:
                        System.out.println("iyirmi");
                        break;
                    case 30:
                        System.out.println("otuz");
                        break;
                    case 40:
                        System.out.println("qırx");
                        break;
                    case 50:
                        System.out.println("əlli");
                        break;
                    case 60:
                        System.out.println("altmis");
                        break;
                    case 70:
                        System.out.println("yetmis");
                        break;
                    case 80:
                        System.out.println("səksən");
                        break;
                    case 90:
                        System.out.println("doxsan");
                        break;


                }
            }
            else{
                switch (a/10) {
                    case 1:
                        System.out.println("on");
                        break;
                    case 2:
                        System.out.println("iyirmi");
                        break;
                    case 3:
                        System.out.println("otuz");
                        break;
                    case 4:
                        System.out.println("qırx");
                        break;
                    case 5:
                        System.out.println("əlli");
                        break;
                    case 6:
                        System.out.println("altmis");
                        break;
                    case 7:
                        System.out.println("yetmis");
                        break;
                    case 8:
                        System.out.println("səksən");
                        break;
                    case 9:
                        System.out.println("doxsan");
                        break;


                }

                switch (a%10) {
                    case 1:
                        System.out.println("bir");
                        break;
                    case 2:
                        System.out.println("iki");
                        break;
                    case 3:
                        System.out.println("uc");
                        break;
                    case 4:
                        System.out.println("dord");
                        break;
                    case 5:
                        System.out.println("bes");
                        break;
                    case 6:
                        System.out.println("alti");
                        break;
                    case 7:
                        System.out.println("yeddi");
                        break;
                    case 8:
                        System.out.println("sekkiz");
                        break;
                    case 9:
                        System.out.println("doqquz");
                        break;


                }
            }

        }else{
            System.out.println("ikireqemli eded  ve ya eded daxil edin");
        }

       Scanner scanner = new Scanner(System.in);
       long n = scanner.nextLong();
       for (long i = n+1; i > n; i++) {

           if(i%7==0){
               System.out.println(i);
               break;
           }
       }


    }
}