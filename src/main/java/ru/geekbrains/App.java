package ru.geekbrains;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

//public class App {
//    public static void main(String[] args) {
//        System.out.printf("Введите имя: ");
//        Scanner scn = new Scanner(System.in);
//        String name = scn.nextLine();
//        System.out.printf("Hello, %s!", name);
//    }
//}

//public class App {
//    public static void main(String[] args) {
//        System.out.printf("Введите имя: ");
//        Scanner scn = new Scanner(System.in);
//        String name = scn.nextLine();
//        LocalDateTime now = LocalDateTime.now();
//        // now.getYear();
//        // LocalDateTime.of(year, month, dayOfMonth, hour, minute);
//        // now.isAfter(other);
//        // now.isBefore(other);
//        // morning 5:00 - 11:59
//        // day 12:00 - 17:59
//        // evening 18:00 - 22:59
//        // night 23:00 - 4:59
//        int hour = now.getHour();
//        if (hour > 4 & hour < 12) {
//            System.out.printf("Good morning, %s!", name);
//        }
//        else if (hour > 11 & hour < 18) {
//            System.out.printf("Good day, %s!", name);
//        }
//        else if (hour > 17 & hour < 23) {
//            System.out.printf("Good evening, %s!", name);
//        }
//        else {
//            System.out.printf("Good night, %s!", name);
//        }
//    }
//}

//public class App {
//    public static void main(String[] args) {
//        System.out.printf("Введите имя: ");
//        Scanner scn = new Scanner(System.in);
//        String name = scn.nextLine();
//        LocalDateTime now = LocalDateTime.now();
//        // now.getYear();
//        // LocalDateTime.of(year, month, dayOfMonth, hour, minute);
//        // now.isAfter(other);
//        // now.isBefore(other);
//        // morning 5:00 - 11:59
//        // day 12:00 - 17:59
//        // evening 18:00 - 22:59
//        // night 23:00 - 4:59
//        LocalDateTime m1 = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 5, 00, 00);
//        LocalDateTime d1 = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 12, 00, 00);
//        LocalDateTime e1 = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 18, 00, 00);
//        LocalDateTime n1 = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 23, 00, 00);
//        if ((now.isAfter(m1)) && (now.isBefore(d1))) {
//            System.out.printf("Good morning, %s!", name);
//        }
//        else if ((now.isAfter(d1)) && (now.isBefore(e1))) {
//            System.out.printf("Good day, %s!", name);
//        }
//        else if ((now.isAfter(e1)) && (now.isBefore(n1))) {
//            System.out.printf("Good evening, %s!", name);
//        }
//        else if ((now.isAfter(n1)) || (now.isBefore(m1))) {
//            System.out.printf("Good night, %s!", name);
//        }
//    }
//}

public class App {
    public static void main(String[] args) {
        System.out.printf("Введите имя: ");
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        LocalTime now = LocalDateTime.now().toLocalTime();
        LocalTime m1 = LocalTime.of(5, 00);
        LocalTime d1 = LocalTime.of(12, 00);
        LocalTime e1 = LocalTime.of(18, 00);
        LocalTime n1 = LocalTime.of(23, 00);
        if ((now.isAfter(m1)) && (now.isBefore(d1))) {
            System.out.printf("Good morning, %s!", name);
        }
        else if ((now.isAfter(d1)) && (now.isBefore(e1))) {
            System.out.printf("Good day, %s!", name);
        }
        else if ((now.isAfter(e1)) && (now.isBefore(n1))) {
            System.out.printf("Good evening, %s!", name);
        }
        else if ((now.isAfter(n1)) || (now.isBefore(m1))) {
            System.out.printf("Good night, %s!", name);
        }
    }
}

