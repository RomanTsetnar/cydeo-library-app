package com.cydeo.library.pages;

import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void LogIn (String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperties("library.url"));
        WebElement userNameInputBox = Driver.getDriver().findElement(By.id("inputEmail"));
        userNameInputBox.sendKeys(username);
        WebElement passwordInputBox = Driver.getDriver().findElement(By.id("inputPassword"));
        passwordInputBox.sendKeys(password);
        WebElement signInBtn = Driver.getDriver().findElement(By.xpath("//button[.='Sign in']"));
        signInBtn.click();
    }

    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksModule;

    @FindBy(xpath = "//span[.='Borrowing Books']")
    public WebElement borrowingBooksModule;

    @FindBy(id = "user_avatar")
    public WebElement userAvatar;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logOutBtn;

    @FindBy(id = "navbarDropdown")
    public WebElement userNameCredentialsInTheTopRightCornerWhenLoggedIn;

    @FindBy(xpath="//span[.='Users']")
    public WebElement usersLink;
}
