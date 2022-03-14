package javaSimple;

public class Programm {

    public static void main(String[] args) {

        int num = 3;
        System.out.println("Hello world!");
        System.out.println(HelpedMethods.parametr);
        System.out.println("Сумма " + num + " и " + num +" = "+HelpedMethods.sum(num,num));
    }
}
