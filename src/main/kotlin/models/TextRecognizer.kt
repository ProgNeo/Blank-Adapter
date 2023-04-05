package models

class TextRecognizer {

    fun recognizeText(blank: IBlank): String = blank.getText()
}