package seleniumTestsDZ5;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.lamoda.InitPageObject;
import pageObject.lamoda.SearchResultPageObject;

public class SelTest extends BaseTest {

    @Test
    @Epic("Селениум")
    @Feature("Ламода тесты")
    @Story("Проверяем поиск")
    public void startTest (){
        getDriver().get("https://www.lamoda.ru/");
        getDriver().manage().window().maximize();

        InitPageObject in = new InitPageObject(getDriver());
        in.setSearchText("Шуба");
        in.clickSubmitSearch();
        SearchResultPageObject sr = new SearchResultPageObject(getDriver());
        Assertion as = new Assertion();
        as.assertTrue(sr.isElementExist());

    }
}
