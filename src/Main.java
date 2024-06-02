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
        System.out.println(clientOS());
        calculateDeliveryDays();
    }

    public static int calculateLeapYear() {
        System.out.println("Задача №1");
        int currentYear = LocalDate.now().getYear();
        if (currentYear % 400 == 0 || currentYear % 4 == 0 || currentYear % 100 != 0) {
            System.out.println(currentYear + " год является високосным.");
        } else {
            System.out.println(currentYear + " год не является високосным.");
        }
        return currentYear;

    }


    public static String clientOS() {
        System.out.println("Задача №2");
        int clientOS = 0;
        int clientDeviceYear = 2024;
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                return "Установите версию приложения для iOS по ссылке : ... ";
            }else {
                return "Установите облегченную версию приложения для iOS по ссылке : ... ";
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear >= currentYear) {
                return "Установите версию приложения для Android по ссылке : ... ";
            }else {
                return "Установите облегченную версию приложения для Android по ссылке : ... ";
            }
        }else {
            throw new
                    IllegalArgumentException("Недопустимое значение clientOS: " + clientOS);
        }

    }

    public static int calculateDeliveryDays() {
        System.out.println("Задача №3");
        int deliveryDistance = 90;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется " + deliveryDays + " день.");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Для доставки потребуется " + (deliveryDays + 1) + " дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Для доставки потребуется " + (deliveryDays + 2) + " дня.");
        } else {
            System.out.println("Доставки нет. ");
        }
        return deliveryDays;
                                                                   //int additionalDays = deliveryDistance / 40;
                                                                   //deliveryDays += additionalDays;
                                                                   //System.out.println("Для доставки потребуется " + deliveryDays + " дней.");
                                                                   //return deliveryDays;
    }


}