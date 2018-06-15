import org.openqa.selenium.chrome.ChromeDriver


waiting {
		timeout = 60
	}
	System.setProperty('webdriver.chrome.driver','C:/Users/sairam/Downloads/chromedriver_win32/chromedriver.exe')
	//System.setProperty('geb.driver', 'chrome')
	driver = { new ChromeDriver() }
environments {
		chrome {
			def chromeDriver = new File('C:/Users/sairam/Downloads/chromedriver_win32/chromedriver.exe') 
			System.setProperty('webdriver.chrome.driver', chromeDriver.absolutePath)
			driver = { new ChromeDriver() }
		}
}

