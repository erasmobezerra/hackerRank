package strings.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {

        String regex = "aba";
        String texto = "ababbaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto: " + texto);
        System.out.println("regex: " + regex);
        System.out.println("indice: 0123456789");
        System.out.println("Posições encontradas, onde de acordo com o regex passado, aconteceu o matcher no texto: ");
        int contador = 0;
        while (matcher.find()){
            contador += 1;
            System.out.println(contador + "º matcher na Posição: " + matcher.start() + " => " + matcher.group());
        }
    }


}
