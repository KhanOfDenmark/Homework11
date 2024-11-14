import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printSeparator(0);
        findOutTheLeapYear(2004);
        printSeparator(1);

        offerALiteVersion(0,2013);
        printSeparator(2);

        String deliveryDay = calculateTheDeliveryDay(73);
        System.out.println(deliveryDay);
        printSeparator(3);
    }

    public static void printSeparator(int i){
        if (i == 0){
            System.out.println("***");
        }else{
            System.out.println("#" +i +" ***");
        }
    }

    //Task#1
    public static void findOutTheLeapYear(int year){
        var result = "";
        if (year>1584 && year%4==0 && (year%100!=0 || year%400==0)){
            result = " год — високосный год.";
        } else {
            result = " год — не високосный год.";
        }
        System.out.println(year +result);
    }

    //Task#2
    public static void offerALiteVersion(int os, int clientDeviceYear){
        if (clientDeviceYear<LocalDate.now().getYear()){
            //Если год выпуска меньше нынешнего
            switch (os){
                case 0: //и ОС - iOS
                    System.out.println("Установите облегченную версию "
                            +"приложения для iOS по ссылке");
                    break;
                case 1: //и ОС - Android
                    System.out.println("Установите облегченную версию "
                            +"приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Операционная система не определена.");
            }
        }else{ //Если год выпуска больше или равен нынешнему
            switch (os){
                case 0: //и ОС - iOS
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                    break;
                case 1: //и ОС - Android
                    System.out.println("Установите версию приложения для "
                            +"Android по ссылке.");
                    break;
                default:
                    System.out.println("Операционная система не определена.");
            }
        }
    }

    //Task#3
    public static String calculateTheDeliveryDay(int deliveryDistance) {
        String result;
        if (deliveryDistance < 20) {
            result = "1";
        } else if (deliveryDistance < 60){
            result = "2";
        } else if (deliveryDistance <= 100){
            result = "3";
        }else{
            result = "Доставка не осуществляется.";
        }
        return result;
    }
}