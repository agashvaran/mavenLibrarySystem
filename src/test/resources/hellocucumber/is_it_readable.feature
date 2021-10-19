Feature: is it readable?
  To see if a medium is readable

  Scenario: Magazine is readable
    Given the item is a Magazine
    When i ask if it is readable
    Then i should be told that the answer is "Yes"