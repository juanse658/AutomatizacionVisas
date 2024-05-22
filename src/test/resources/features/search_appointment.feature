#Author: jefferson.cardenas@sophossolution.com
Feature: Search appointment

  Scenario: search for a successful appointment
    Given I am on the main booking page
    And Login
      | username | juan.arbelaez316@gmail.com |
      | password | 123456789                  |
    When looking for a new appointment


