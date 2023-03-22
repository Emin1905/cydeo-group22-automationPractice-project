package com.cydeo.step_definitions;

import com.cydeo.pages.LoginFunctionalityPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginFunctionalityStepDefinitions {

    LoginFunctionalityPage loginFunctionalityPage = new LoginFunctionalityPage();


    @When("user go to the login page")
    public void user_go_to_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

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

    @Then("user should land on home page")
    public void userShouldLandOnHomePage() {

        Assert.assertTrue(loginFunctionalityPage.upgenixHomePageText.isDisplayed());

    }








    @When("user enters invalid {string} and {string}")
    public void user_enters_invalid_and(String invalidEmail, String invalidPassword) {

        loginFunctionalityPage.emailSearchBox.sendKeys(invalidEmail);

        loginFunctionalityPage.passwordSearchbox.sendKeys(invalidPassword);

    }

    @Then("user sees the Wrong login\\/password message displayed")
    public void user_sees_the_wrong_login_password_message_displayed() {

        Assert.assertTrue(loginFunctionalityPage.wrongLoginPasswordMessage.isDisplayed());

    }








    @When("user leaves username box empty")
    public void user_leaves_username_box_empty() {

        loginFunctionalityPage.emailSearchBox.sendKeys("");
        loginFunctionalityPage.passwordSearchbox.sendKeys("salesmanager");

    }
    @Then("user should see Please fill out this field text on the page")
    public void user_should_see_please_fill_out_this_field_text_on_the_page() {

        String validationMessage = loginFunctionalityPage.emailSearchBox.getAttribute("validationMessage");
        Assert.assertEquals(validationMessage, "Please fill in this field.");

    }

    @When("User leaves password box empty")
    public void user_leaves_password_box_empty() {

        loginFunctionalityPage.emailSearchBox.sendKeys("salesmanager26@info.com");
        loginFunctionalityPage.passwordSearchbox.sendKeys("");

    }

    @Then("user should see Please fill out this field text on the page2")
    public void user_should_see_please_fill_out_this_field_text_on_the_page2() {

        String validationMessage = loginFunctionalityPage.passwordSearchbox.getAttribute("validationMessage");
        Assert.assertEquals(validationMessage, "Please fill in this field.");

    }
















    @And("user enters password")
    public void userEntersPassword() {

        loginFunctionalityPage.passwordSearchbox.sendKeys("salesmanager");

    }

    @Then("user should see bullet signs by default")
    public void userShouldSeeBulletSignsByDefault() {

        Boolean isBulletSign = loginFunctionalityPage.passwordSearchbox.getAttribute("type").equals("password");
        Assert.assertEquals(isBulletSign, true);

    }



    @And("user enters email and password")
    public void userEntersEmailAndPassword() {

        loginFunctionalityPage.emailSearchBox.sendKeys("salesmanager26@info.com");
        BrowserUtils.sleep(1);
        loginFunctionalityPage.passwordSearchbox.sendKeys("salesmanager");

    }

    @Then("user checks if pressing enter does the same work as clicking the login button")
    public void user_checks_if_pressing_enter_does_the_same_work_as_clicking_the_login_button() {

        loginFunctionalityPage.passwordSearchbox.sendKeys(Keys.ENTER);


    }


}
