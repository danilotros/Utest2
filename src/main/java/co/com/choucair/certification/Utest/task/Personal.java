package co.com.choucair.certification.Utest.task;

import co.com.choucair.certification.Utest.model.UtestData;
import co.com.choucair.certification.Utest.userinterface.PersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.Utest.userinterface.PersonalPage.*;

public class Personal implements Task {

    private List<UtestData> data;

    public Personal(List<UtestData> data) {
        this.data = data;
    }

    public static Performable fill(List<UtestData> data) {
        return Tasks.instrumented(Personal.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrName()).into(INPUT_FIRSTNAME),
                Enter.theValue(data.get(0).getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(data.get(0).getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMes()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDia()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrAnio()).from(SELECT_YEAR),
                Click.on(NEXT_BUTTON)
        );
    }
}
