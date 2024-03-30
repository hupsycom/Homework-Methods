import java.time.LocalDate;

public class Main {

    public static void printSeparator() {
        System.out.println("+++++++++++");
        System.out.println("-----------");
    }

    public static void printIssues(int issuesCount) {
        System.out.println(issuesCount);

    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        calculateLeapYear();
        clientOS();
        calculateDeliveryDays();
    }

    public static int calculateLeapYear() {
        System.out.println("Задача №1");
        int currentYear = LocalDate.now().getYear();
        if (currentYear % 400 == 0 || currentYear % 4 == 0 || currentYear % 100 == 0) {
            System.out.println(currentYear + " год является високосным.");
        } else {
            System.out.println(currentYear + " год не является високосным.");
        }
        return currentYear;

    }


    public static int clientOS() {
        System.out.println("Задача №2");
        int clientOS = 1;
        int clientDeviceYear = 2024;
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Вы пользуетесь IOS. Установите полную версию для IOS по ссылке: ... ");
            } else {
                System.out.println("Вы пользуетесь IOS. Установите облегченную версию приложения для IOS по ссылке: ... ");
            }
        }
        if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Вы пользуетесь Android. Установите полную версию для IOS по ссылке: ... ");
            } else {
                System.out.println("Вы пользуетесь Android. Установите облегченную версию приложения для Android по ссылке: ... ");
            }
        }
        return clientOS;

    }

    public static int calculateDeliveryDays() {
        System.out.println("Задача №3");
        int deliveryDistance = 1280;
        int deliveryDays = 1;
        int additionalDays = deliveryDistance / 40;
        deliveryDays += additionalDays;
        System.out.println("Для доставки потребуется " + deliveryDays + " дней.");
        return deliveryDays;

    }


}