package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionalityPage {

   public LoginFunctionalityPage(){

       PageFactory.initElements(Driver.getDriver(), this);

   }

    //We can start locating web elements using @FindBy annotation
    @FindBy(id = "login")
    public WebElement emailSearchBox;


   @FindBy(id = "password")
    public WebElement passwordSearchbox;


   @FindBy(xpath = "//button[.='Log in']")
   public WebElement loginButton;


   @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginPasswordMessage;


   @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement upgenixHomePageText;

}
