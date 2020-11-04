Feature:  Wiki title and search verifications

  Background: User is on the wiki home page
    Given User is on the Wikipedia home page
    When User types "Steve Jobs" in wiki search box
    @wiki
  Scenario: Search functionality title verification
    Then User should see "Steve Jobs" in the wiki title

    @mainHeader
  Scenario: Search functionality header verification
    Then User should see "Steve Jobs" in the main header

    @imageHeader
  Scenario: Search functionality header verification
    Then User should see "Steve Jobs" in the image header
