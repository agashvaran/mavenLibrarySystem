Feature: is it the same book?
  To see if method returns the details of the book correctly

  Scenario: This is or is not the same book title
    Given the book title is "catch-22"
    When i ask for the book title
    Then i should be told "catch-22"

#

  Scenario: This is or is not the same author
    Given The book author is "Conn Iggulden"
    When i ask for the book author
    Then i should be told that the author is "Conn Iggulden"