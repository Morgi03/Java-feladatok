package hu.petrik.javabevezeto;

import java.math.BigDecimal;
import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adj meg egy pozitív valós számot: ");
        double number = Double.parseDouble(sc.nextLine().replace(',','.'));
        if ((number == Math.floor(number)) && !Double.isInfinite(number)) {
            System.out.printf("A megadott szám a %f és a %f egész számok között van, és ezek közül a %s számhoz van közelebb.\n", (number-1),(number+1),(number-1)+" és "+(number+1));
            System.out.printf("A szám egész része: %f\n", number);
            System.out.printf("A szám tört része: %s\n", 0);
        }else {

            double elotte = Math.floor(number);
            double utanna = Math.ceil(number);
            String kozel = "";
            BigDecimal elottekozelebb = BigDecimal.valueOf(number).subtract(BigDecimal.valueOf(elotte));
            BigDecimal utannakozelebb = BigDecimal.valueOf(utanna).subtract(BigDecimal.valueOf(number));
            boolean utannakozel = elottekozelebb.compareTo(utannakozelebb) < 0;
            boolean egyenlo = elottekozelebb.compareTo(utannakozelebb) == 0;
            if (utannakozel) {
                kozel = Double.toString(Math.round(elotte));
            } else if (egyenlo) {
                kozel = Math.round(utanna) + " és " + Math.round(elotte);
            } else {
                kozel = Double.toString(Math.round(utanna));
            }
            System.out.printf("A megadott szám a %f és a %f egész számok között van, és ezek közül a %s számhoz van közelebb.\n", elotte, utanna, kozel);
            System.out.printf("A szám egész része: %f\n", utanna - 1);
            System.out.printf("A szám tört része: %s\n", elottekozelebb);
        }
    }
}
