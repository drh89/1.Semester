/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class Repetition {

    private Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Repetition rep = new Repetition();
        ArrayList<Integer> arra1 = new ArrayList();
        ArrayList<Integer> arra2 = new ArrayList();
        
        arra1.add(10);
        arra1.add(20);
        arra1.add(30);
        arra1.add(44);
        arra1.add(120);
        arra1.add(40);
        arra2.add(1);
        arra2.add(1);
        arra2.add(1);
        arra2.add(1);
        arra2.add(1);
        arra2.add(1);

//        System.out.println(rep.min(1, 2, 3));
//        System.out.println(rep.min(2, 1, 3));
//        System.out.println(rep.min(3, 2, 1));
//        System.out.println(rep.printEvenNumbers(12));
//        System.out.println(rep.printEvenNumbers(24));
//        System.out.println(rep.smallestAbsVal(7, -11, 21));
//        System.out.println(rep.sumDigits(33333333));
//        System.out.println(rep.reverseVertical("gej reddeh sinneD"));
//        System.out.println(rep.processName(rep.scanner));
//        System.out.println(rep.repeat("Hej"));
        System.out.println(rep.shortestName(rep.scanner, 9));
//        System.out.println(rep.maxMin(rep.scanner));
//        rep.printMultiple(20);
//        rep.randomNumbers();
//        System.out.println(arra);
//        System.out.println(rep.max(arra));
//        System.out.println(rep.allLess(arra2, arra1));
    }

    public boolean allLess(ArrayList<Integer> arra1, ArrayList<Integer> arra2) {
        int count = 0;
        if (arra1.size() == arra2.size()) {

            for (int i = 0; i < arra1.size(); i++) {
                if (arra1.get(i) < arra2.get(i)) {
                    count++;
                }

            }
            if (count == arra1.size()) {
                return true;
            }

        }
        return false;
    }

    public int max(ArrayList<Integer> arra) {

        Collections.sort(arra);

        int max = 0;
        for (int i = 0; i < arra.size(); i++) {
            if (i == arra.size() - 1) {

                max = arra.get(i);

            }
        }
        return max;
    }

    public void printMultiple(int num) {

        for (int i = 1; i <= 10; i++) {

            System.out.println(num * i);

        }

    }

    public String maxMin(Scanner scanner) {
        ArrayList<Integer> arra = new ArrayList();
        int temp = 0;
        int min = 0;
        int max = 0;

        do {
            System.out.println("Skriv et tal (eller -1 for at afslutte)");

            arra.add(Integer.parseInt(scanner.next()));
            for (int i = 0; i < arra.size(); i++) {
                temp = arra.get(i);

            }
        } while (temp != -1);

        Collections.sort(arra);
        arra.remove(0);                                                         // removes the integer on the lists first place - the integer: the -1 the user used to stop the program.
        for (int i = 0; i < arra.size(); i++) {
            if (i == 0) {
                min = arra.get(i);
            }
            if (i == arra.size() - 1) {
                max = arra.get(i);
            }

        }

        return "Maximum var: " + max + "\n" + "Minimum var: " + min;
    }

    public void randomNumbers() {
        Random random = new Random();
        int randomInt;
        do {
            randomInt = random.nextInt(1001);
            System.out.println(randomInt);

        } while (randomInt <= 900);

    }
    private final Comparator<String> perLength = (String str1, String str2) -> {
        if (str1.length() == str2.length()) {
            return str1.compareTo(str2);
        }
        return str1.length() - str2.length();
    };

    public String shortestName(Scanner scanner, int n) {
        int count = 0;
        ArrayList<String> arra = new ArrayList();

        while (count < n) {
            System.out.println("Skriv et navn:");
            arra.add(scanner.nextLine());
            count++;
        }
        Collections.sort(arra, perLength);

        return arra.get(0) + " er det korteste navn";

    }

    public String repeat(String str) {
        String newString = "";
        if (str.length() == 0) {
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            newString += str;

        }
        return newString;
    }

    public String processName(Scanner scanner) {

        return scanner.nextLine().toUpperCase();
    }

    public String reverseVertical(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i) + "\n";

        }

        return reversedStr;
    }

    public int sumDigits(int number) {
        int sum = 0;
        String stringNumber = "" + number;

        for (int i = 0; i < stringNumber.length(); i++) {
            String temp = stringNumber.substring(i, i + 1);

            sum += Integer.parseInt(temp);

        }
        return sum;

    }

    public String smallestAbsVal(int a, int b, int c) {
        if (Math.abs(a) < Math.abs(b) && Math.abs(a) < Math.abs(c)) {
            return "" + a;
        }
        if (Math.abs(b) < Math.abs(a) && Math.abs(b) < Math.abs(c)) {
            return "" + b;
        }
        if (Math.abs(c) < Math.abs(a) && Math.abs(c) < Math.abs(b)) {
            return "" + c;
        }
        if (Math.abs(a) == Math.abs(b) && Math.abs(a) < Math.abs(c)) {
            return a + " " + b;
        }
        if (Math.abs(a) == Math.abs(c) && Math.abs(a) < Math.abs(b)) {
            return a + " " + c;
        }
        if (Math.abs(b) == Math.abs(c) && Math.abs(b) < Math.abs(a)) {
            return b + " " + c;
        }
        return a + " " + b + " " + c;

    }

    public int min(int a, int b, int c) {

        if (Math.min(a, b) == a && Math.min(a, c) == a) {
            return a;
        }
        if (Math.min(a, b) == b && Math.min(b, c) == b) {
            return b;
        }
        return c;
    }

    public String printEvenNumbers(int max) {

        ArrayList<String> finalArra = new ArrayList();
        for (int i = 0; i <= max; i++) {
            if (i % 2 == 0) {

                finalArra.add("{" + i + "}");
            }

        }
        String formattedString = finalArra.toString()
                .replace("[", "").replace("]", "");
        return formattedString;
    }

}
