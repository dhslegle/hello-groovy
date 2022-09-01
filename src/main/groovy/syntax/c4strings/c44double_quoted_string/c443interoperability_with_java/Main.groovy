package syntax.c4strings.c44double_quoted_string.c443interoperability_with_java

static String takeString(String message) {
    assert message instanceof String
    return message
}

static void main(String[] args) {

    def message = "The message is ${'hello'}"
    assert message instanceof GString
    println message

    def result = takeString(message)
    assert result instanceof String
    assert result == 'The message is hello'
    println result
}
