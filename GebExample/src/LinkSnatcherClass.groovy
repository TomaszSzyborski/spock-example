import geb.Browser


Browser.drive {
	clearCookies()
	go("http://google.com")
	
	
	$("a.gb_P").each {
		println it.text()
		
		println "We are not able to recognize the text"
	}
}