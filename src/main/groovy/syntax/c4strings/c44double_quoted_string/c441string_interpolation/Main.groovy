package syntax.c4strings.c44double_quoted_string.c441string_interpolation

static void main(String[] args) {
    def name = 'Guillaume' // a plain string
    def greeting = "Hello $name"

    assert greeting.toString() == 'Hello Guillaume'
    println greeting


    def sum = "The sum of 2 and 3 equals ${2 + 3}"
    assert sum.toString() == 'The sum of 2 and 3 equals 5'
    println sum

    def person = [name: 'Guillaume', age: 36]
    assert "$person.name is $person.age years old" == 'Guillaume is 36 years old'
    println "$person.name is $person.age years old"


    def h = new Human();
    h.run()
    def a = new Animal();
    a.run()
    def r = new Rock();
    try {
        r.run() // Compiles fine, fails at run time
    } catch (e) {
        println e.message
    }


    String thing = 'treasure'
    try {
        assert 'The x-coordinate of the treasure is represented by treasure.x' ==
                "The x-coordinate of the $thing is represented by $thing.x"   // <= Not allowed: ambiguous!!
        println "The x-coordinate of the $thing is represented by $thing.x"
    } catch (e) {
        println e.message
    }
    assert 'The x-coordinate of the treasure is represented by treasure.x' ==
            "The x-coordinate of the $thing is represented by ${thing}.x"  // <= Curly braces required
    println "The x-coordinate of the $thing is represented by ${thing}.x"
}

class Human {
    static def run() { println "Human running !" }
}

class Animal {
    static def run() { println "Animal running !" }
}

class Rock {

}

