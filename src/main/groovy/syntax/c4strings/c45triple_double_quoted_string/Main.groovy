package syntax.c4strings.c45triple_double_quoted_string

static void main(String[] args) {
    def name = 'Groovy'
    def template = """
    Dear Mr ${name},

    You're the winner of the lottery!

    Yours sincerly,

    Dave
"""

    assert template.toString().contains('Groovy')
}
