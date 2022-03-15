package ext;

public class MyFarm {

    public static void main(String[] args){

        Cat oli = new Cat("Oli");
        Dog buch = new Dog("Buch");
        Pig babe = new Pig("Babe");

        oli.eat();
        oli.say();

        buch.eat();
        buch.say();
        System.out.println(buch.getName());
        buch.setName("Harry");
        System.out.println(buch.getName());
        buch.getColor();

        babe.eat();
        babe.sleep();
        babe.say();
        System.out.println(babe.getName());
        babe.setName("Stepashka");
        System.out.println(babe.getName());
        babe.getColor();

    }
}
