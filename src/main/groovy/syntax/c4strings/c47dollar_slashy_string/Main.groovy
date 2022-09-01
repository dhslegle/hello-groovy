package syntax.c4strings.c47dollar_slashy_string

static void main(String[] args) {
    def name = "Guillaume"
    def date = "April, 1st"

    def dollarSlashy = $/
    Hello $name,
    today we're ${date}.

    $ dollar sign
    $$ escaped dollar sign
    \ backslash
    / forward slash
    $/ escaped forward slash
    $$$/ escaped opening dollar slashy
    $/$$ escaped closing dollar slashy
/$

    assert [
            'Guillaume',
            'April, 1st',
            '$ dollar sign',
            '$ escaped dollar sign',
            '\\ backslash',
            '/ forward slash',
            '/ escaped forward slash',
            '$/ escaped opening dollar slashy',
            '/$ escaped closing dollar slashy'
    ].every { dollarSlashy.contains(it) }
}
