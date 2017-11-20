package testData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestEnumDemo {

	 @DataProvider
	    public Object[][] dataP(){
	        TestEnum[] vs = TestEnum.values();
	        Object[][] obj = new Object[vs.length][];
	        for (int i = 0; i < vs.length; i++) {
	            obj[i] = new Object[]{vs[i]};
	        }
	        return obj;
	    }
	 @Test(dataProvider="dataP")  
	  public void testSearch2(){  
		 
	  }
}

