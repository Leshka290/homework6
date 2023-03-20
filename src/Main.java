public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        for (int i = 1; i < 11; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i);
        }
         System.out.println();
    }

    public static void task3() {
        for (int i = 0; i < 18; i++) {
            if(i % 2 == 0) {
                System.out.print(i);
            }
        }
        System.out.println();
    }

    public static void task4() {
        for (int i = 10; i >= -10 ; i--) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void task5() {
        for (int i = 1904; i <= 2096 ; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        for (int i = 1; i < 100; i++) {
            if(i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task7() {
        for (int i = 1; i < 1000; i  = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        int total = 0;
        int deposit = 29000;
        for (int i = 1; i <= 12; i++) {
            total += deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        int total = 0;
        int deposit = 29000;
        for (int i = 1; i <= 12; i++) {
            total += deposit + (deposit / 100);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(2 + " * "+ i + " = " + i * 2);
        }
    }
}