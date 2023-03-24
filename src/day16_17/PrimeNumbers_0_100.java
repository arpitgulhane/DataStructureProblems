package day16_17;

public class PrimeNumbers_0_100 {
    static void checkPrime(int total) {
        for (int n = 0; n <= total; n++) {
//            n = num;
            int i, m = 0, flag = 0;
            m = n / 2;
            if (n == 0 || n == 1) {
//                System.out.println(n + " is not prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
//                        System.out.println(n + " is not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.print(n +" , ");
                }
            }//end of else
        }
    }

    public static void main(String[] args) {
        System.out.println("Prime Numbers are : ");
        checkPrime(1000);
    }
}
