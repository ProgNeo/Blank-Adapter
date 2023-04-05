package models

class NewBlank(
    private val _text: String,
) : IBlank {

    override fun getText(): String = _text
}