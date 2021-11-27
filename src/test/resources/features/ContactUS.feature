Feature: Contact us
  @tagTest
  Scenario: contact us with attached pic
    Given I open a browser
    And I go to the contact us page
    When I chose a subject heading
    And I enter my email as "Raian@gmail.com"
    And I enter my order reference as "abcd1234"
    And I attach the picture for the product
    And I enter my message
    And I click on the send button
    Then I should see the confirmation text
