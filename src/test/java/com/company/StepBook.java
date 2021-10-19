package com.company;

import com.company.Books;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


public class StepBook {

    private String actualAnswer;
    Books book1 = new Books("");

//////////////////////////////////////////////////

    @Given("the book title is {string}")
    public void book_title_is(String title){
        book1.setTitle(title);
    }

    @When("i ask for the book title")
    public void i_ask_book_title() {
        actualAnswer = book1.getTitle();
    }

    @Then("i should be told {string}")
    public void i_should_be_told_the_title_is(String expectedTitle) {
        assertEquals(expectedTitle, actualAnswer);
    }

/////////////////////////////////////////////////

    @Given("The book author is {string}")
    public void the_book_author_is(String author) {
        book1.setAuthor(author);
    }

    @When("i ask for the book author")
    public void i_ask_for_the_book_author() {
        actualAnswer = book1.getAuthor();
    }

    @Then("i should be told that the author is {string}")
    public void i_should_be_told_that_the_author_is(String expectedAuthor) {
        assertEquals(expectedAuthor, actualAnswer);
    }




}
