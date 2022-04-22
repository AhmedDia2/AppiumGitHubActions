Feature: Create New Task
  Scenario Outline: The user can add new task
    Given Click add new tasks
    Given Enter "<TaskName>" and "<TaskDesc>"
    Then Task is added successfully

    Examples:
    | TaskName | TaskDesc |
    | cucumber task1 | Task desc 1|
    | cucumber task 2 |Task desc 2|