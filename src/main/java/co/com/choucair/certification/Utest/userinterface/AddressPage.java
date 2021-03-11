package co.com.choucair.certification.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {

    public static final Target INPUT_CITY = Target.the("location city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("location zip").located(By.id("zip"));
    public static final Target DIV_COU= Target.the("DIV PAIS").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target DIV_CIT= Target.the("DIV PAIS").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target NEXT_BUTTON =Target.the( "button that start the register").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target INPUT_COU = Target.the("Country select").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
}
