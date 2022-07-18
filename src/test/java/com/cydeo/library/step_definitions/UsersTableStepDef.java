package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LogIn_page;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtilities;
import com.cydeo.library.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class UsersTableStepDef {

    UsersPage usersPage = new UsersPage();
    LogIn_page logInPage = new LogIn_page();

    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        logInPage.LogIn(ConfigurationReader.getProperties("username.librarian1"), ConfigurationReader.getProperties("password.librariran1"));

    }
    @Given("I click on {string} link")
    public void i_click_on_link(String link) {
      BrowserUtilities.waitForVisibilityOf(logInPage.dashBoard);

        switch(link.toLowerCase()){
            case "dashboard":
                 logInPage.dashBoard.click();
                 break;
            case "users":
                 usersPage.usersLink.click();
                 break;
            case "books":
                 logInPage.booksModule.click();
                break;


        }



    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedTableHeader) {
        BrowserUtilities.waitForVisibility(usersPage.usersLink, 10);
        List<String> actualTableHeader = BrowserUtilities.getElementsText(usersPage.usersTableHeader);
        Assert.assertEquals("Table header is not matching",expectedTableHeader,actualTableHeader);

    }

}
