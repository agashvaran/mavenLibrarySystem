Feature: is it the same book?
  To see if method returns the title of the book correctly

  Scenario: This is or is not the same book title
    Given the book title is catch-22
    When i ask for the book title
    Then i should be told "catch-22"

  Scenario:


#    Examples:
#    | title       | answer    |
#    | catch-22    | catch-22  |