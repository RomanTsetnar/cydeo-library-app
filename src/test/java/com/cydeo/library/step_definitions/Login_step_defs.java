package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.pages.LogIn_page;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_step_defs {
    LogIn_page logInPage = new LogIn_page();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        /**
         * our log in method has this url built in already
         * skip this step
         */
    }

    @When("user enters librarian username and password")
    public void userEntersLibrarianUsernameAndPassword() {
        logInPage.LogIn(ConfigurationReader.getProperties("username.librarian1"), ConfigurationReader.getProperties("password.librariran1"));
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(logInPage.dashBoard.isDisplayed());

    }


    @When("user enters student username and user enters student password")
    public void userEntersStudentUsernameAndUserEntersStudentPassword() {
        logInPage.LogIn(ConfigurationReader.getProperties("username.student1"), ConfigurationReader.getProperties("password.student1"));


    }

    @Given("user enters librarian {string} and {string}")
    public void userEntersLibrarianAnd(String userName, String password) {
        logInPage.LogIn(userName,password);

    }

    @Given("user enters student {string} and user enters student {string}")
    public void userEntersStudentAndUserEntersStudent(String username, String password) {
        logInPage.LogIn(username,password);


    }


    @Then("student should see Book management header is displayed.")
    public void studentShouldSeeBookManagementHeaderIsDisplayed() {
        Assert.assertTrue(logInPage.BookManagementHeader.isDisplayed());
    }
}
