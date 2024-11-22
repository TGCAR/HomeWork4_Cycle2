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
        // Task 4
        System.out.println("Task 4");
        System.out.println();

        int deposit = 15000;
        double monthlyPercent = 0.07;
        int totalAmount = 12_000_000;
        int numberMonth = 0;
        while (deposit <= totalAmount) {
            deposit += deposit * monthlyPercent;
            numberMonth++;
            System.out.println("Месяц " + numberMonth + " - Василий накопил " + deposit);
        }
        System.out.println();
        // Task 5
        System.out.println("Task 5");
        System.out.println();
        int deposit5 = 15000;
        double monthlyPercent5 = 0.07;
        int totalAmount5 = 12_000_000;
        int numberMonth5 = 0;
        while (deposit5 <= totalAmount5) {
            deposit5 += deposit5 * monthlyPercent5;
            numberMonth5++;
            if (numberMonth5 % 6 == 0) {
                System.out.println("Месяц " + numberMonth5 + " - Василий накопил " + deposit5);
            }
        }
        System.out.println();
        // Task 6
        System.out.println("Task 6");
        System.out.println();
        int deposit6 = 15000;
        double monthlyPercent6 = 0.07;
        int halfYear6 = 18;
        int unitYears6 = 1;
        int numberMonth6 = 0;
        for (; unitYears6 <= halfYear6; unitYears6++) {
            deposit6 = deposit6 * 6;
            deposit6 += deposit6 * monthlyPercent6;

            System.out.println("Полугодие " + unitYears6 + " - Василий накопил " + deposit6);
        }
    }
}

