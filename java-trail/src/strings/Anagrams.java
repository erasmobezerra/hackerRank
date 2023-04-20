package strings;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palavraA = scan.next();
        String palavraB = scan.next();
        scan.close();

        if ((palavraA.length() == palavraB.length()) && (palavraA.length() <= 50)) {

            if (ehAnagrama(palavraA, palavraB)) System.out.println("Anagrams");
            else System.out.println("Not Anagrams");

        } else {
            System.out.println("Not Anagrams");
        }

    }

    static ArrayList<String> inserirLetrasDePalavraNumArray(String palavra) {
        ArrayList<String> listaDeLetras = new ArrayList<>();
        for (int i = 0; i < palavra.length(); i++) {
            listaDeLetras.add(palavra.substring(i, i + 1));
        }
        return listaDeLetras;
    }


    static boolean ehAnagrama(String palavraA, String palavraB) {
        ArrayList<String> letrasDaPalavraA  = inserirLetrasDePalavraNumArray(palavraA);
        ArrayList<String> letrasDaPalavraB  =  inserirLetrasDePalavraNumArray(palavraB);
        letrasDaPalavraA.sort(String.CASE_INSENSITIVE_ORDER);
        letrasDaPalavraB.sort(String.CASE_INSENSITIVE_ORDER);
        int coincide = 0;
        for (int i = 0; i < letrasDaPalavraA.size(); i++) {
            if (letrasDaPalavraA.get(i).equalsIgnoreCase(letrasDaPalavraB.get(i))) {
                coincide += 1;
            }
        }

        return coincide == letrasDaPalavraA.size();
    }

}
