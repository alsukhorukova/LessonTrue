package seleniumTestsDZ5;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.lamoda.InitPageObject;
import pageObject.lamoda.SearchResultPageObject;

import testData.WordsTestData;

import java.io.File;
import java.io.IOException;

public class SelParamTest extends BaseTest {

    public WordsTestData data = new WordsTestData("word");
    @DataProvider(name = "setWords", parallel = false)
    public Object[][] getData(){
        Object[][] words = new Object[][]{
                {new WordsTestData("word").getWord1(),"word1"},
                {new WordsTestData("word").getWord2(),"word2"},
                {new WordsTestData("word").getWord3(),"word3"},
        };
        return words;
    }

    @Test(dataProvider = "setWords")
    @Epic("Селениум")
    @Feature("Ламода тесты с параметрами")
    @Description("Слова")
    @Story("Проверяем поиск")
    public void startTest (String word, String testName){
        getDriver().get(stendUrl);
        getDriver().manage().window().maximize();

        InitPageObject in = new InitPageObject(getDriver());
        in.setSearchText(word);
        in.clickSubmitSearch();
        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
        Assertion as = new Assertion();
        as.assertTrue(sr.isElementExist());

//        File file = new File("./src/main/resources/" + testName + ".jpg");
//            try {
//                FileUtils.writeByteArrayToFile(file, getScreenShot());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


    }
}
