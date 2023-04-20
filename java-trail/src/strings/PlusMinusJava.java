package strings;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class PlusMinusJava {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" "))
                        .map(Integer::parseInt)
                        .toList();

        Result.plusMinus(arr);
        bufferedReader.close();
    }
}

class Result {
    public static void plusMinus(List<Integer> arr) {
        int countPositive = 0, countNegative = 0, countZero = 0;
        for(Integer l: arr){
            if(l==0) countZero += 1;
            else if (l>0) countPositive += 1;
            else countNegative += 1;
        }

        System.out.printf("%.6f%n", (double) countPositive / arr.size());
        System.out.printf("%.6f%n", (double) countNegative / arr.size());
        System.out.printf("%.6f%n", (double) countZero / arr.size());
    }

}