package Testy;

import Strony.PreMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WyborMiastaTest extends AbstractTest {

    @Test
    public void WybierzKrakowZListyTest() {

        PreMainPage preMainPage = new PreMainPage(driver);

        preMainPage.kliknijRodo();
        preMainPage.wybierzKrakow();

        Assert.assertEquals(preMainPage.wezAdresStrony(), "https://jakdojade.pl/krakow/trasa/");


    }
}