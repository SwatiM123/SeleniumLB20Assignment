package com.training.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UNFPOM079 {
private WebDriver driver; 

	
	public UNFPOM079(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement username; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='text-right']/button")
	private WebElement loginBtn; 
	
	

//POM079	
	@FindBy(id="customer")
	private WebElement customer; 
	
	@FindBy(xpath="//*[@id='catalog']/ul/li[1]/a")
	private WebElement CategoriesLink;
	
	@FindBy(xpath="//*[@id='catalog']/a/i")
	private WebElement CategoriesClick;
		
//Add New Category
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a[1]")
	private WebElement AddNewCategory;

	@FindBy(xpath="//*[@id='input-name1']")
	private WebElement AddNewCategoryName;

	@FindBy(xpath="//*[@id='language1']/div[2]/div/div/div[3]/div[2]")
	private WebElement AddNewCategoryDescription;
	
	@FindBy(xpath="//*[@id='input-meta-title1']")
	private WebElement AddNewCategoryMetaTagTitle;
	
	@FindBy(xpath="//*[@id='input-meta-description1']")
	private WebElement AddNewCategoryMetaTagDescription;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement SaveAddNewCategory;	

	//Add New Product	
	@FindBy(xpath="//*[@id='catalog']/ul/li[2]/a")
	private WebElement ProductClick;	
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement AddNewProductBtn;	
	
	
	@FindBy(xpath="//*[@id='input-name1']")
	private WebElement AddNewProductName;	
	
	@FindBy(xpath="//*[@id='input-meta-title1']")
	private WebElement AddNewProductMetaTagTitle;	
	
	
	@FindBy(xpath="//*[@id='form-product']/ul/li[3]/a")
	private WebElement AddNewProductLinkTab;	
	
	@FindBy(xpath="//*[@id='input-category']")
	private WebElement AddNewProductCategory;	
	
	@FindBy(xpath="//*[@id='tab-links']/div[2]/div/ul")
	private WebElement AddNewProductCategoryList;	

	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement SaveNewProduct;	
	
	
	//LOGIN Screen
	public void sendUserName(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	
	public boolean LoginUser(String UserID, String Password){
	
		try {
			sendUserName(UserID);
			sendPassword(Password);
			clickLoginBtn();

			
			return true;
			
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println(ex.getMessage());
			return false;
		}
		
		
	}
	
	// Test in LogIn POM************************************

	
	
	
	public void CategoriesClick() {
		this.CategoriesClick.click();
		
	}
				public void CategoriesLink() {
					this.CategoriesLink.click();
					
				}
				
				public void AddNewCategory() {
					this.AddNewCategory.click(); 
					
				}
				
				public void AddNewCategoryName() {
					this.AddNewCategoryName.sendKeys("15"); 
				}
				
				public void AddNewCategoryDescription() {
					this.AddNewCategoryDescription.sendKeys("Sports"); 
				}
				
				public void AddNewCategoryMetaTagTitle() {
					this.AddNewCategoryMetaTagTitle.sendKeys("Sports"); 
				}
				public void AddNewCategoryMetaTagDescription() {
					this.AddNewCategoryMetaTagDescription.sendKeys("Sports"); 
				}
				
				public void SaveAddNewCategory() {
					this.SaveAddNewCategory.click();
					
				}
				public void ProductClick() {
					this.ProductClick.click();
					
				}
				
				public void AddNewProductBtn() {
					this.AddNewProductBtn.click();
					
				}
				
				public void AddNewProductName() {
					this.AddNewProductName.sendKeys("Shoe"); 
					
				}
								
				public void AddNewProductMetaTagTitle() {
					this.AddNewProductMetaTagTitle.sendKeys("Shoe");
					
				}
				
				public void AddNewProductLinkTab() {
					this.AddNewProductLinkTab.click();
					
				}
				
				public void AddNewProductCategory() {
					this.AddNewProductCategory.click();
					this.AddNewProductCategory.sendKeys("Sports");
				}
				
				public void AddNewProductCategoryList() {
					List<WebElement> options = driver.findElements(By.xpath("//*[@id='tab-links']/div[2]/div/ul"));
					for (WebElement option : options) {
					if("Blazers(3-5)".equals(option.getText()))
					option.click();
					}
				}
				
				public void SaveNewProduct() {
					this.SaveNewProduct.click();
					
				}
				
				
				
			public boolean UNF_079(){
					try {
						//add new category						
						JavascriptExecutor js = (JavascriptExecutor) driver;
						CategoriesClick();
						CategoriesLink();
						Thread.sleep(3000);
						AddNewCategory();
						Thread.sleep(1000);
						AddNewCategoryName();
						Thread.sleep(1000);
						AddNewCategoryDescription();
						Thread.sleep(1000);
						AddNewCategoryMetaTagTitle();
						Thread.sleep(1000);
						AddNewCategoryMetaTagDescription();
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,-1000)");
						SaveAddNewCategory();
//add new product
						Thread.sleep(3000);
						CategoriesClick();
						Thread.sleep(1000);
						ProductClick();
						Thread.sleep(1000);
						AddNewProductBtn();
						Thread.sleep(1000);
						AddNewProductName();
						Thread.sleep(1000);
						AddNewProductMetaTagTitle();
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,-1000)");
						Thread.sleep(1000);
						AddNewProductLinkTab();
						Thread.sleep(1000);
						AddNewProductCategory();
						Thread.sleep(1000);
						AddNewProductCategoryList();
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,-1000)");
						SaveNewProduct();
						Thread.sleep(1000);
						return true;
					} catch (Exception ex) {
						// TODO Auto-generated catch block
						System.out.println(ex.getMessage());
						return false;
					} 
					
				} 
	
	public WebDriver getDriver()
	{
		return driver;
	}
}
