Feature: Librarian login feature

  @wip
  Scenario: Login as librarian in the same line

    Given I am on the login page
    When I login using "librarian1@library" and "qU9mrvur"

    Then dashboard should be displayed
    And there should be 171 users

