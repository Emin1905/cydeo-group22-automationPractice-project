package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginFunctionalityPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class LogoutFunctionalityStepDefinitions {

    LoginFunctionalityPage loginFunctionalityPage = new LoginFunctionalityPage();
    HomePage homePage = new HomePage();
    Actions actions = new Actions( Driver.getDriver() );

    @When("user is on the homepage")
    public void user_is_on_the_homepage() {

        String expectedTitle = "Congratulations, your inbox is empty";
        String actualTitle = homePage.titleDisplayed.getText();

        Assert.assertEquals(expectedTitle, actualTitle);

    }
    @When("user clicks on his own username at the top right corner")
    public void user_clicks_on_his_own_username_at_the_top_right_corner() {

        BrowserUtils.sleep(1);
        homePage.usernameDisplay.click();

    }
    @When("user clicks on logout button")
    public void user_clicks_on_logout_button() {

        BrowserUtils.sleep(1);
        homePage.logOutButton.click();

    }






    @Then("user clicks the go back button")
    public void user_clicks_the_go_back_button() {

        BrowserUtils.sleep(3);
        Driver.getDriver().navigate().back();

    }
    @Then("user stays on the login page")
    public void user_stays_on_the_login_page() {

        String expectedTitle = "Login | Best solution for startups";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

}
