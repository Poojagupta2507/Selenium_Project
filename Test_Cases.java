 package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Cases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		
		//1.create account, since account has been created, jump to the signIn section.
		
		//driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fb%3Fie%3DUTF8%26node%3D17369456031%26ref_%3Dnav_custrec_signin&prevRID=SRAY45QJGTEHPJQHQFJJ&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        //driver.findElement(By.id("ap_customer_name")).sendKeys("Pooja Bharti");
        //driver.findElement(By.id("ap_phone_number")).sendKeys("7295958735");
        //driver.findElement(By.id("ap_email")).sendKeys("poojabhartirocks@gmail.com");
        //driver.findElement(By.id("ap_password")).sendKeys("POOJA@123");
        //driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		//2. sighIn
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fext_vrnc%3Dhi%26tag%3Dgooghydrabk-21%26ascsubtag%3D_k_Cj0KCQjw4ImEBhDFARIsAGOTMj81LCQikfAPwOmMpKGGty3Li22l-8wLnxvlvpxoUNe4Mn-TYffJTcMaAvZQEALw_wcB_k_%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjw4ImEBhDFARIsAGOTMj81LCQikfAPwOmMpKGGty3Li22l-8wLnxvlvpxoUNe4Mn-TYffJTcMaAvZQEALw_wcB%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        driver.findElement(By.id("ap_email")).sendKeys("poojabhartirocks@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.id("ap_password")).sendKeys("POOJA@1234");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        
        //3. For Search
        
        //driver.findElement(By.className("nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown"));
        
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        
        
        
        
	}

}
