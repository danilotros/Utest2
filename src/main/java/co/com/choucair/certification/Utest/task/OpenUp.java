package co.com.choucair.certification.Utest.task;

import co.com.choucair.certification.Utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp  implements Task {
    private UtestPage ustesPage;
    public static Performable thePage() {
        return  Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(ustesPage),
                Click.on(ustesPage.JOIN_BUTTON)
                );
    }
}
