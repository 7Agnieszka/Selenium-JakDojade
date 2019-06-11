package Testy;

        import Strony.MainPage;
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
        Thread.sleep(1000);
       Assert.assertTrue(panelWyboruTrasy.trasaWyswietlona());
       // Assert.assertEquals(panelWyboruTrasy.wezAdresStrony(), "https://jakdojade.pl/krakow/trasa/z--Bronowice-Wiadukt--do--Lubicz?fn=Bronowice%20Wiadukt&tn=Lubicz&tc=50.064995:19.951123&fc=50.08076:19.89065&fsn=Bronowice%20Wiadukt&tsn=Lubicz&ft=LOCATION_TYPE_STOP&tt=LOCATION_TYPE_STOP&d=11.06.19&h=22:50&aro=1&t=1&rc=3&ri=1&r=0");
    }



}