package syntax.c4strings.c43triple_single_quoted_string

static void main(String[] args) {
    def aMultilineString = '''line one
line two
line three'''
    println aMultilineString

    def startingAndEndingWithANewline = '''
line one
line two
line three
'''
    println startingAndEndingWithANewline

    def strippedFirstNewline = '''\
line one
line two
line three
'''
    println strippedFirstNewline

    assert !strippedFirstNewline.startsWith('\n')
}
