public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " "); }

        //task 2
        System.out.println("task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + " "); }

        //task 3
        System.out.println("task 3");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " "); }}

        //task 4
        System.out.println("task 4");
        for (int i = 10; i >=-10; i--) {
            System.out.println(i + " "); }

        //task 5
        System.out.println("task 5");
        for (int year = 1904; year <= 2096; year+=4) {
            System.out.println(year + "год является високосным"); }

        //task 6
        System.out.println("task 6");
        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i + " "); }

        //task 7
        System.out.println("task 7");
        for (int i = 2; i <= 512; i*=2) {
            System.out.println(i + " "); }

        //task 8
        System.out.println("task 8");
        int amount = 29000;
        int sum = 0;
        for (int month = 1; month <= 12; month ++) {
            sum+=amount;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей"); }

        //task 9
        System.out.println("task 9");
        double sum1 = 0.0;
        double percent = 12.0 / 100.0;
        for (int month = 1; month <= 12; month++) {
            sum1 += amount;
            sum1 = (int) (sum1 * (1 + percent));
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum1 + " рублей"); }

        //task 10
        System.out.println("task 10");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.printf("%d x %d = %d%n", 2, multiplier, 2 * multiplier); }
    }
}
