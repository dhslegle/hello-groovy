package syntax.c4strings.c44double_quoted_string.c442special_case_of_interpolating_closure_expressions

static void main(String[] args) {
    def sParameterLessClosure = "1 + 2 == ${-> 3}"
    assert sParameterLessClosure == '1 + 2 == 3'

    def sOneParamClosure = "1 + 2 == ${w -> w << 3}"
    assert sOneParamClosure == '1 + 2 == 3'

    def number = 1
    def eagerGString = "value == ${number}"
    def lazyGString = "value == ${-> number}"

    assert eagerGString == "value == 1"
    assert lazyGString == "value == 1"

    number = 2
    assert eagerGString == "value == 1"
    assert lazyGString == "value == 2"
}
