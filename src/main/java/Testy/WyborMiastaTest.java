package Testy;

import Strony.MainPage;
import Strony.PreMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WyborMiastaTest extends AbstractTest {

    @Test
    public void WybierzIstniejaceMiastoZListyTest() {

        PreMainPage preMainPage = new PreMainPage(driver);

        preMainPage.kliknijRodo();
        preMainPage.wybierzMiasto("Kraków");

        Assert.assertEquals(preMainPage.wezAdresStrony() , "https://jakdojade.pl/krakow/trasa/");


    }
}