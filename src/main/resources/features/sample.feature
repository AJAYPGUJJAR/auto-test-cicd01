@SmokeTest
Feature: sample test

  Scenario: test login
    Given I open the url "properties.url.logintest-practiceTestAutomation"
    When I click on the element "webelements.loginpage.textbox-username"
    When I add "properties.cred.username" to the inputfield "webelements.loginpage.textbox-username"
    When I add "properties.cred.userAuth" to the inputfield "webelements.loginpage.textbox-userauth"
    When I click on the element "webelements.loginpage.button-submit"
    Then I expect that element "//h1" matches the text "Logged In Successfully"

  Scenario: test dropdown - select by index
    Given I open the url "properties.url.dropdowntest-globalsqa"
    When I select the 1st option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the 2nd option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the 3rd option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the 4th option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the 5th option for element "webelements.globalsqa-dropdown.dropdown-selectcountry"

  Scenario: test dropdown - select by value, select by text
    Given I open the url "properties.url.dropdowntest-globalsqa"
    When I select the option with the value "GRD" for element "webelements.globalsqa-dropdown.dropdown-selectcountry"
    When I select the option with the text "Thailand" for element "webelements.globalsqa-dropdown.dropdown-selectcountry"

  Scenario: test scroll to element
    Given I open the url "properties.url.dropdowntest-globalsqa"
    When I scroll to element "#footer > div > div > div > div > div"
    When I pause for 2000ms

  Scenario: test scroll and click without unsafe-eval
    Given I open the url "https://the-internet.herokuapp.com/upload"
    When I scroll and click on the element "#dummy-element"
    When I scroll up and click on the element "#dummy-element"

  Scenario: test accessibility
    Given I open the url "properties.url.logintest-practiceTestAutomation"
    Then I check accessibility of UI Webpage "Login Page-01"
    Then I check accessibility of UI Webpage "Login Page-02" with "wcag2a, wcag2aa, wcag2aaa, wcag21a, wcag21aa" standards to be validated

  Scenario: test add and set functinality
    Given I open the url "properties.url.logintest-practiceTestAutomation"
    When I add "properties.cred.username" to the inputfield "webelements.loginpage.textbox-username"
    When I add "properties.cred.username" to the inputfield "webelements.loginpage.textbox-username"
    When I set "properties.cred.username" to the inputfield "webelements.loginpage.textbox-username"

  Scenario: test file upload
    Given I open the url "https://the-internet.herokuapp.com/upload"
    When I upload the file "src/main/resources/uploads/nocontent.txt" at the element "#file-upload"
    When I upload the file "src/main/resources/uploads/nocontentdocs.docx" at the element "#file-upload"
    When I upload the file "src/main/resources/uploads/nocontentjpg.jpg" at the element "#file-upload"
    When I upload the file "src/main/resources/uploads/nocontentpng.png" at the element "#file-upload"
