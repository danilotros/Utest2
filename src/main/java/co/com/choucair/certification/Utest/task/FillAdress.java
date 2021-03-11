package co.com.choucair.certification.Utest.task;

import co.com.choucair.certification.Utest.model.UtestData;
import static co.com.choucair.certification.Utest.userinterface.AddressPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillAdress implements Task {

    private List<UtestData> data;
    public FillAdress(List<UtestData> data){
        this.data=data;
    }
    public static Performable inPageAdress(List<UtestData> data) {
        return Tasks.instrumented(FillAdress.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrCiudad()).into(INPUT_CITY),
                Enter.theValue(data.get(0).getStrCode()).into(INPUT_ZIP),
                Click.on(DIV_COU),
                Enter.theValue(data.get(0).getStrPais()).into(INPUT_COU).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(INPUT_CITY),
                Click.on(NEXT_BUTTON)
        );
    }
}
