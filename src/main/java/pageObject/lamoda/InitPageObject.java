package pageObject.lamoda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class InitPageObject extends Base {
    public InitPageObject(WebDriver driver) {
        super(driver);
    }

    /*.//tr [contains(.,'ВАКАНСИИ')]

     */
    @FindBy(xpath = ".//input [@placeholder='Поиск']")
    private WebElement searchText;

    @FindBy(xpath = ".//button [@aria-label='Поиск']")
    private WebElement submitSearch;

    /**
     * Вводим текст в строку поиска.
     * @param text
     */
    public void setSearchText(String text) {
        setText(searchText, text);
    }

    public void clickSubmitSearch(){
        click(submitSearch);
    }


}
