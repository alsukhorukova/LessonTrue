package javaSimple;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Programm {

    public static void main(String[] args) {

        short testShort = 3333;
        System.out.println("Разность " + testShort + " и " + testShort + " = " + HelpedMethods.dif(testShort, testShort));

        testShort = 1212;
        if (testShort == 1211) {
            System.out.println("Введите 1212");
        } else if (testShort == 1212) {
            System.out.println("Все правильно!");

        }

        long testLong = -327462351;
        if (testLong < -312312122) {
            System.out.println("Введите число больше");
        } else {
            System.out.println("Все правильно!");
        }

        if (testShort > testLong) {
            System.out.println("Почти правильно");
        } else {
                System.out.println("Вообще не правильно все это");
            }


        double testDouble = 2221231.2;
        float testFloat = 1244.21f;
        if (testDouble != testFloat) {
                System.out.println("Красный");
        } else {
            System.out.println("Зеленый");
        }

        int num = 3;
        System.out.println("Hello world!");
        System.out.println(HelpedMethods.parametr);
        System.out.println("Сумма " + num + " и " + num + " = " + HelpedMethods.sum(num, num));

        String qwe = new String("qwe");
        boolean result = qwe == HelpedMethods.parametr;
        System.out.println(result);

        boolean result2 = qwe.equalsIgnoreCase(HelpedMethods.parametr);
        System.out.println(result2);

        num = 5;

        if (num == 3) {
            System.out.println("Мы сделали это");
        } else if (num == 4) {
            System.out.println("Мы почти сделали это");
        } else {
            System.out.println("Ничего не сделано");
        }

        HelpedMethods hp = new HelpedMethods();
        System.out.println("radio = " + hp.switchRadio("Afro"));

        int index = 100;
        for (int x = 0; x < index; x++) {
            x = x + 30;
            System.out.println(x);
        }
        int value = 0;
        while (index < 110) {
            value++;
            System.out.println("Привет");
            if (value == 4) {
                return;
            }
        }

        System.out.println("Мы закончили");
    }
}
