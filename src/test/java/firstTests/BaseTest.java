package firstTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void beforeT (){
        System.out.println("Действие перед началом теста");
    }

    @AfterTest
    public void afterT (){
        System.out.println("Действие после теста");
    }

    @BeforeMethod
    public void beforeN (){
        System.out.println("Действие перед началом метода");
    }

    @AfterMethod
    public void afterN (){
        System.out.println("Действие после метода");
    }
}
