Feature: GameTest
  Scenario: Test 1
    Given I started the game with world "ball"
    When i input "b"
    When i input "a"
    When i input "l"
    Then the result of game should be true

  Scenario: Test 2
    Given I started the game with world "cat"
    When i input "c"
    When i input "a"
    When i input "r"
    Then the result of game should be false

  Scenario: Test 3
    Given I started the game with world "dog"
    When i input "d"
    When i input "e"
    When i input "l"
    When i input "c"
    When i input "a"
    When i input "s"
    When i input "v"
    Then the result of game should be false
    Then the remaining attempts are 0


  Scenario: Test 4
    Given I started the game with world "dog"
    When i input "d"
    When i input "e"
    When i input "l"
    When i input "c"
    When i input "a"
    When i input "s"
    When i input "o"
    When i input "g"
    Then the result of game should be true
    Then the remaining attempts are 1


  Scenario: Test 5
    Given I started the game with world "far"
    When i input "f"
    When i input "a"
    Then the current progress are "fa-"
    When i input "r"
    Then the result of game should be true
