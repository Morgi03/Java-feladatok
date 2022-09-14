package hu.petrik.javabevezeto;

import java.util.concurrent.ThreadLocalRandom;

public class Feladat17 {
    public static void main(String[] args) {
        double[] tomb1 = new double[10];
        double[] tomb2 = new double[10];
        for (int i = 0; i < tomb1.length; i++) {
            tomb1[i] = ThreadLocalRandom.current().nextDouble() * 100;
            tomb2[i] = ThreadLocalRandom.current().nextDouble() * 100;
        }
        System.out.println("Első tömb:");
        for (int i = 0; i < tomb1.length; i++) {
            System.out.println(tomb1[i]);
        }
        System.out.println("Második tömb:");
        for (int i = 0; i < tomb2.length; i++) {
            System.out.println(tomb2[i]);
        }
        System.out.println("Harmadik tömb (az első kettő összege):");
        double[] tomb3 = new double[10];
        for (int i = 0; i < tomb3.length; i++) {
            tomb3[i] = Double.sum(tomb1[i], tomb2[i]);
            System.out.println(tomb3[i]);
        }
    }
}
