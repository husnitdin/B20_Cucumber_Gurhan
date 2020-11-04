Feature:  Wiki title and search verifications

  Background: User is on the wiki home page
    Given User is on the Wikipedia home page

    @wiki
  Scenario: Search functionality title verification
    When User types "Steve Jobs" in wiki search box
    Then User should see "Steve Jobs" in the wiki title

