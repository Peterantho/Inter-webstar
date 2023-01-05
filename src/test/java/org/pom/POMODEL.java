package org.pom;



import org.lib.LibGobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMODEL extends LibGobal{
	
	public POMODEL() {
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="logins")
	private WebElement loginbutton;
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	
	}
	public void setupvalue (String username,String password) {
	//	POMODEL obj=new POMODEL();
		sendinput(getUsername(), username);
		sendinput(getPassword(), password);
		}
	
}
