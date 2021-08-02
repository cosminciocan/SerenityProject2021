package com.evozon.features;

import com.evozon.steps.LoginSteps;
import com.evozon.util.Constants;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginTestWithValidUsername(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.verifyLoggedIn(Constants.USER_NAME);
    }
}
