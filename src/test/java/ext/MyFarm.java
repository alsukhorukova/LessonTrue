package ext;

public class MyFarm {

    public static void main(String[] args){

        Cat oli = new Cat("Oli");
        Dog buch = new Dog("Buch");

        oli.eat();
        oli.say();

        buch.eat();
        buch.say();
        System.out.println(buch.getName());
        buch.setName("Harry");
        System.out.println(buch.getName());
        buch.getColor();
    }
}
