package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	
	@Test(dataProvider ="getData" )
	public void loginTest(String username,String password) {
	
	System.out.println("user got successfully loged in using username: "+username+" and password: "+password);
	}
		
		
		@DataProvider
	//public void getData() {
		public Object[][] getData() {
	
	Object[][] data = new Object[3][2];
		
		data[0][0]="rafiq";
		data[0][1]="1234";
		
		data[1][0]="babu";
		data[1][1]="1111";
		
		data[2][0]="Karim";
		data[2][1]="8888";
		
		return data;
		
	}
	
	
	
	
	
}
