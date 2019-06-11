package Testy;


import Strony.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogOutTest extends AbstractTest {


    @Test
    public void successLogOutTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);

        mainPage.wyloguj();


        Assert.assertTrue(mainPage.czyWylogowany());
    }


}
