import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задание 1");
        int year = 1700;
        if (year < 1584){
            System.out.println("Данные заведены не корректно");
        }
        boolean leapYear = definitionOfHighYear(year);
        if (leapYear){
            System.out.println(year + " год — високосный год");
        }else{
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static boolean definitionOfHighYear(int year){
        boolean flag;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return flag = true;
        }else {
            return flag = false;

        }
    }
    public static void task2(){
        System.out.println("Задание 2");
        int operatingSystemType = 0;
        int yearOfDevice = 2024;

        printInfoAboutVersion(operatingSystemType, yearOfDevice);
    }
    public static void printInfoAboutVersion(int gettingTheApplicationVersion, int yearOfDevice){
        int clientDeviceYear = LocalDate.now().getYear();
        if (gettingTheApplicationVersion == 0 && yearOfDevice >= clientDeviceYear) {
            System.out.println("Установите приложение для iOS");
        }else if(gettingTheApplicationVersion == 0 && yearOfDevice < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if(gettingTheApplicationVersion == 1 && yearOfDevice >= clientDeviceYear){
            System.out.println("Установите приложение для Android");
        }else if (gettingTheApplicationVersion == 1 && yearOfDevice < clientDeviceYear){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int amountOfDays = calculationOfDaysForDelivery(deliveryDistance);
        if (amountOfDays > 0){
            System.out.println("Потребуется дней: " + amountOfDays);

        }else{
            System.out.println("Доставки нет");

        }
    }
    public static int calculationOfDaysForDelivery(int deliveryDistance){
        int daye = 0;
        if (deliveryDistance <= 20){
            daye += 1;
        }else if(deliveryDistance > 20 && deliveryDistance <= 60){
            daye += 2;
        }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daye += 3;
        }else if (deliveryDistance > 100){
            daye = -1;
        }
        return daye;

    }





}