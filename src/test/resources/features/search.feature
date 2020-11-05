@google
Feature: Search

  Agile story: As a user, I should be able to search when I'm on google search page

  Background: User should be on google search page
    Given User is on google search page

  Scenario: Google default title verification
    Then User should see title is Google

  @wip # meaning => work in progress
  Scenario: Google title verification after search
    When User searches apple
    Then User should see apple in the title

      # Option + Enter generates step definitions
  Scenario: Google title verification after search
    When User searches "peach"
    Then User should see "peach" in the title

  @googleHomePageLinks
  Scenario: Google search page footer links verification
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Settings         |
      | About            |














