package Testy;

import Strony.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.applet.Main;

public class MojeMiejsceTest extends AbstractTest {


    @Test
    public void WyborMojegoMiejscaTest() {

        MainPage strona = new MainPage(driver);

        strona.wpiszPoleZ("Lubicz");

            }


}
