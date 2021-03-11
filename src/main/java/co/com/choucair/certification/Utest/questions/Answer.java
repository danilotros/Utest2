package co.com.choucair.certification.Utest.questions;

import co.com.choucair.certification.Utest.model.UtestData;
import static co.com.choucair.certification.Utest.userinterface.ValidatePage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {
    private List<UtestData> data;

    public Answer(List<UtestData> data) {
        this.data = data;
    }

    public static Answer toThe(List<UtestData> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto_boton = Text.of(NEXT_BUTTON).viewedBy(actor).asString();
        return data.get(0).getStrTextoBotonFinal().equals(texto_boton);
    }
}
