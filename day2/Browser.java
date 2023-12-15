package week1.day2;

public class Browser  {
	String launchBrowser (String browserName) {
	System.out.println("Browser launched Successfully");
	return browserName ;
	
	}
    void loadUrl()
    {
    	System.out.println("Applcation Url loaded successfully");
    }
	public static void main(String[] args) {
		Browser browser = new Browser();
		String name = browser.launchBrowser("Chrome");
		System.out.println("Browser name :"+name);
		browser.loadUrl();
	}

	
}

