package Strony;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {


    @FindBy(css = "#cn-login-name")
    private WebElement emailField;

    @FindBy(css = "#cn-login-password")
    private WebElement passwordField;

    @FindBy(css = ".cn-header-login")
    private WebElement loginButton;

    //@FindBy(xpath = "/html/body/div[3]/main/div/div[1]/header/div/div[2]/div[3]")
    //private WebElement logOutButton1;

    @FindBy(css = ".cn-header-login")
    private WebElement logOutButton1;


    //@FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/app-auth-panel-dialog/app-auth-panel/div/div/app-user-profile-panel/div/div[2]/button[3]")
    //private WebElement logOutButton2;
    @FindBy(css = "button.edit-profile__content__btn:nth-child(3)")
    private WebElement logOutButton2;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div/mat-dialog-container/app-auth-panel-dialog/app-auth-panel/div/div/app-login-panel/form/button")
    private WebElement loginSubmitButton;

    @FindBy(className = "cn-toasts-container")
    private WebElement loginSubmitText;


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

        clickElement(logOutButton1);
        driver.findElement(By.xpath("")).getLocation();

        clickElement(logOutButton2);
        return this;
    }

    public String textToConfirmLogin() {


        try {

            return loginSubmitText.getText();
        }
        catch (Exception e) {


            return loginSubmitText.getText();

        }
    }

    public boolean czyZalogowany(){

        return logOutButton1.isDisplayed();
    }

    public boolean czyWylogowany(){

        return loginButton.isDisplayed();
    }


}
