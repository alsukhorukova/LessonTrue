package pageObject.lamoda;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchResultPageObject extends Base {
    public SearchResultPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = ".//a [contains( text (), 'Товары для дома')]")
    private WebElement homeStaff;

    /**
     * Проверяем, что есть ссылка на товары для дома.
     * @return
     */
    @Step ("Проверяем, что есть ссылка на товары для дома.")
    public boolean isElementExist(){
        return waitVisibilityElement(homeStaff);
    }
}
