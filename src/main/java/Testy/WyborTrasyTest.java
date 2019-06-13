package Testy;

import Strony.PanelWyboruTrasy;
import org.testng.Assert;

import org.testng.annotations.Test;


public class WyborTrasyTest extends AbstractTest {


    @Test
    public void wyswietlTrasyTest() throws InterruptedException {

        PanelWyboruTrasy panelWyboruTrasy = new PanelWyboruTrasy(driver);

        panelWyboruTrasy.wybierzPunktStartowy("bronowice");
        panelWyboruTrasy.wybierzPunktKoncowy("Lubicz");
        Thread.sleep(100);
        panelWyboruTrasy.wybierzTrase();
        Thread.sleep(2000);
        Assert.assertTrue(panelWyboruTrasy.trasaWyswietlona());
    }


}