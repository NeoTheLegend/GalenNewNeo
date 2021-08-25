package galenbase;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.galenframework.api.Galen;
import com.galenframework.reports.model.LayoutReport;

import io.github.bonigarcia.wdm.WebDriverManager;

public class galenTestNgTestBase {
	

	
	private static final String baseURL = "https://www.google.com/";
	private WebDriver driver;
    private LayoutReport layoutReport;

    @BeforeClass
    public void init() {

    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        

    }
    

    
    
    
    
    @Test
    public void Logo() throws IOException {
    	
    	
    	
    	WebElement g = driver.findElement(By.className("lnXdpd"));
    	g.getSize();
    	System.out.println(g);
    	 LayoutReport layoutReport = Galen.checkLayout(driver,baseURL , Arrays.asList("desktop"));
    	
    	

    	

    }


	

}
