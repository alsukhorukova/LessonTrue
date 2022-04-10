package pageObject.lamoda;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class InitPageObject extends Base {
    public InitPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//input [@placeholder='Поиск']")
    private WebElement searchText;

    @FindBy(xpath = ".//button [@aria-label='Поиск']")
    private WebElement submitSearch;

    /**
     * Вводим текст в строку поиска.
     * @param text
     */
    @Step("Вводим текст в строку поиска")
    public void setSearchText(String text) {
        setText(searchText, text);
    }

    /**
     * Нажимаем на кнопку поиска
     */
    @Step("Нажимаем на кнопку поиска")
    public void clickSubmitSearch(){
        click(submitSearch);
    }


}
