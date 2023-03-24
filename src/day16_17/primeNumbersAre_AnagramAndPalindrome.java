package day16_17;
// A palindrome number is a number that is same after reverse
public class primeNumbersAre_AnagramAndPalindrome {

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
                    // check palindrome Number
                            int sum=0,r;
                            int temp=n;
                            int n2=n;
                            while(n2>0){
                                r=n2%10;  //getting remainder
                                sum=(sum*10)+r;
                                n2=n2/10;
                            }
                            if (temp==sum){
                                System.out.println(n+" = Palindrome Number");
                            }

                }
            }//end of else
        }
    }

    public static void main(String[] args) {
        System.out.println("Prime Numbers are : ");
        checkPrime(1000);

    }
}
