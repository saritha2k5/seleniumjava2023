package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {

@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {
	System.out.println("step with precondition");
}

@And("some other precondition")
public void some_other_precondition() {
   System.out.println("some other precondition");
}

@When("I complete action")
public void i_complete_action() {
    System.out.println("I complete action");
}

@And("some other action")
public void some_other_action() {
    System.out.println("some other action");
}

@And("yet another action")
public void yet_another_action() {
    System.out.println("yet another action");
}

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
    System.out.println("validate the outcome");
}

@Then("check more outcomes")
public void check_more_outcomes() {
    System.out.println("check more outcome");
}
}
