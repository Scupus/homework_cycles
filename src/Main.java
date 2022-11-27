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
        for (int i = 1; i < 13; i++) {
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
        for ( ;w > 1; ) {
            w = w - 1;
            System.out.print(w + " ");
                            }
        System.out.println();
        System.out.println("_____________________________________________________________________________");
        int population = 12_000_000;
        int yerPopulationIncrease = 12000 * (17 - 8);
        int j = 0;
        for ( ; j <10; j++) {
            population = population + yerPopulationIncrease;
            System.out.println("Год " + j + ", население страны = " + population);
        }
        System.out.println("Ежегодная прибавка населения " + yerPopulationIncrease);
        System.out.println("Год " + j + " население = " + population);
        System.out.println("_____________________________________________________________________________");
        int totalDeposit = 15000;
        for (int i = 1;totalDeposit < 12_000_000;i++) {
            totalDeposit = (int) (totalDeposit * 1.07);
            System.out.println("Месяц " + i + " сумма на счете = " + totalDeposit);
        }
        System.out.println("_____________________________________________________________________________");
        int totalDeposit2 = 15000;
        for (int i = 1;totalDeposit2 < 12_000_000;i++) {
            totalDeposit2 = (int) (totalDeposit2 * 1.07);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма на счете = " + totalDeposit2);
            }}
        System.out.println("_____________________________________________________________________________");

        for (int i=1; i < 73; i++ ) {
            totalDeposit2 = (int) (totalDeposit2 * 1.07);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма на счете = " + totalDeposit2);
            }}





    }
}