Feature: cucumber Jvm should work with Scala 2.12

  Scenario Outline: Simple scenario works when run with Scala 2.12
    Given I have '<Initial Cukes>' cukes in the jar
    When I eat '<Eaten>' cukes
    Then There are '<Remaining>' cukes in the jar
    And I am <Fullness>

    Examples:
      | Initial Cukes | Eaten | Remaining | Fullness |
      | 6             | 2     | 4         | full     |
      | 4             | 1     | 3         | not full |
