package Testy;

import Strony.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrzyciskiTest extends AbstractTest {

    @Test
    public void _wyswietlPrzystankiTest(){

        MainPage mainPage = new MainPage(driver);

        mainPage.wyswietlSchowajPrzystanki();

        for(int i=0; i<=10; i++);

        Assert.assertEquals(mainPage.wezAdresStrony(),"https://jakdojade.pl/krakow/trasa/?stopsLayer=true");


    }

    @Test
    public void schowajPrzystankiTest(){

        MainPage mainPage = new MainPage(driver);

        mainPage.wyswietlSchowajPrzystanki();

        Assert.assertEquals(mainPage.wezAdresStrony(),"https://jakdojade.pl/krakow/trasa/");

    }
    @Test
    public void wyswietlRozkladyTest(){

        MainPage mainPage = new MainPage(driver);

        mainPage.wybierzRozklady();

        Assert.assertEquals(mainPage.wezAdresStrony(),"https://jakdojade.pl/krakow/rozklad-jazdy");

    }
    @Test
    public void wyswietlTrasyTest(){

        MainPage mainPage = new MainPage(driver);

        mainPage.wybierzTrase();

        Assert.assertEquals(mainPage.wezAdresStrony(),"https://jakdojade.pl/krakow/trasa/");

    }







}
