Feature:
  As a user
  I should be on the valuation page

  @valuation
  Scenario: Validate user can send valuation

    Given When I'm on valuations page "https://moovshack.com/web/valuations-uat"
    When I enter password "123"
    When i click on enter
    When I scroll down the end
    When I enter postcode "LU11BT"
    When I click on find my address button
    When I select property type
    When i select property condition
    When I enter no of bedrooms "2"
    When I enter no of bathrooms "1"
    When I enter no of receptions "1"
    When I select valuations reason
    When I click on next button
    When i upload an images "/Users/vinaykumar/Downloads/2021_02_12_03_25_23.jpg"
    When I click on next
    When I enter first name "Alex"
    When I enter last name "Hos"
    When I enter email "alexhos@yopmail.com"
    When I enter mobile number "12345678"
    When I select consent box
    Then I click on get valuations