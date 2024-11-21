public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Task 1
        System.out.println("Task 1");
        System.out.println();
        int ru = 0;
        int month = 0;
        while (ru < 2_459_000) {
            ru = ru + 15000;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + ru + " рублей");
        }
        System.out.println();
        // Task 2
        System.out.println("Task 2");
        System.out.println();
        int directly = 0;
        int revers = 10;
        while (directly < 10) {
            directly = directly + 1;
            System.out.print(directly + " ");
        }
        System.out.println();
        for (; revers > 0 && revers <= 10; revers = revers - 1) {
            System.out.print(revers + " ");
        }
        System.out.println();
        System.out.println();
        // Task 3
        System.out.println("Task 3");
        System.out.println();
        int birth = 17;
        int mortality = 8;
        int total = 12_000_000;
        int year1 = 2024;
        for (int year = year1; year <= year1 + 10; year++) {
            total += total / 1000 * birth - total / 1000 * mortality;
            System.out.println("Год " + year + ", численность населенеия составляет " + total);
        }
        System.out.println();
        // Task
        System.out.println("Task 4");
        System.out.println();

    }
}
