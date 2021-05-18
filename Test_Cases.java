package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;




public class Test_Cases {
	
	public static String browser="chrome"; //External Configuration -XLS, CSV
	public static WebDriver driver;

	public static void main(String[] args) throws IOExcpetion {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver(); //launch Chrome
		driver.get("http:www.google.com);
                Thread.sleep(2000); //static wait
		driver.manage().window().maximize();// maximize the window
		driver.manage().deleteAllCookies(); //delete all the cookies
		driver.manage().timeouts().pageloadTimeout(40,TimeUnit,SECONDS); //dynamic wait
		driver.manage.timeouts().implicitlyWait(30,TimeUnit,SECONDS);    //implict wait specially for each elements presesnt on web browser.
		
		//For cross platforms
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromeDriver().setup();
			driver = new ChromeDriver();
		
		}
		else if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxDriver().setup();
			driver = new FireFoxDriver();
		
		}
		else if(browser.equals("Edge"))
		{
			WebDriverManager.edgeDriver().setup();
			driver = new EdgeDriver();
		}
		
		
		//1.Account Creation, since account has been created, jump to the signIn section.
		
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fb%3Fie%3DUTF8%26node%3D17369456031%26ref_%3Dnav_custrec_signin&prevRID=SRAY45QJGTEHPJQHQFJJ&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
                String title= driver.getTitle(); //get title
                System.out.println(title);
                
		//Validation Point	   
	        if(title.equals("Amazon");
		    {
			    System.out.println("Correct Title");
		    }
	        else
		    {
			    System.out.println("InCorrect Title");
		    }
                Thread.sleep(2000);
		
		//registration page	   
	        driver.findElement(By.id("ap_customer_name")).sendKeys("Pooja Bharti");
                driver.findElement(By.id("ap_phone_number")).sendKeys("72959*****");
                driver.findElement(By.id("ap_email")).sendKeys("poojabharti*****@gmail.com");
                driver.findElement(By.id("ap_password")).sendKeys("POOJA@***");
                driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.manage().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,Timeout.SECONDS);

		//2. sighIn page
		
                driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fext_vrnc%3Dhi%26tag%3Dgooghydrabk-21%26ascsubtag%3D_k_Cj0KCQjw4ImEBhDFARIsAGOTMj81LCQikfAPwOmMpKGGty3Li22l-8wLnxvlvpxoUNe4Mn-TYffJTcMaAvZQEALw_wcB_k_%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjw4ImEBhDFARIsAGOTMj81LCQikfAPwOmMpKGGty3Li22l-8wLnxvlvpxoUNe4Mn-TYffJTcMaAvZQEALw_wcB%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
                driver.findElement(By.id("ap_email")).sendKeys("poojabharti*****@gmail.com");
                driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
                driver.findElement(By.id("ap_password")).sendKeys("POOJA@****");
                driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		   
		//Validations using JUnit
		  

			public class Contact {
			    private String firstName;
			    private String lastName;
			    private String phoneNumber;
			    private String email_id;

			    public Contact(String firstName, String lastName, String phoneNumber) {
				this.firstName = firstName;
				this.lastName = lastName;
				this.phoneNumber = phoneNumber;
				this.email_id = email_id;

			    }

			    public String getFirstName() {
				return firstName;
			    }

			    public String getLastName() {
				return lastName;
			    }

			    public void validateFirstName() {
				if (this.firstName.isBlank())
				    throw new RuntimeException("First Name Cannot be null or empty");
			    }

			    public void validateLastName() {
				if (this.lastName.isBlank())
				    throw new RuntimeException("Last Name Cannot be null or empty");
			    }

			    public void validateEmailId() {
			    if(this.email_id.isBlank())
				throw new RuntimeException("EmailId cannot be null");
			    }

			    public void validatePhoneNumber() {
				if (this.phoneNumber.isBlank()) {
				    throw new RuntimeException("Phone Name Cannot be null or empty");
				}

				if (this.phoneNumber.length() != 10) {
				    throw new RuntimeException("Phone Number Should be 10 Digits Long");
				}
				if (!this.phoneNumber.matches("\\d+")) {
				    throw new RuntimeException("Phone Number Contain only digits");
				}
				if (!this.phoneNumber.startsWith("0")) {
				    throw new RuntimeException("Phone Number Should Start with 0");

				}
			    }
			}
		   
	        public class ContactManager
		   {

			Map<String, Contact> contactList = new ConcurrentHashMap<String, Contact>();

			public void addContact(String firstName, String lastName, String phoneNumber) {
			Contact contact = new Contact(firstName, lastName, phoneNumber);
			validateContact(contact);
			checkIfContactAlreadyExist(contact);
		 	contactList.put(generateKey(contact), contact);
                   }

		    public Collection<Contact> getAllContacts() {
			return contactList.values();
		    }

		    private void checkIfContactAlreadyExist(Contact contact) {
			if (contactList.containsKey(generateKey(contact)))
			    throw new RuntimeException("Contact Already Exists");
		    }
		       contact.validateFirstName();
			contact.validateLastName();
			contact.validatePhoneNumber();
		    }

		    private String generateKey(Contact contact) {
			return String.format("%s-%s", contact.getFirstName(), contact.getLastName());
		    }
		}
		  
		public class ContactManagerTest {

		    private ContactManager contactManager;

		    @BeforeEach
		    public void setup() {
			contactManager = new ContactManager();
		    }

		    @Test
		    @DisplayName("Should Create Contact")
		    public void shouldCreateContact() {
			contactManager.addContact("Pooja", "Bharti", "79039*****");
			assertFalse(contactManager.getAllContacts().isEmpty());
		    }

		    @Test
		    @DisplayName("Should Not Create Contact When First Name is Null")
		    public void shouldNotCreateContactWhenFirstNameIsNull() {
			assertThrows(RuntimeException.class,
				() -> contactManager.addContact(null,
					"Bharti",
					"790*******"));
		    }

		    @Test
		    @DisplayName("Should Not Create Contact When Last Name is Null")
		    public void shouldNotCreateContactWhenLastNameIsNull() {
			assertThrows(RuntimeException.class,
				() -> contactManager.addContact("Pooja",
					null,
					"79039*****"));
		    }

		    @Test
		    @DisplayName("Should Not Create Contact When Phone Number is Null")
		    public void shouldNotCreateContactWhenPhoneNumberIsNull() {
			ContactManager contactManager = new ContactManager();
			assertThrows(RuntimeException.class,
				() -> contactManager.addContact("Pooja",
					"Bharti",
					null));
		    }
		}
        
               //3. For Search
                act.moveToElement(mainmenu).build().perform();//taking mouse
                driver.findElement(By.className("nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown"));
		
	        WebElement mobiles = driver.findElement(By.xpath("//*[@id='menu-electronics-tab-0-content']/ul[1]/li[1]/a"));
                mobiles.click();//clicking on mobiles
	
                //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
                //driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
	        Actions act = new Actions(driver);
		List<WebElement> brands = driver.findElements(By.xpath("//div[@id='list-tagcloud']/div[2]/a"));
                System.out.println(brands.size());
                for(int i=0;i<brands.size();i++)
		{
                	System.out.println(brands.get(i).getText());//fetching all the brands
                	if(brands.get(i).getText().equals("iPhone"))//matching for iphone only
                  	 {
                        	brands.get(i).click();//clicking phone Iphone
                  	 }
               		 brands = driver.findElements(By.xpath("//div[@id='list-tagcloud']/div[2]/a"));//for cache
                }
                driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
                driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@id='searchbox']/li[2]/form/input[4]")); //absolute Xpath
                searchbox.sendKeys("New Apple iPhone 11(128 GB)");//in search box search for iPhone 11
                driver.findElement(By.xpath("//*[@id='searchbox']/li[2]/form/input[5]")).click(); //clicking on search icon
 
                List<String> allLinks = new ArrayList<String>();  //Creates a List of type string, and the list can be potentially typecast into any other type of list
                List<WebElement> data = driver.findElements(By.xpath("//div[@id='products']/div/div/div/div[2]/div[@class='pu-title fk-font-13']/a"));
                System.out.println("total fonds are =="+data.size());//total searches coming on the page
		
               for(int i=0;i<data.size();i++)
	       {
               		System.out.println(data.get(i).getText());//printing all iPhone phones
              		if(data.get(i).getText().contains("New Apple iPhone 11(128 GB)"))//search for iphone11 only
              			 {
               				String link = data.get(i).getAttribute("href");//fetching all the links
               				allLinks.add(link);//adding them to list
             		         }
              		data = driver.findElements(By.xpath("//div[@id='products']/div/div/div/div[2]/div[@class='pu-title fk-font-13']/a"));// for cache
               }
			   
	      //total iphone phones
              System.out.println(allLinks.size());
              for(int i=0;i<allLinks.size();i++)
	      {
                       System.out.println(allLinks.get(i));
                       driver.get(allLinks.get(i));
                       driver.findElement(By.xpath("//*[@id='mplistings']/div/div/div[1]/div[3]/a")).click();//click on view sellers
                       List<WebElement> retails = driver.findElements(By.xpath("//div[@class='cart-table']/div[starts-with(@class,'line seller-item')]/div[4]/a"));//fetching info
                       System.out.println(retails.size());
             for(int j=0;j<retails.size();j++)
               {
    
                       System.out.println(retails.get(j).getText());  //printing all the sellers info
   
               }
  
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sAddToCart))).click(); //add to cart
   
	       getElement(By.xpath(sViewCartXPath)).click();
	       getElement(By.cssSelector("form[id='view-cart-form'] button")).click();
	       getElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("poojabharti*****gmail.com");

  
                driver.close();
		driver.quit();
        
	}

}
