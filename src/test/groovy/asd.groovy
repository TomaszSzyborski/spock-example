import spock.lang.Specification

class asd extends Specification {

    def "maximum of two numbers"() {
        expect:
            Math.max(a, b) == c

        where:
            a = 2
            b = 3
            c = 3

    }

    def "failing - maximum of two numbers"() {
        expect:
        Math.max(2, 3) == 4
    }
}