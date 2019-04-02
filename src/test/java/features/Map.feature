Feature: Map

  Scenario: Accepting app conditions and allowing access to location

    Given User accepts app conditions and allows access to location
    Then Map and all elements on the map are displayed

  Scenario: Checking if all positions il legend are displayed

    Given User accepts app conditions and allows access to location
    When User clicks legend button
    Then All positions in legend are displayed

  Scenario: Checking if recording works properly

    Given User accepts app conditions and allows access to location
    When User clicks start recording button

