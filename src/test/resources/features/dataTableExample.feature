Feature: Example of how to implement data table

  @dataTable
  Scenario: Something happens

    #Given User does smth
    Then User should see below words displayed
      | Apple    |
      | Kiwi     |
      | Orange   |
      | Cucumber |
      | Broccoli |

    # Command+ Option + L => straightens up the above weird lines