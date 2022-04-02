package testsDZ4;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(7);
        int expected = 28;
        assertEquals(expected, actual);
    }
}