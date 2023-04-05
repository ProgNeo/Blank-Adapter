package utils

fun readNumberInRange(min: Int, max: Int): Int {
    val number: Int?

    print(">>> ")
    val input = readlnOrNull()
    number = input?.toIntOrNull()

    number?.let {
        return it
    } ?: run {
        println("Неверный ввод")
        return readNumberInRange(min, max)
    }
}