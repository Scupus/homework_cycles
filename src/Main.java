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









    }
}