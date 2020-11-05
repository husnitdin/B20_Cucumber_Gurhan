Feature: Search

  Agile story: As a user, I should be able to search when I'm on google search page

  @scenarioOutline
  Scenario Outline: Google title verification after search

    Given User is on google search page
    When User searches "<searchValue>"
    Then User should see "<expectedTitle>" in the title

    Examples: Search values I want to search in Google
      | searchValue | expectedTitle |
      | apple       | apple         |
      | kiwi        | kiwi          |
      | orange      | orange        |

    # we create table inside of feature file to avoid scenario repetition

