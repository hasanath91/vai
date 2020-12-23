Feature: User Regisrtation

  Scenario: User Registration with different data
    Given User is on registration page
    When User enters and following usewr details with columns
    |name|eamil|
    |hasanath|ahasanath85@gmail.com|
    |abul|hasanatsarker@gmail.com|
    |sarker|abulhasanath91@gmail.com|
    
    Then user registeration should be successful

