public class Main {
    public static void main(String[] args) {
        printSeparator(0);
        task1(2004);
        printSeparator(1);
        task2(0,2013);
        printSeparator(2);
        System.out.println(task3(73));
        printSeparator(3);
    }

    public static void printSeparator(int i){
        if (i == 0){
            System.out.println("***");
        }else{
            System.out.println("#" +i +" ***");
        }
    }

    public static void task1(int year){
        var result = "";
        if (year>1584 && year%4==0 && (year%100!=0 || year%400==0)){
            result = " год — високосный год.";
        } else {
            result = " год — не високосный год.";
        }
        System.out.println(year +result);
    }

    public static void task2(int os, int clientDeviceYear){
        if (clientDeviceYear<2015){ //Если год выпуска раньше 2015
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
        }else{ //Если год выпуска позже или равен 2015
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

    public static String task3(int deliveryDistance) {
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