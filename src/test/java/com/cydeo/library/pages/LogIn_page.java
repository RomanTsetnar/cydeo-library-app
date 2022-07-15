package com.cydeo.library.pages;

import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_page extends BasePage {
    @FindBy(xpath = "//div[@class='portlet-title']")
    public WebElement BookManagementHeader;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashBoard;

    @FindBy(id = "user_count")
    public WebElement numberOfUsers;


}
