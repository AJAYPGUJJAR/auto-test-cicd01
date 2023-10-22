@SmokeTest
Feature: sample test

  Scenario: test login
    Given I open url "properties.url.logintest-practiceTestAutomation"
    When I click on the element "webelements.loginpage.textbox-username"
    When I add "properties.cred.username" to the inputfield "webelements.loginpage.textbox-username"
    When I add "properties.cred.userAuth" to the inputfield "webelements.loginpage.textbox-userauth"
    When I click on the element "webelements.loginpage.button-submit"
    Then I expect that element "//h1" matches the text "Logged In Successfully"

  Scenario: test dropdown - select by index
    Given I open url "properties.url.dropdowntest-globalsqa"
    When I select the 1st option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the 2nd option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the 3rd option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the 4th option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the 5th option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"

  Scenario: test dropdown - select by value, select by text
    Given I open url "properties.url.dropdowntest-globalsqa"
    When I select the option with the value "GRD" for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the option with the text "Thailand" for element "webelements.globalsqa-dropdown.dropdown-selectcountry"

  Scenario: test scroll to element
    Given I open url "properties.url.dropdowntest-globalsqa"
    When I scroll to element "#footer > div > div > div > div > div"
    When I pause for 2000ms
