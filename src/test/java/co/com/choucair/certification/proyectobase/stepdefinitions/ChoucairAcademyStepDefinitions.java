package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than dwayne  wants to learn automation a the Academy Choucair$")
    public void thanDwayneWantsToLearnAutomationATheAcademyChoucair() {
        OnStage.theActorCalled("Dwayne").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair Academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionOnTheChoucairAcademyPlataform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course calles resources (.*)$")
    public void heFindsTheCourseCallesResourcesRecursosAutomatizacionBancolombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}