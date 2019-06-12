package Strony;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreMainPage extends AbstractPage {


    @FindBy(css = ".cmp-button_button.cmp-intro_acceptAll")
    private WebElement przyciskRodo;

    @FindBy(css = ".cn-city-list-button.ng-scope")
    private WebElement przyciskWyboruMiasta;

    @FindBy(xpath = "/html/body/div[3]/main/div/ui-view/div/city-list-component/div/div[2]/ul/li/a")
    private WebElement wybierzKrakow;

    @FindBy(xpath = "/html/body/div[3]/main/div/ui-view/div/city-list-component/div/div[1]/input")
    private WebElement poleWpisywaniaMiasta;


    public PreMainPage(WebDriver driver) {
        super(driver);
    }


    public PreMainPage kliknijRodo() {

        clickElement(przyciskRodo);

        return this;
    }


    public MainPage wybierzKrakow() throws InterruptedException {

        clickElement(przyciskWyboruMiasta);

        fillField(poleWpisywaniaMiasta, "Kra");

        for (int i = 1; i <= 5; i++) {
            try {
                clickElement(wybierzKrakow);
                break;
            } catch (Exception e) {

                Thread.sleep(2000);
            }
        }

        return new MainPage(driver);
    }


}
