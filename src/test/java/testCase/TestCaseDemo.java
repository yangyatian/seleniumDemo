package testCase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import testData.FromExcel;

public class TestCaseDemo {
	
	private static WebDriver driver;
	
	 @BeforeMethod
	  public void beforeTest() {
		  driver = new ChromeDriver();
	  }
	 
	 @Test(dataProvider="searchData")  
	  public void testSearch(String searchdata1,String searchdata2,String searchResult) throws InterruptedException {  
		  driver.get("http://www.sogou.com/");  
	      driver.findElement(By.id("query")).sendKeys(searchdata1+" "+searchdata2);   
	      driver.findElement(By.id("stb")).click(); 
	      Thread.sleep(2000);
	      //断言搜索结果页面是否包含Excel中的预期结果  
	      Assert.assertTrue(driver.getPageSource().contains(searchResult)); 
	  }  

 
  @DataProvider(name="searchData")  
  public static Object[][] data() throws IOException  
  {  
	  FromExcel fromExcel = new FromExcel();
      return fromExcel.getSearchData("E:\\testdata\\","testCaseData.xlsx","sheetName");//获取Excel文件的测试数据  
  }

 

  @AfterMethod
  public void afterTest() {
	  driver.quit();
  }

}
