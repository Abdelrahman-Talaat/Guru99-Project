package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddAccountTest extends BaseTest {
    @Test
    public void AddAccountTest(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var addNewAccountPage=homePage.clickAddNewAccount();
        addNewAccountPage.setCustomerId("12345");
        addNewAccountPage.selectAccountType("Savings");
        addNewAccountPage.setInitialDeposit("500");
        addNewAccountPage.clickSubmitButton();
        assertEquals(addNewAccountPage.getAlertMessage(),"Customer does not exist!!");

    }
}
