package com.evozon.features;

import com.evozon.pages.BasePage;
import com.evozon.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class CartTest extends BasePage {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void checkValidPricesTest(){
        loginSteps.doLogin();
    }
}
