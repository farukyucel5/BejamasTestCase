@wip
Feature:  Testing some features of the website called Bejamas

  Background: common parts of the scenarios
    Given navigate to the website

  Scenario:The featured product
    And verify photo of the day
  Scenario: Checking the number of items
    Then verify the product list contains six items
  Scenario:Checking whether or not add to cart button appears during hovering over the image
    And add to cart button should come out after hovering over

