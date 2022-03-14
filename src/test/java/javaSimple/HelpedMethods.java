package javaSimple;

public class HelpedMethods {

    final static String parametr = "qwe";
    final static String parametr2 = "qwe";

    public int ind = 2;
    public int i2d = 2;

    public static String name(String word){
        String nameForReturn = word;

        return nameForReturn;
    }

    private String prefix (String pref) {
        return pref;
    }

    protected String sufix (String suf) {
        return suf;
    }

    String lost() {
        return "lost";
    }

    static int sum (int a, int b) {
        return a+b;
    }
}
