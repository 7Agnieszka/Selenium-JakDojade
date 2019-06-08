package Testy;

import Strony.MainPage;
import Strony.ZmianaJezykaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZmienJezykTest extends AbstractTest {


    @Test
    public void ZmienJezykNaAngielskiTest() {

        MainPage mainPage = new MainPage(driver);

        ZmianaJezykaPage zmianaJezykaPage = mainPage.przejdzDoZmianyJezyka();

        zmianaJezykaPage.wybierzAngielski();


        Assert.assertEquals(mainPage.tekstPrzyciskuLogowania(), "Sign In");

    }


    @Test
    public void ZmienJezykNaPolskiTest() {

        MainPage mainPage = new MainPage(driver);

        ZmianaJezykaPage zmianaJezykaPage = mainPage.przejdzDoZmianyJezyka();

        zmianaJezykaPage.wybierzPolski();


        Assert.assertEquals(mainPage.tekstPrzyciskuLogowania(), "Zaloguj się");

    }

}
