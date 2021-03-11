package co.com.choucair.certification.Utest.stepdefinitions;

import co.com.choucair.certification.Utest.model.UtestData;
import co.com.choucair.certification.Utest.questions.Answer;
import co.com.choucair.certification.Utest.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class utestStepDefinitions {
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Daniel want register utest platform$")
    public void thanDanielWantRegisterUtestPlatform() {
        theActor("Daniel").wasAbleTo(OpenUpUtest.thePage());
    }

    @When("^he fill out the forms$")
    public void heFillOutTheForms(List<UtestData> data) {
        theActorInTheSpotlight().attemptsTo(
                FillPersonalInformation.inPagePersonalInformation(data),
                FillAdress.inPageAdress(data),
                FillDevices.inPageDevice(data),
                FillValidateForm.inPageValidate(data)
        );
    }

    @Then("^he finish the proccess$")
    public void heFinishTheProccess(List<UtestData> data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)));
    }
}
