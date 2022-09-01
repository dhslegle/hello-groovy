package syntax.c5numbers.c51integral_literals

static void main(String[] args) {
    // primitive types
    byte bb = 1
    char cc = 2
    short ss = 3
    int ii = 4
    long ll = 5

    // infinite precision
    BigInteger bi = 6


    def a = 1
    assert a instanceof Integer

    // Integer.MAX_VALUE
    def b = 2147483647
    assert b instanceof Integer

    // Integer.MAX_VALUE + 1
    def c = 2147483648
    assert c instanceof Long

    // Long.MAX_VALUE
    def d = 9223372036854775807
    assert d instanceof Long

    // Long.MAX_VALUE + 1
    def e = 9223372036854775808
    assert e instanceof BigInteger


    def na = -1
    assert na instanceof Integer

    // Integer.MIN_VALUE
    def nb = -2147483648
    assert nb instanceof Integer

    // Integer.MIN_VALUE - 1
    def nc = -2147483649
    assert nc instanceof Long

    // Long.MIN_VALUE
    def nd = -9223372036854775808
    assert nd instanceof Long

    // Long.MIN_VALUE - 1
    def ne = -9223372036854775809
    assert ne instanceof BigInteger
}
