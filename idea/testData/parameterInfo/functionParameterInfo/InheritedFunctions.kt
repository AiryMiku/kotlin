open class A(x: Int) {
    fun m(x: Int) = 1
    fun m(x: Int, y: Boolean) = 2
}

class B(): A(5) {
    fun d(x: Int, y: Boolean, z: String) {
        m(1, <caret>false)
    }
}
/*
Text: (x: Int), Disabled: true, Strikeout: false, Green: false
Text: (x: Int, y: Boolean), Disabled: false, Strikeout: false, Green: true
*/