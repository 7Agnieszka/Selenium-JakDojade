package Testy;

import Strony.MainPage;
import org.testng.Assert;

import org.testng.annotations.Test;


public class LoginTest extends AbstractTest {


    @Test
    public void successLoginTest() {
        MainPage mainPage = new MainPage(driver);

        mainPage.wypelnijFormularzLogowania("tester.testowy@onet.eu","JakDojade1");

        mainPage.potwierdzLogowanie();

        Assert.assertEquals(mainPage.textToConfirmLogin(),"Zostałeś Zalogowany!");
      //  Assert.assertTrue(mainPage.czyZalogowany());
    }





}