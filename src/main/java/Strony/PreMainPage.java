package Strony;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreMainPage extends AbstractPage {


    @FindBy(css = ".cmp-button_button.cmp-intro_acceptAll")
    private WebElement przyciskRodo;
    //@FindBy(className = "cmp-button_button")
    //private WebElement przyciskRodo;

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


    public MainPage wybierzMiasto(String miasto) {
        clickElement(przyciskWyboruMiasta);
        //clickElement(poleWpisywaniaMiasta);
        fillField(poleWpisywaniaMiasta, "Kra");
        clickElement(wybierzKrakow);

        return new MainPage(driver);
    }







}
