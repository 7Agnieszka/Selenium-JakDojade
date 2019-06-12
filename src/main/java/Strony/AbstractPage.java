package Strony;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    protected static WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public String wezAdresStrony() {
        return driver.getCurrentUrl();
    }

    private static final int CZAS_OCZEKIWANIA_SEK = 15;

    public void waitForClickableAndClickElement(WebElement element) {
        new WebDriverWait(driver, CZAS_OCZEKIWANIA_SEK).until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}