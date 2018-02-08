/**
 * @author saragarw
 * fetching properties of test env in class
 */
package propertiesFileExample;

import java.io.FileInputStream;
import java.util.Properties;

public class WorkingWithPropertiesFile {

	public static void main(String[] args) throws Throwable {
		FileInputStream inStream = new FileInputStream(".\\src\\propertiesFileExample\\GlobalVariable.properties");
		Properties prop = new Properties();
		prop.load(inStream);

		System.out.println(prop.getProperty("Browsertype"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("TestEnvi"));
	}

}
