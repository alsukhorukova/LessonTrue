package testsDZ4;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {

    @Test
    public void beginTest() {
        System.out.println("Тест файла");
        String curDir = System.getProperty("user.dir");
        System.out.println(System.getProperty("os.name"));
        String filePath;

        if (System.getProperty("os.name").contains("Windows")){
            filePath=curDir+"\\src\\main\\resources\\FILE FOR DZ";
        }else {
            filePath=curDir+"src/main/resources/FILE FOR DZ";
        }

        String line=null;

        try {
            BufferedReader bf = new BufferedReader(new FileReader(filePath));
            line=bf.readLine();
            BufferedReader bf2 = new BufferedReader(new FileReader(filePath));
            bf2.lines().forEach(s-> System.out.println("строка файла " + s));

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(line);

        Assertion a = new Assertion();
        a.assertTrue(line.contains("Четыре"), "Проверяем, что текст содержит");
    }

}
