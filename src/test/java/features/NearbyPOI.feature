Feature: Nearby POI

  Scenario: Nearby POI are displayed

    Given User accepts app conditions and allows access to location
    When User goes to 'Nearby POI'
    Then Nearby POI are displayed

  Scenario: Nearby POI around screen center are displayed when user enters first time this view

    Given User accepts app conditions and allows access to location
    When User goes to 'Nearby POI'
    Then Nearby POI around screen center are displayed

  Scenario: User changes nearby POI selection to around GPS location

    Given User accepts app conditions and allows access to location
    When User goes to 'Nearby POI'
    And User change ‘Around screen center’ to ‘Around GPS position’
    Then Nearby POI around GPS position are displayed

  Scenario: All the elements on IBOMBO POI are displayed
    Given User accepts app conditions and allows access to location
    And User is located in Warsaw center
    When User goes to 'Nearby POI'
    And User clicks IBOMBO POI
    Then All the elements on IBOMBO POI are displayed

  Scenario: All the elements on VETURILO POI are displayed
    Given User accepts app conditions and allows access to location
    And User is located in Warsaw center
    When User goes to 'Nearby POI'
    And User clicks VETURILO POI
    Then All the elements on VETURILO POI are displayed

  Scenario: All the elements on BICYKLE PARKING POI are displayed
    Given User accepts app conditions and allows access to location
    And User is located in Warsaw center
    When User goes to 'Nearby POI'
    And User clicks BICYCLE PARKING POI
    Then All the elements on BICYKLE PARKING POI are displayed

  Scenario: User can see empty POI list screen
    Given User accepts app conditions and allows access to location
    And User located out of Warsaw
    When User goes to 'Nearby POI'
    Then An empty POI list is displayed