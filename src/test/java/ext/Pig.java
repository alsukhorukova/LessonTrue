/**
 * ДЗ 2
 */

package ext;

public class Pig extends Animals implements AnimalColor{

    public Pig(String name) {
        super(name);
    }

    public void say(){
        System.out.println("xru");
    }

    @Override
    public void getColor() {
        System.out.println("Pink");
    }
}