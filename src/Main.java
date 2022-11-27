import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("_____________________________________________________________________________");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("_____________________________________________________________________________");
        for (int i = 2; i < 18; i+=2) {
            System.out.println(i);
        }
        System.out.println("_____________________________________________________________________________");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println("_____________________________________________________________________________");
        int salary = 29000;
        int total =0;
        for (int i = 0; i < 13; i++) {
            total = total + salary;
            System.out.println("Сумма накоплений = " + total);
        }
        System.out.println("_____________________________________________________________________________");
        int salary2 = 29000;
        int total2 = 0;
        for (int i = 0; i < 13; i++) {
            total2 = (int) (total2 + 0.01 * total2);
            total2 = total2 + salary2;
            System.out.println("Месяц " + i + "," + " сумма накоплений = " + total2);
        }
        System.out.println("_____________________________________________________________________________");
        int total3 = 0;
        int y = 0;
        while (total3 < 2459000) {
            total3 = total3 + 15000;
            y = y + 1;
        }
        System.out.println("Месяц " + y + ", сумма накоплений = " + total3);
        System.out.println("_____________________________________________________________________________");
        int q = 0;
        int w = 11;
        while (q < 10) {
            q = q + 1;
            System.out.print(q + " ");
        }
        System.out.println();
        for ( ;w > 0; ) {
            w = w - 1;
            System.out.print(w + " ");
        }
        System.out.println("_____________________________________________________________________________");




    }
}