package com.evozon.steps;

import com.evozon.pages.DashboardPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.LoginPage;
import com.evozon.util.Constants;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @Step
    public void navigateToLoginPage(){
        homePage.open();
        homePage.clickMyAccount();
        homePage.clickLogInLink();
    }

    @Step
    public void loginWithCredentials(String email,  String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyLoggedIn(String value){
        Assert.assertTrue(dashboardPage.isWelcomeMessage(value));
    }

    @Step
    public void doLogin(String user, String pass){
        navigateToLoginPage();
        loginWithCredentials(user,pass);
    }

    @Step
    public void doLogin(){
        navigateToLoginPage();
        loginWithCredentials(Constants.USER_EMAIL,Constants.USER_PASS);
    }
}
