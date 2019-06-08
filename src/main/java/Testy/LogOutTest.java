package Testy;


import Strony.MainPage;
import org.testng.Assert;

import org.testng.annotations.Test;


public class LogOutTest extends AbstractTest  {


    @Test
    public void successLogOutTest() {
        MainPage mainPage = new MainPage(driver);

        mainPage.wyloguj();


//        Assert.assertEquals(mainPage.textToConfirmLogin(),"Wylogowałeś się!");
        Assert.assertTrue(mainPage.czyWylogowany());
    }



}
