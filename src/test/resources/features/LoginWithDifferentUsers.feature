Feature: Log in with different user accounts

  @wip
  Scenario Outline:
    Given user is on the login page
    When user enter "<username>" and "<password>"
    Then user should be able to see his username displayed in the account section
    Examples:
      | username           | password|
      | student1@library   | d5fv9BtX|
      | student2@library   | zyxa10vg|
      | student3@library   | rPjgZ86a|
      | librarian1@library | qU9mrvur |
      | librarian2@library | uYrhHmmj |
      | librarian3@library | DFvU4b1i |

