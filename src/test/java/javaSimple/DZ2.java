package javaSimple;

import java.util.*;

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

        //Set

        Set<String> set1 = new HashSet<String>();
        set1.add("строка 1");
        set1.add("строка 2");
        set1.add("строка 3");
        set1.add("строка 4");
        set1.remove("строка 4");
        for (String s : set1){
            System.out.println(s);
        }

        Set<String> set2 = new HashSet<String>();
        set2.add("element 1");
        set2.add("element 2");
        set2.add("element 3");
        set2.add("element 3");
        Iterator<String> iterator = set2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        if (set2.contains("element 1"))
            System.out.println("Элемент найден");

        //Map

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("element1", 1);
        map.put("element2", 5);
        map.put("element3", 6);
        map.put("element4", 10);

        Integer num = map.get("element2");
        System.out.println(num);

        map.remove("element4");
        System.out.println(map.containsKey("element4"));
        System.out.println(map.containsValue(6));

        Set<String> elements = map.keySet();
        for(String k : elements){
            System.out.println(k);
        }

        for(int n : map.values()){
            System.out.println(n);
        }

    }

}



