# Unexpected Behavior of map() on MutableList in Kotlin

This repository demonstrates an uncommon but potentially confusing behavior in Kotlin when using the `map()` function on a `MutableList`.  The `map()` function creates a *new* list containing the transformed elements; it doesn't create a live, linked view of the original list.  Therefore, modifications to the original `MutableList` after the `map()` operation will not be reflected in the mapped list.

The `bug.kt` file shows this behavior.  The `bugSolution.kt` file offers a way to achieve dynamic updating, though it requires a different approach than simply using `map()`.

This is a subtle difference that can be easily overlooked, leading to unexpected behavior in applications where updates to the original list are expected to automatically update the transformed list.