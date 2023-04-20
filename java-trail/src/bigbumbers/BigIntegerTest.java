package bigbumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();
        scan.close();


        BigInteger numberA = new BigInteger(a);
        BigInteger numberB = new BigInteger(b);

        System.out.println(numberA.add(numberB));
        System.out.println(numberA.multiply(numberB));

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
