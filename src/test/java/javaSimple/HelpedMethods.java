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

    static int sum (int a, int b){
        return a+b;
    }

    static short dif (short x, short y){
        return (short) (x-y);
    }

    public String switchRadio (String radioname){
        String radio;
        switch (radioname) {
            case "Afro":
                radio="100/2";
                break;
            case "Auto":
                radio = "106.1";
                break;
            default:
                radio= "Мы не знаем этого радио";
        }

        return radio;
    }

    public String switchradionewwave(String radioname){
        String radio;

        radio= switch (radioname) {
            case "Afro" -> "100/2";
            case "Auto" -> "106/1";
            default -> "Мы не знаем этого радио";
        };
        return radio;
    }
}
