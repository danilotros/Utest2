package co.com.choucair.certification.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
@DefaultUrl("https://www.utest.com")
public class UtestPage extends PageObject {
    public static final Target JOIN_BUTTON =Target.the( "button that start the register").located(By.xpath("//a[contains(text(),'Join Today')]"));
}
