package testsDZ4;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class NumbersTest {


    @Test
    public void beginTest() {
        System.out.println("Тест на сумму");
    }

    @Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(7);
        int expected = 28;
    }
}