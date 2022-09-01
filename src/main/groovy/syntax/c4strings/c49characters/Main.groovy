package syntax.c4strings.c49characters

static void main(String[] args) {
    char c1 = 'A'
    assert c1 instanceof Character

    def c2 = 'B' as char
    assert c2 instanceof Character

    def c3 = (char) 'C'
    assert c3 instanceof Character
}
