import models.NewBlank
import models.OldBlank
import models.OldBlankAdapter
import models.TextRecognizer
import utils.readNumberInRange

fun main() {
    val newBlank = NewBlank("Текст на новом бланке")
    val oldBlank = OldBlankAdapter(OldBlank("Текст на старом бланке"))

    val recognizer = TextRecognizer()

    println("Выберите тип бланка")
    println("1. Бланк со старой формой: ")
    println("2. Бланк с новой формой: ")

    while (true) {
        when (readNumberInRange(1, 2)) {
            1 -> println(recognizer.recognizeText(oldBlank))
            2 -> println(recognizer.recognizeText(newBlank))
        }
    }
}