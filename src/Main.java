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
        String leapYear = highYearCalculation(year);
        System.out.println(year + leapYear);
    }
    public static String highYearCalculation(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year > 1584)){
            return " год — високосный год";
        }else
            return " год — невисокосный год";
    }
    public static void task2(){
        System.out.println("Задание 2");
        int operatingSystemType = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        gettingTheApplicationVersion(operatingSystemType, clientDeviceYear); // Если делать через возрат значений, то я как понял нужно будет два метода?
    }
    public static void gettingTheApplicationVersion(int gettingTheApplicationVersion, int clientDeviceYear){ // Хотел прописать через String, а не через void, но нужно как-то вернуть два занчения, а это только через два метода и передовать по одной переменной

        if (gettingTheApplicationVersion == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите приложение для iOS");
        }else if(gettingTheApplicationVersion == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if(gettingTheApplicationVersion == 1 && clientDeviceYear > 2015){
            System.out.println("Установите приложение для Android");
        }else if (gettingTheApplicationVersion == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        calculationOfDaysForDelivery(deliveryDistance);

    }
    public static void calculationOfDaysForDelivery(int deliveryDistance){
        int daye = 0;
        if (deliveryDistance <= 20){
            daye += 1;
            System.out.println("Потребуется дней: " + daye);;
        }else if(deliveryDistance > 20 && deliveryDistance <= 60){
            daye += 2;
            System.out.println("Потребуется дней: " + daye);;
        }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daye += 3;
            System.out.println("Потребуется дней: " + daye);;
        }else if (deliveryDistance > 100){
            System.out.println("Доставки нет");
        }



    }





}