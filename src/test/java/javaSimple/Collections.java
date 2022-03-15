package javaSimple;

import java.sql.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Collections {

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        try{
            nums[1]=1;
        }catch (IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }finally {
            System.out.println("OUPS");
        }


        System.out.println(nums[1]);

        String[] str = {"2", "4", "8"};
        System.out.println(str[1]);

        ArrayList<String> list = new ArrayList<>();
        list.add("Ddsdsifc");
        list.add("adhgfasd");
        list.add("123456");

        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        for (String s:list){
            System.out.println("For each="+s.length());

        }

        list.forEach(s -> System.out.println("strin=" + s));
        list.stream().filter(s -> s.length()<14).forEach(s -> System.out.println("Фильтр="+s));
        list.stream().filter(s -> s.contains("a")).forEach(s -> System.out.println("Фильтр2="+s));


    }
}
