@loginWithBackground
Feature: Login feature

  JiraTickerN CBT-15: As a user I should be able to  login with correct
  credentials to different accounts. And dashboard should be displayed.

  # Before annotation runs here
  Background: Backstory is that user is on the login page
      Given User is on the login page

  Scenario: Librarian login scenario
    When User logs in as a librarian
    Then User should see dashboard
    # After annotation runs here

  Scenario: Student login scenario
    When User logs in as a student
    Then User should see dashboard
    # After annotation runs here

    @dataBase
  Scenario: Admin login scenario

      #Before step runs here
    When User logs in as an admin
      #After step runs here

      #Before step runs here
    Then User should see dashboard
      #After step runs here
      # After annotation runs here

