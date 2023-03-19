package com.cydeo.step_definitions;

import com.cydeo.pages.LoginFunctionalityPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginFunctionalityStepDefinitions {

    LoginFunctionalityPage loginFunctionalityPage = new LoginFunctionalityPage();


    @When("user go to the login page")
    public void user_go_to_the_login_page() {

        Driver.getDriver().get("https://qa.upgenix.net/web/login/");

    }
    @And("user is on the login page")
    public void user_is_on_the_login_page() {
        String expectedTitle = "Login";

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle) );
    }

    @Then("user should be able to type valid {string} and {string}")
    public void user_should_be_able_to_type_valid_and(String validEmail, String validPassword) {

       loginFunctionalityPage.emailSearchBox.sendKeys(validEmail);

       loginFunctionalityPage.passwordSearchbox.sendKeys(validPassword);
    }


    @Then("user should be able to click the login button")
    public void user_should_be_able_to_click_the_login_button() {

        loginFunctionalityPage.loginButton.click();

    }

}
