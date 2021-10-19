package com.company;

import com.company.Books;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepDefinitions {

    private String actualAnswer;
    Books book1 = new Books("");

    @Given("the book title is catch-22")
    public void book_title_is(){
        book1.setTitle("catch-22");
    }

    @When("i ask for the book title")
    public void i_ask_book_title() {
        actualAnswer = book1.getTitle();
    }

    @Then("i should be told {string}")
    public void tell_me(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }







}
