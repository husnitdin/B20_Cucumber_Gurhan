Feature:  Wiki title and search verifications

  Background: User is on the wiki home page
    Given User is on the Wikipedia home page

  @wiki
  Scenario: Search functionality title verification
    When User types "Steve Jobs" in wiki search box
    Then User should see "Steve Jobs" in the wiki title

  @mainHeader
  Scenario: Search functionality header verification
    When User types "Steve Jobs" in wiki search box
    Then User should see "Steve Jobs" in the main header

  @imageHeader
  Scenario: Search functionality header verification
    When User types "Steve Jobs" in wiki search box
    Then User should see "Steve Jobs" in the image header


    @SJCheckInThreePlaces
  Scenario Outline: Search functionality header verification

    When User types "<searchValue>" in wiki search box
    Then User should see "<expectedTitle>" in the title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedImageHeader>" in the image header

    Examples: Search values I want to search in Wikipedia
      | searchValue | expectedTitle |expectedMainHeader|expectedImageHeader|
      | Steve Jobs  | Steve Jobs    |Steve Jobs        |Steve Jobs         |
      |John Travolta|John Travolta  |John Travolta     |John Travolta      |
      |Bruce Lee    |Bruce Lee      |Bruce Lee         |Bruce Lee          |






