@TC3
Feature: TC3

  @completed @librarian
  Scenario: Log in as librarians with parameters
    Given user enters librarian "librarian2@library" and "uYrhHmmj"
    Then user should see the dashboard

    @completed @student
    Scenario: Log in as a student with parameters
      Given user enters student "student2@library" and user enters student "zyxa10vg"
      Then student should see Book management header is displayed.
