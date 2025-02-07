# Unexpected removeIf Behavior with Kotlin Maps

This repository demonstrates a subtle but important difference in how `removeIf` behaves with different Kotlin collections. While intuitive with `List` and `Set`, its use with `Map` can lead to unexpected results. 

The `bug.kt` file shows the unexpected behavior. The `bugSolution.kt` file offers a solution and explanation.

## How to Run

1. Clone this repository.
2. Open the project in your Kotlin IDE.
3. Run `bug.kt` to observe the unexpected behavior.
4. Run `bugSolution.kt` to see how to avoid this issue.

This issue highlights the need for careful consideration when using `removeIf` with `Map` in Kotlin due to the nature of key-value pairs and the potential for modification implications.