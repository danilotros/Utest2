package co.com.choucair.certification.Utest.task;

import co.com.choucair.certification.Utest.model.UtestData;
import static co.com.choucair.certification.Utest.userinterface.CompletePage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Complete implements Task {
    private List<UtestData> data;

    public Complete(List<UtestData> data) {
        this.data = data;
    }

    public static Performable fill(List<UtestData> data) {
        return Tasks.instrumented(Complete.class,data);
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
