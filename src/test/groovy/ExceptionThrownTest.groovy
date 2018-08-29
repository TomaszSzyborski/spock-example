import spock.lang.Specification

class ExceptionThrownTest extends Specification{
    def result

    void 'division by zero'() {
        when:
            result = 1/0
        then:
            ArithmeticException exception = thrown(ArithmeticException)
            exception.message == 'Division by zero'
    }
}
