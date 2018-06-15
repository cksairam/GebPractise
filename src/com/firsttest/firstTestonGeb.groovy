package com.firsttest

import geb.Browser
class firstTestonGeb {

	static main(args) {
		
		Browser.drive {
			
					go "http://google.com/"
										
				click($("input",name:"q").value("github"))
					//wait for the change to results page to happen
			click($("input",0,value:"Google Search"))
					//(google updates the page dynamically without a new request)
					waitFor{ title.endsWith("Google Search")}
					//is the first link to softwaretestinghelp.com?
					
					def firstLink = $("li.g").find("a.l")
					
					assert firstLink.text()=="Software Testing Help - A Must Visit Software Testing Portal"
				
			
					//click the link
			
					firstLink.click()
			
					//wait for Google's javascript
			
					waitFor { title =="Software Testing Help - A Must Visit Software Testing Portal"
						
					}
			
		}
		}
}
