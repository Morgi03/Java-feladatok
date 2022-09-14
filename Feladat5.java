package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap 'a' oldalát (cm): ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem adja meg a téglalap 'b' oldalát (cm): ");
        double b = Double.parseDouble(sc.nextLine().replace(',','.'));
        System.out.print("Kérem adja meg, hogy mit szeretne kiszámítani (K - kerület, T - terület): ");
        String muvelet = sc.nextLine();
        boolean kerulet_boolean = muvelet.equals("K");
        boolean terulet_boolean = muvelet.equals("T");
        if (kerulet_boolean){
            double kerulet = 2 * (a + b);
            System.out.printf("A téglalap kerülete %.2f cm\n", kerulet);
        } else if (terulet_boolean) {
            double terulet = a * b;
            System.out.printf("A téglalap kerülete %.2f cm^2\n", terulet);
        } else {
            System.out.println("Hibás műveletet adott meg!");
        }
        if (a == b){
            System.out.println("A megadott téglalap egy négyzet.");
        }
    }
}
