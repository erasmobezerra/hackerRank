package strings;


import java.util.Scanner;

public class StringTokens {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        String texto = scan.nextLine().trim();
        scan.close();

        if (!texto.isEmpty()) {
            String[] resultado = texto.split("[ !,?.'@]+");
            System.out.println(resultado.length);
            for (String r : resultado) {
                System.out.println(r);
            }
        } else {
            System.out.println("0");
        }

    }
}
