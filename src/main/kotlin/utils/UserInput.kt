package utils

fun readNumberInRange(min: Int, max: Int): Int {
    val number: Int?

    print(">>> ")
    val input = readlnOrNull()
    number = input?.toIntOrNull()

    number?.let {
        if (it in min..max) {
            return it
        } else {
            println("Неверный ввод")
            return readNumberInRange(min, max)
        }
    } ?: run {
        println("Неверный ввод")
        return readNumberInRange(min, max)
    }
}
