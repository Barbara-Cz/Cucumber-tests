Feature: New Address creation

  Scenario Outline: Add and verify new added address
    Given I'm on shop Home page
    When I go to Sign in page
    And I sign in using "zkkrrggkmtuwprpzfi@cazlg.com" and "1234ToStefcio:)"
    And I go to addresses page
    And I add new address
    And I fill in the New address form with alias <alias> address <address> city <city> postalCode <postalCode> country <country> and phone <phone>
    Then I verify created address <alias>, <name>, <surname>, <address>, <city>, <postalCode>, <country>, <phone>
    And I delete created address
    And I close the browser
    Examples:
      | alias      | name   | surname | address  | city        | postalCode | country        | phone     |
      | MyyAddress | Stefan | Kokos   | Kocia 15 | Klebuszkowo | 678        | United Kingdom | 565424235 |