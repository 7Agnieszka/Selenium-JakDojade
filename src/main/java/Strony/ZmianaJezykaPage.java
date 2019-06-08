package Strony;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZmianaJezykaPage extends AbstractPage {

    @FindBy(id = "language-select")
    private WebElement zmienJezykPrzycisk;

    @FindBy(className = "cn-app-settings--header__close-button")
    private WebElement zamknijPrzycisk;

    public ZmianaJezykaPage(WebDriver driver) {
        super(driver);
    }


    public MainPage wybierzAngielski() {

        clickElement(zmienJezykPrzycisk);
        zmienJezykPrzycisk.sendKeys(Keys.ARROW_DOWN);
        zmienJezykPrzycisk.sendKeys(Keys.ENTER);
        clickElement(zamknijPrzycisk);
        return new MainPage(driver);
    }

    public MainPage wybierzPolski() {

        clickElement(zmienJezykPrzycisk);
        zmienJezykPrzycisk.sendKeys(Keys.ARROW_UP);
        zmienJezykPrzycisk.sendKeys(Keys.ENTER);
        clickElement(zamknijPrzycisk);
        return new MainPage(driver);
    }


}
