package models

class OldBlankAdapter(
    private val _oldBlank: OldBlank,
) : IBlank {

    override fun getText(): String = "${_oldBlank.getOldText()} (распознано адаптером: ${this.javaClass.simpleName})"
}