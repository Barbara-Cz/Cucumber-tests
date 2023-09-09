Feature: Placing new order

  Scenario: Placing an Order for Hummingbird Printed Sweater

    Given I'm on shop Home page
    When I go to Sign in page
    And I sign in using "zkkrrggkmtuwprpzfi@cazlg.com" and "1234ToStefcio:)"
    And I go back to Home Page
    And I select the Hummingbird Printed Sweater product
    And I select size M
    And I select 5 pieces
    And I add the product to the cart
    And I proceed to the checkout
    And I confirm the delivery address
    And I choose the pick up in store pickup method
    And I select the Pay by Check payment method
    And I place the order
    Then I should see an order confirmation with the total amount
    And I close the browser
