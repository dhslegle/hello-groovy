package syntax.c4strings.c46slashy_string

static void main(String[] args) {
    def fooPattern = /.*foo.*/
    assert fooPattern == '.*foo.*'

    def escapeSlash = /The character \/ is a forward slash/
    assert escapeSlash == 'The character / is a forward slash'

    def multilineSlash = /one
two
    three/
    assert multilineSlash.contains('\n')
    println multilineSlash

    def color = 'blue'
    def interpolatedSlash = /a ${color} car/

    assert interpolatedSlash == 'a blue car'

    def tab = /\t\//
    println tab
    assert tab == '\\t/'

    def slasg = /ends with slash ${'\\'}/
    println slasg
}
