package javaSimple;

import java.util.ArrayList;
import java.util.Arrays;

public class DZ2 {

    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "Masha";
        students[1] = "Sasha";
        students[2] = "Dasha";
        System.out.println("Students' names are " + Arrays.toString(students));

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("dsjfhavd");
        list.add("123456");
        list.remove("123456");
        boolean containsElement = list.contains("123456");
        System.out.println(containsElement);

        int size = list.size();
        System.out.println("Размер массива = " + size);

        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

    }

}



