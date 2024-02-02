package com.virgingames.cucumber;

import com.virgingames.info.GameSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import static org.hamcrest.CoreMatchers.equalTo;

public class MyStepDef {

    static ValidatableResponse response;
    @Steps
    GameSteps steps;

    @When("User sends a request to get all the currency GPB data")
    public void userSendsARequestToGetAllTheCurrencyGPBData() {
        response = steps.getAllPotsCurrencyGBPData();
        response.statusCode(200).log().all();
    }

    @Then("Verify that the currency is in GBP")
    public void verifyThatTheCurrencyIsInGBP() {
        response.body("data.pots[0].currency", equalTo("GBP"));
    }

    @When("User sends a request to get all the currency EUR data")
    public void userSendsARequestToGetAllTheCurrencyEURData() {
        response = steps.getAllPotsCurrencyEURData();
        response.statusCode(200).log().all();

    }

    @Then("Verify that the currency is in EUR")
    public void verifyThatTheCurrencyIsInEUR() {
        response.body("data.pots[0].currency", equalTo("EUR"));
    }
}
