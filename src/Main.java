import java.time.LocalDate;

public class Main {

    public static void leapYear() {
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year +  " год является високосным");
        } else {
            System.out.println(year +  " год не является високосным");
        }
    }

    public static void clientOsYear() {
        int clientOs = 0;
        int clientDeviceYear = 2000;
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void countDelivery() {
        int deliveryDistance = 18;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней - 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней - 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней - 3");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        leapYear();
    }

    public static void task2 () {
        System.out.println("Задача 2");
        clientOsYear();
    }

    public static void task3() {
        System.out.println("Задача 3");
        countDelivery();
    }
}