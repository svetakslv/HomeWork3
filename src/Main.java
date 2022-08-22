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
        int clientOS2 = 0;
        clientOS2 = 1;
        int clientDeviceYear = 2015;
        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Приложение будет работать корректно на iOS");
        }


        //Задача №3
        //Задача №4
        //Задача №5
        {
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
        }
    }
}






