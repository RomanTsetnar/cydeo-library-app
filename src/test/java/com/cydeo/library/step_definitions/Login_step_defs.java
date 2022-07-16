package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.pages.LogIn_page;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_step_defs {
    LogIn_page logInPage = new LogIn_page();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
    }

    @When("user enters librarian username and password")
    public void userEntersLibrarianUsernameAndPassword() {
        logInPage.LogIn(ConfigurationReader.getProperties("username.librarian1"), ConfigurationReader.getProperties("password.librariran1"));
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String expectedTitle = "Login - Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("dashboard verification failed", expectedTitle, actualTitle);


    }


    @When("user enters student username and user enters student password")
    public void userEntersStudentUsernameAndUserEntersStudentPassword() {
        logInPage.LogIn(ConfigurationReader.getProperties("username.student1"), ConfigurationReader.getProperties("password.student1"));
        String expectedTitle = "Login - Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("dashboard verification failed", expectedTitle, actualTitle);

    }

    @When("user enters student username")
        public void user_enters_student_username() {
    }
    @When("user enters student password")
        public void user_enters_student_password() {

        }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {

    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String password) {
        logInPage.LogIn(username,password);
    }

    @Then("dashboard should be displayed")
    public void dashboardShouldBeDisplayed() {
        String expectedURL ="dashboard";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expectedURL));

        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("dashboard is not appear on URL",actualURL.contains(expectedURL));



    }

    @And("there should be {int} users")
    public void thereShouldBeUsers(int user) {
        String expectedUser= ""+user;
        String actual = logInPage.userCount.getText();

        Assert.assertEquals("Number of users is not matching", expectedUser,actual);

    }
}

