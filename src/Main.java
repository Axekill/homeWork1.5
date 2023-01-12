public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceTear = 2013;
        if (clientOS == 0 && clientDeviceTear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceTear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceTear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceTear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }


    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("доставка занимает " + day + " дней");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("доставка занимает " + day + " дней");
        } else if (deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("доставка занимает " + day + " дней");
        } else {
            System.out.println("доставки нет");
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь, Сезон : зима");
                break;
            case 2:
                System.out.println("Февраль, Сезон: зима");
                break;
            case 3:
                System.out.println("Март ,сезон: весна");
                break;
            case 4:
                System.out.println("Апрель,сезон: весна");
                break;
            case 5:
                System.out.println("Май, сезон: весна");
                break;
            case 6:
                System.out.println("Июнь , сезон: лето");
                break;
            case 7:
                System.out.println("Июль ,сезон: лето");
                break;
            case 8:
                System.out.println("Август,сезон: лето");
                break;
            case 9:
                System.out.println("Сентябрь, сезон: осень");
                break;
            case 10:
                System.out.println("Октябрь, сезон: осень");
                break;
            case 11:
                System.out.println("Ноябрь, сезон: осень");
                break;
            case 12:
                System.out.println("Декабрь, сезон: зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }


}