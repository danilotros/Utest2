package co.com.choucair.certification.Utest.task;

import co.com.choucair.certification.Utest.model.UtestData;
import static co.com.choucair.certification.Utest.userinterface.ValidatePage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class FillValidateForm implements Task {
    private List<UtestData> data;

    public FillValidateForm(List<UtestData> data) {
        this.data = data;
    }

    public static Performable inPageValidate(List<UtestData> data) {
        return Tasks.instrumented(FillValidateForm.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(INPUT_CONFIRMPASSWORD),
                Click.on(CHECK_TERMS),
                Click.on(CHECK_PRIVACY)
        );
    }
}
