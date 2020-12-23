Feature: uber booking feature
@smoke
  Scenario: booking cab
    Given user wants to select a car type from uber application
    When user selects car "seden" and pick "dhaka" and drop locaton "mirpur"
    Then driver starts the journey
    And driver ends the journey
    Then user pays 1000 USD

  #Feature: buy t-shirt
  @sanity
  Scenario: surfing e-commerce website
    Given user open desired browesr
    And user nevegate express website
    When user enter into men categories
    And user click on t-shirt
    Then user click on any shirt
