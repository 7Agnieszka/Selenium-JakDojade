package Strony;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {


    @FindBy(css = "#cn-login-name")
    private WebElement emailField;

    @FindBy(css = "#cn-login-password")
    private WebElement passwordField;

    @FindBy(css = ".cn-header-login")
    private WebElement loginButton;

    @FindBy(css = ".cn-header-login")
    private WebElement logOutButton1;

    @FindBy(css = "button.edit-profile__content__btn:nth-child(3)")
    private WebElement logOutButton2;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div/mat-dialog-container/app-auth-panel-dialog/app-auth-panel/div/div/app-login-panel/form/button")
    private WebElement loginSubmitButton;

    @FindBy(className = "cn-toasts-container")
    private WebElement loginSubmitText;

    @FindBy(xpath = "//*[@id=\"cn-planner\"]/div[2]/div/div[1]/div[1]/div[2]/form/strong/input")
    private WebElement poleTrasaZ;

    @FindBy(css = ".cdk-overlay-backdrop .cdk-overlay-dark-backdrop .cdk-overlay-backdrop-showing")
    private WebElement formularzTrasy;

    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/header/div/app-settings-button/div")
    private WebElement przyciskUstawienia;

    @FindBy(id = "map-stop-button")
    private WebElement przyciskPrzystanki;

    @FindBy(className = "cn-menu-schedules")
    private WebElement przyciskRozklady;

    @FindBy(className = "cn-menu-search")
    private WebElement przyciskTrasy;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage wypelnijFormularzLogowania(String email, String password) {
        clickElement(loginButton);
        fillField(emailField, email);
        fillField(passwordField, password);

        return this;
    }


    public MainPage potwierdzLogowanie() {

        clickElement(loginSubmitButton);
        return this;
    }

    public MainPage wyloguj() {

        Actions act = new Actions(driver);
        act.moveToElement(logOutButton1);

        clickElement(logOutButton1);


        clickElement(logOutButton2);
        return this;
    }


    public boolean czyZalogowany() {

        return logOutButton1.isDisplayed();
    }

    public boolean czyWylogowany() {

        return loginButton.isDisplayed();
    }


    public ZmianaJezykaPage przejdzDoZmianyJezyka() {

        clickElement(przyciskUstawienia);

        return new ZmianaJezykaPage(driver);
    }

    public String tekstPrzyciskuLogowania() {

        return loginButton.getText();

    }

    public MainPage wyswietlSchowajPrzystanki() {

        clickElement(przyciskPrzystanki);

        return this;
    }

    public MainPage wybierzRozklady() {
        clickElement(przyciskRozklady);
        return this;
    }

    public MainPage wybierzTrase() {
        clickElement(przyciskTrasy);
        return this;
    }

}

