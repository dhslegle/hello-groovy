package syntax.c4strings.c44double_quoted_string.c444_gstring_and_string_hashcodes

static void main(String[] args) {
    assert "one: ${1}".hashCode() != "one: 1".hashCode()
    def a = ""

    def key = "a"
    def string = "${key}"
    def m = [string: "letter ${key}"]

    assert m["a"] == null

    assert m[string] != null
}
