package testsDZ4;

import org.junit.Test;
import testsDZ4.Fox;

import static org.junit.Assert.*;

public class FoxTest {

    @Test
    public void getName() {
        Fox fox = new Fox("Lisa", 2);
        assertEquals("Lis", fox.getName());
    }

    @Test
    public void setName() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }
}