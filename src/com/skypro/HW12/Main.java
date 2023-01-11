package com.skypro.HW12;

public class Main {
    public static void main(String[] args) {
        task1(2022);
        task1(2020);
        ptintAppInfo(1, 2016);
        ptintAppInfo(1, 2014);
        ptintAppInfo(0, 2016);
        ptintAppInfo(0, 2014);
        int deliveryDistance = 95;
        printCardDeliveryDays(deliveryDistance);

    }
    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task1(int year){
        if (isLeapYear(year)) {
            System.out.println( year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }
    public static void ptintAppInfo (int mobileOs, int mobileYear){
        String osName = defileOsName(mobileOs);
        String osVersion = defineAppVersion(mobileYear);
        System.out.println("ваша версия на телефон должна быть: " + osVersion  +". Для вашей операционной системе: "+ osName);
    }
    public static String defileOsName (int mobileOs) {
        if (mobileOs == 0) {
            return "IOS";
        }else if (mobileOs == 1){
            return "Android";
        }else {
            return "ошибка";
        }
    }

    public static String defineAppVersion(int mobileYear) {
        if (mobileYear > 2015) {
            return "lite";
        } else {
            return "обычной";
        }
    }

    public static int calcCardDeliveryDays(int distance) {
        int deliveryDays;
        if (distance <=20){
            deliveryDays = 1;
        } else if (distance <=60) {
            deliveryDays = 2;
        } else if (distance <=100){
            deliveryDays = 3;
        }else {
            deliveryDays = 0;
        }
        return deliveryDays;
    }
    public static void printCardDeliveryDays(int distance) {
        System.out.println("Потребуется дней: " + calcCardDeliveryDays(distance));
    }
}
