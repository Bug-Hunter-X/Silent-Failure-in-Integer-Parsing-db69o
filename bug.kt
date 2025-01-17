```kotlin
fun processData(input: String): String {
    val parts = input.split(',')
    if (parts.size != 2) {
        return "Invalid input"
    }

    val num1 = parts[0].toIntOrNull()
    val num2 = parts[1].toIntOrNull()

    return if (num1 != null && num2 != null) {
        (num1 + num2).toString()
    } else {
        "Invalid input"
    }
}
```