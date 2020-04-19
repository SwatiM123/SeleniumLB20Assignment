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


public class UNFPOM081 {
private WebDriver driver; 

	
	public UNFPOM081(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement username; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='text-right']/button")
	private WebElement loginBtn; 
	
	

//POM081	
	@FindBy(id="sale")
	private WebElement saleClick; 
	
	@FindBy(xpath="//*[@id='sale']/ul/li[3]/a")
	private WebElement salesRetrurnsClick;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/a")
	private WebElement AddProductReturn;
	
	@FindBy(xpath="//*[@id='input-order-id']")
	private WebElement AddOrderId;
	
	@FindBy(xpath="//*[@id='input-customer']")
	private WebElement AddCustomerName;

	
	@FindBy(xpath="//*[@id='input-firstname']")
	private WebElement AddFirstName;

	@FindBy(xpath="//*[@id='input-lastname']")
	private WebElement AddLastName;

	@FindBy(xpath="//*[@id='input-email']")
	private WebElement AddEmail;

	@FindBy(xpath="//*[@id='input-telephone']")
	private WebElement AddTelephone;

	@FindBy(xpath="//*[@id='input-product']")
	private WebElement AddProductText;

	@FindBy(xpath="//*[@id='input-model']")
	private WebElement AddModelText;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement SaveReturnProduct;
	
	@FindBy(xpath="//*[@id='form-return']/div/table/tbody/tr[1]/td[1]/input")
	private WebElement SelectReturnProduct;
	
	@FindBy(xpath="//*[@id='content']/div[1]/div/div/button")
	private WebElement DeleteReturnProduct;
	
	

	
	
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

	
	
	
	public void saleClick() {
		this.saleClick.click();
		
	}
				public void salesRetrurnsClick() {
					this.salesRetrurnsClick.click();
					
				}
				
				public void AddProductReturn() {
					this.AddProductReturn.click(); 
					
				}
				
				public void AddOrderId() {
					this.AddOrderId.sendKeys("34"); 
				}
				
				public void AddCustomerName() {
					this.AddCustomerName.sendKeys("Smriti"); 
				}
				
				public void AddFirstName() {
					this.AddFirstName.sendKeys("Smriti"); 
				}
				public void AddLastName() {
					this.AddLastName.sendKeys("Irani"); 
				}
				
				public void AddEmail() {
					this.AddEmail.sendKeys("smriti@gmail.com"); 
				}
				
				public void AddTelephone() {
					this.AddTelephone.sendKeys("9754356363"); 
				}
				
				public void AddProductText() {
					this.AddProductText.sendKeys("T shirt"); 
				}
				
				public void AddModelText() {
					this.AddModelText.sendKeys("SH-002"); 
				}
				
				
				public void SaveReturnProduct() {
					this.SaveReturnProduct.click();
					
				}
				
				public void SelectReturnProduct() {
					this.SelectReturnProduct.click();
					
				}
				
				public void DeleteReturnProduct() {
					this.DeleteReturnProduct.click();
					
				}
				
				
				
				
			public boolean UNF_081(){
					try {
						//add new category						
						JavascriptExecutor js = (JavascriptExecutor) driver;
						saleClick();
						Thread.sleep(1000);
						salesRetrurnsClick();
						Thread.sleep(1000);
						AddProductReturn();
						Thread.sleep(1000);
						AddOrderId();
						Thread.sleep(1000);
						AddCustomerName();
						Thread.sleep(1000);
						AddFirstName();
						Thread.sleep(1000);
						AddLastName();
						Thread.sleep(1000);
						AddEmail();
						Thread.sleep(1000);
						AddTelephone();
						Thread.sleep(1000);
						AddProductText();
						Thread.sleep(1000);
						AddModelText();
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,-1000)");
						Thread.sleep(1000);
						SaveReturnProduct();
						
//Delete Returned Product						
						Thread.sleep(1000);
						SelectReturnProduct();
						Thread.sleep(1000);
						js.executeScript("window.scrollBy(0,-1000)");
						Thread.sleep(1000);
						DeleteReturnProduct();
						Thread.sleep(1000);
						Alert alert_box = driver.switchTo().alert();
						alert_box.accept(); 
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
