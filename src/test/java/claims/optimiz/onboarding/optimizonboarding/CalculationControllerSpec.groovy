package claims.optimiz.onboarding.optimizonboarding

import spock.lang.Specification

class CalculationControllerSpec extends Specification {

    def calculationService = new CalculationService()

    def "Sum test"() {
        given: "two integers 5 and 7"
        def x = 5
        def y = 7
        then: "summing up the integers"
        def sum = calculationService.sum(x, y)
        expect: "should sum up to 12"
        sum == 12
    }
}
