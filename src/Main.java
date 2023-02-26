public class Main {
    public static void checkYear(int year){
        if (year % 4 != 0 || year%100==0 ) {
            if (year % 400!=0){
                System.out.println(year+" год не является високосным ");
            } else  System.out.println(year+" год является високосным ");
        }
        else System.out.println(year+" год является високосным ");
    }
    public static void updateDevice (int typeOS, int deviceYear){
        switch (typeOS) {
            case 1:
                if (deviceYear<2023) {
                    System.out.println("Установите облегченное приложение для Android по ссылке ");
                } else System.out.println("Установите обычное приложение для Android по ссылке");
                break;
            case 0:
                if (deviceYear<2023) {
                    System.out.println("Установите облегченное приложение для iOS по ссылке ");
                } else System.out.println("Установите обычное приложение для iOS по ссылке");
                break;
        }

    }


    public static void timeDelivery(int deliveryDistance ){
        if (deliveryDistance < 20) {
            System.out.println("Потребуется один день");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется два дня");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется три дня");
        } else System.out.println("Доставки нет");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
    }


    public static void task1() {
        System.out.println("Задача 1");
       int year = 2016;
        checkYear(year);

    }

    public static void task2() {
        System.out.println("Задача 2");
      int typeOS=0;
      int deviceYear = 2018;
      updateDevice(typeOS,deviceYear);
    }
    public static void task3() {
        System.out.println("Задача 3");
       int deliveryDistance = 80;
       timeDelivery(deliveryDistance);
    }


}