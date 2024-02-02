package com.virgingames.info;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class GameSteps {

    @Step("Get all the currency GBP data")
    public ValidatableResponse getAllPotsCurrencyGBPData(){
        return SerenityRest.given()
                .log().ifValidationFails()
                .when()
                .get(EndPoints.CURRENCY_GBP)
                .then();
    }

    @Step("Get all the currency EUR data")
    public ValidatableResponse getAllPotsCurrencyEURData(){
        return SerenityRest.given()
                .log().ifValidationFails()
                .when()
                .get(EndPoints.CURRENCY_EUR)
                .then();
    }
}
