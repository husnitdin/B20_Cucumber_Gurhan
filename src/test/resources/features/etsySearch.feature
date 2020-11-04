Feature: Etsy Search feature
  As a user, I should be able to enter search terms and see
  relevant results in the page and title

  Background:  User is on Etsy home page
    Given User is on etsy home page
    # since Given part is repeated in other scenarios we put that line into Background

  Scenario: Title verification
    Then User should see title is as expected

  @etsyWip
  Scenario: Title verification after search term
    When User enters "wooden spoon" in the search box
    And User clicks to search button
    Then User should see "wooden spoon" in the etsy title




