package strings;

import java.util.Scanner;

class Teste{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
     public String pattern = "^(([01]?\\d{1,2}|2([0-4]\\d|5[0-5]))\\.){3}([01]?\\d{1,2}|2([0-4]\\d|5[0-5]))$";
}

