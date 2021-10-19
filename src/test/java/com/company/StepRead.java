package com.company;

import com.company.Magazines;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepRead {

    private String item;
    private String actualAnswer;
    Magazines mag1 = new Magazines("");


    @Given("the item is a Magazine")
    public void the_item_is_a_magazine() {
        item = "Magazine";
    }

    @When("i ask if it is readable")
    public void i_ask_if_it_is_readable() {
        actualAnswer = mag1.read().equals("reading magazine") ? "Yes" : "No";
    }

    @Then("i should be told that the answer is {string}")
    public void i_should_be_told_that_the_answer_is(String string) {
        assertEquals("not working",string, actualAnswer);
    }


}
