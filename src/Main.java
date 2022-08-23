import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1) { // Эта строка лишняя.
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }


        //Задача №2
        int OSClient = 1;
        int clientDeviceYear = 2010;                                                                             //Можно упростить код:
        if (OSClient == 0 && clientDeviceYear >= 2015) {                                                         //if (OSClient == 0) {
            System.out.println("Приложение будет работать корректно на iOS");                                    //if (clientDeviceYear >= 2015) {
        } else {                                                                                                 //System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (OSClient == 1 && clientDeviceYear >= 2015) {                                                     // } else {
                System.out.println("Приложение будет работать корректно на Android");                            //System.out.println("Приложение будет работать корректно на iOS")
            } else {                                                                                             // }
                if (OSClient == 0 && clientDeviceYear < 2015) {                                                  // } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");            //if (clientDeviceYear < 2015) {
                } else {                                                                                         //System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    if (OSClient == 1 && clientDeviceYear < 2015) {                                              // } else{
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");    //System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    }                                                                                            //
                }
            }
        }

        //Задача №3
        int year = 2024;                                         // Необходимо было немного дополнить задачу:
        if (year % 4 == 0) {                                     //if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Это високосный год");            //System.out.println(year + " является високосным годом");
        } else {                                                 //} else {
            System.out.println("Это не високосный год");         //System.out.println(year + " не является високосным годом");
        }


        //Задача №4
        int deliveryDistance = 95;                                       //Можно было сделать так:
        if (deliveryDistance < 20) {                                     //int deliveryDistance = 95;
            System.out.println("Потребуется 1 день");                    //int deliveryDays = 1;
        } else {                                                         //if (deliveryDistance > 20) {
            if (deliveryDistance >= 20 && deliveryDistance <= 60) {      //  deliveryDays++;
                System.out.println("Потребуется 2 дня");                 // }
            } else {                                                     // if (deliveryDistance > 60) {
                if (deliveryDistance >= 60 && deliveryDistance <= 100) { // deliveryDays++;
                    System.out.println("Потребуется 3 дня");             // }
                }                                                        //System.out.println("Потребуется дней: " + deliveryDays);
            }                                                            // }
        }
        //Задача №5                                                    //Исправления не нужны :)
        int monthNumber = 12;

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
        int age = 46;
        int salary = 86_000;
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







