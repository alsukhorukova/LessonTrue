package javaSimple;

public class DZ1 {

    public static void main(String[] args) {

        /**
         * ДЗ 1
         */

        byte testbyte = 3;
        System.out.println("Разность " + testbyte + " и " + testbyte + " = " + HelpedMethods.dif(testbyte, testbyte));

        short testShort = 1212;
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

        short numshort1 = 12345;
        short numshort2 = 12342;
        System.out.println(HelpedMethods.parametr);
        System.out.println(numshort1 + " минус " + numshort2 + " = " + HelpedMethods.dif(numshort1, numshort2));


        int index = 100;
        for (int x = 0; x < index; x++) {
            x = x + 30;
            System.out.println(x);
        }

        int weekday = 9;
        switch (weekday) {
            case 1 -> System.out.println("Сегодня понедельник");
            case 2 -> System.out.println("Сегодня вторник");
            case 3 -> System.out.println("Сегодня среда");
            case 4 -> System.out.println("Сегодня четверг");
            case 5 -> System.out.println("Сегодня пятница");
            case 6 -> System.out.println("Сегодня суббота");
            case 7 -> System.out.println("Сегодня воскресенье");
            default -> System.out.println("Такого дня не существует");
        }


        int num = 1;
        while (num < 5) {
            System.out.println("Число =" + num );
            num++;
        }

        int num1 = 1;
        do  {
            System.out.println("Загаданное число =" + num1 + "?");
            num1++;
        } while (num1 < 5);
        System.out.println("Число угадано!");


        for (int key = 0; key < 5; key++) {
            System.out.println("Пишем строку 5 раз");
        }

        for (int a = 0, b = 5, c = 10; a < b; a++) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

        int [] numbers = {1,2,3,4,5};
        for (int o : numbers) {
            System.out.println("Count is " + o);
        }
    }
}
