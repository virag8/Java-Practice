package programs;

class A {
	public static int i = 10;
	public int j = 20;

}

public class Inheritance {
	public static void main(String[] args) {
		A a = null;
		System.out.println(a.i);
		BaseConfiguration configuration = new BaseConfiguration();

		// What is the output?
		configuration.getBrowser(); // -- default
		configuration = new ChromeConfiguration();
		// What is the output?
		configuration.getBrowser(); // defaultchrome
		configuration = new FirefoxConfiguration();
		// What is the output?
		configuration.getBrowser(); // firefox
		// default
		// Inheritance.main(new String[] {});
	}

	static void main() {
		BaseConfiguration configuration = new BaseConfiguration();

		// What is the output?
		configuration.getBrowser(); // -- default
		configuration = new ChromeConfiguration();
		// What is the output?
		configuration.getBrowser(); // defaultchrome
		configuration = new FirefoxConfiguration();
		// What is the output?
		configuration.getBrowser(); // firefox
		// default
	}
}

class BaseConfiguration {
	protected String browser = "Default Browser";

	public void getBrowser() {
		System.out.println(browser);
	}
}

class ChromeConfiguration extends BaseConfiguration {
	public ChromeConfiguration() {
		browser += "Chrome Browser";
	}
}

class FirefoxConfiguration extends BaseConfiguration {
	@Override
	public void getBrowser() {
		browser = "Firefox Browser";
		super.getBrowser();
	}
}
