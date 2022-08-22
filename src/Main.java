import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }


        //Задача №2
        int OSClient = 0;
        int clientDeviceYear = 2015;
        if (OSClient == 0 && clientDeviceYear >= 2015) {
            System.out.println("Приложение будет работать корректно на iOS");
        } else {
            if (OSClient == 1 && clientDeviceYear >= 2015) {
                System.out.println("Приложение будет работать корректно на Android");
            } else {
                if (OSClient == 0 && clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    if (OSClient == 1 && clientDeviceYear < 2015) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    }
                }
            }
        }

        //Задача №3
        int year = 2022;
        if (year % 4 == 0) {
            System.out.println("Это високосный год");
        } else {

            System.out.println("Это не високосный год");
        }


        //Задача №4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else {
            if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется 2 дня");
            } else {
                if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    System.out.println("Потребуется 3 дня");
                }
            }
        }
        //Задача №5
        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
                System.out.println("Зимний месяц");
                break;
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 12:
                System.out.println("Зимний месяц");
                break;
            case 3:
                System.out.println("Весенний месяц");
                break;
            case 4:
                System.out.println("Весенний месяц");
                break;
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
                System.out.println("Летний месяц");
                break;
            case 7:
                System.out.println("Летний месяц");
                break;
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
                System.out.println("Осенний месяц");
                break;
            case 10:
                System.out.println("Осенний месяц");
                break;
            case 11:
                System.out.println("Осенний месяц");
                break;
            case 13:
                System.out.println("Такого месяца не существует");
                break;
        }


        //*Задача №6
        int age = 24;
        int salary = 58_000;
        if (age < 23) {
            System.out.println("Вам доступно для снятия " + salary * 2);
        } else {
            if (age >= 23) {
                System.out.println("Вам доступно для снятия " + salary * 3);
                if (salary >= 50_000 && salary < 79_000) {
                    System.out.println("Ваш лимит увеличен до " + salary * 1.2);
                } else {
                    if (salary >= 80_000) {
                        System.out.println("Ваш лимит увеличен до " + salary * 1.5);
                    }
                }

            }
        }
    }
}







