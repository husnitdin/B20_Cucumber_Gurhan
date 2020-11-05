Feature: Search

  Agile story: As a user, I should be able to search when I'm on google search page

  Scenario: Google title verification after search

    Given User is on google search page
    When User searches "peach"
    Then User should see "peach" in the title


