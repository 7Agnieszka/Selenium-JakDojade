package Testy;

import Strony.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrzyciskiTest extends AbstractTest {

    @Test
    public void wyswietlPrzystankiTest(){

        MainPage mainPage = new MainPage(driver);

        mainPage.wyswietlSchowajPrzystanki();

        Assert.assertEquals(mainPage.wezAdresStrony(),"https://jakdojade.pl/krakow/trasa/?stopsLayer=true");


    }

    @Test
    public void schowajPrzystankiTest(){

        MainPage mainPage = new MainPage(driver);

        mainPage.wyswietlSchowajPrzystanki();

        Assert.assertEquals(mainPage.wezAdresStrony(),"https://jakdojade.pl/krakow/trasa/");

    }







}
