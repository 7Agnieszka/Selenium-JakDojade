package Strony;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class PanelWyboruTrasy extends AbstractPage {


    @FindBy(css = ".cn-direction-a input.ng-pristine")
    private WebElement przyciskPunktStartowy;

    @FindBy(css = ".cn-direction-b input.ng-pristine")
    private WebElement przyciskPunktKoncowy;

    @FindBy(className = "cn-planner-action-button")
    private WebElement przyciskTrasy;

    //@FindBy(css = ".ng-scope .ng-isolate-scope .cn-planner-route .cn-vehicle-type-icon-included")
    //private WebElement wynikTrasy;

    @FindBy(css = ".cn-vehicle-type-icon-included")
    private WebElement wynikTrasy;

    public PanelWyboruTrasy(WebDriver driver) {
        super(driver);
    }


    public PanelWyboruTrasy wybierzPunktStartowy(String przystanekPoczatkowy) {

        Actions act = new Actions(driver);
        act.moveToElement(przyciskPunktStartowy);

        fillField(przyciskPunktStartowy, przystanekPoczatkowy + Keys.ENTER);


        return this;
    }



    public PanelWyboruTrasy wybierzPunktKoncowy(String przystanekKoncowy) {

        Actions act = new Actions(driver);
        act.moveToElement(przyciskPunktKoncowy);

        fillField(przyciskPunktKoncowy, przystanekKoncowy + Keys.ENTER);

        return this;
    }


    public PanelWyboruTrasy wybierzTrase() {
        clickElement(przyciskTrasy);
        return this;
    }

    public boolean trasaWyswietlona(){

       return wynikTrasy.isDisplayed();
    }


}
