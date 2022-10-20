import java.time.LocalDate;

public class Main {

    public static void checkYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " - не високосный год");
        } else if (year % 4 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void printSeparator() {
        System.out.println("***************");
    }

    public static String checkUserOS(int userOS, String typeOS) {
        if (userOS == 1 || userOS == 0) {
            System.out.println(typeOS = userOS == 1 ? "Ваша версия ОС - Android" : "Ваша версия ОС - iOS");
        } else {
            System.out.println("Введите значение \"0\", если у Вас iOS или \"1\", если у Вас Android");
        }
        return typeOS;
    }

    public static String checkPhoneDate(int userPhoneDate, String userPhoneVersionUtil) {
        int currentYear = LocalDate.now().getYear();
        if (userPhoneDate < currentYear) {
            System.out.println(userPhoneVersionUtil = "Вам подходит lite версия приложения");
        } else if (userPhoneDate == currentYear) {
            System.out.println(userPhoneVersionUtil = "Вам подходит последняя версия приложения");
        } else {
            System.out.println("Вы ввели неккоректную дату производства телефона");
        }
        return userPhoneVersionUtil;
    }

    public static void deliverPackage(int deliveryDistance) {
        int dayForDelivery = 1;
        if (deliveryDistance <= 0) {
            throw new RuntimeException("Расстояние не может быть отрицательным или равным 0");
        } else if (deliveryDistance > 100) {
            System.out.println("К сожаления, доставка с нашего офиса осуществляется в пределах 100 км");
        } else if (deliveryDistance <= 20) {
            System.out.println("Для доставки потребуется дней: " + dayForDelivery);
        } else if (deliveryDistance <= 60) {
            dayForDelivery += 1;
            System.out.println("Для доставки потребуется дней: " + dayForDelivery);
        } else {
            dayForDelivery+=2;
            System.out.println("Для доставки потребуется дней: " + dayForDelivery);
        }
    }


    public static void main(String[] args) {


        //Exercise 1
        int year = 2001;
        printSeparator();
        checkYear(year);


        //Exercise 2
        int userOS = 1;
        int userPhoneDate = 2021;
        boolean checkCorrectUserOS = userOS == 1 || userOS == 0;
        String typeOS = "";
        printSeparator();
        checkUserOS(userOS, typeOS);
        if (checkCorrectUserOS) {
            checkPhoneDate(userPhoneDate, typeOS);
        }


        //Exercise 3
        int deliveryDistance = 95;
        printSeparator();
        deliverPackage(deliveryDistance);


    }
}