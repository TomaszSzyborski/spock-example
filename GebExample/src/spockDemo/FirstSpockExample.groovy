package spockDemo

import spock.lang.Specification;

class FirstSpockExample extends Specification {
	
	def "lets see the detail information"()
	{
		def valueToCompare = 4
		expect:
		Math.max(2,3) == valueToCompare
		
	}

}
