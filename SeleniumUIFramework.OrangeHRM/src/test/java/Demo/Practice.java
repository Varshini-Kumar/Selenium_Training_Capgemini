package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice {
@Test
public void readData () throws IOException {
	FileInputStream file = new FileInputStream("./src/test/resources/OrangeHrm_Common_Data/common_data_properties.properties");
	Properties prop = new Properties();
	prop.load(file);
String URL = prop.getProperty("url");
String Browser = prop.getProperty("browser");
String ValidUserName = prop.getProperty("username");
String ValidPassword = prop.getProperty("password");
System.out.println("The default browser for testing is: " + Browser);
System.out.println("The URL of the application for testing is: " + URL);
System.out.println("The valid username is: " + ValidUserName);
System.out.println("The valid password is :" + ValidPassword);
FileOutputStream fos = new FileOutputStream("./src/test/resources/OrangeHrm_Common_Data/write.properties");
prop.setProperty("CandidateName", "Thomas");
prop.store(fos,null);
}
}
