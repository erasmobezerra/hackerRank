package bigbumbers;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalTest {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];

        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        // Ordenação de Array de Strings utilizando Comparator e BigDecimal
        Arrays.sort(s, new Comparator<String>() {
            public int compare(String s1, String s2) {
                BigDecimal bd1 = new BigDecimal(s1);
                BigDecimal bd2 = new BigDecimal(s2);
                return bd2.compareTo(bd1);
            }
        });


        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
