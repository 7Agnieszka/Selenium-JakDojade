package Strony;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PanelWyboruTrasy extends  AbstractPage{

    @FindBy(className = "cn-direction-a")
    private WebElement poleTrasaZ;


    public PanelWyboruTrasy(WebDriver driver) {
        super(driver);
    }





}
