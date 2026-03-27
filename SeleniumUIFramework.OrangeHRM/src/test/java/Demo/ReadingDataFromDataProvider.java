package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
@DataProvider(name="SampleData")
public Object[][]getdata(){
	return new Object[][] {
		{"Browser","Chrome"},
		{"username","password"},
		{"Admin","admin123"},
	};
	
}
@DataProvider(name="SampleData-1")
public Object[][]getInfo(){
	return new Object[][] {
		{"Browser","firefox","1"},
		{"username","user","2"},
		{"password","user123","3"},
	};
	
}

@Test(dataProvider= "SampleData-1")
public void readingFromDataProvider(String key,String value,String data) {
	System.out.println("My key is: " + key + "==========>>>>>> My Value is:  " + value + "My data is: ====>>> "+data);
}

}
