package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WithdrawalTest extends BaseTest {
    @Test
    public void WithdrawalTest(){
     loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
    var homePage=loginPage.clickLoginButton();
    var withdrawalPage=homePage.clickWithdrawal();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        withdrawalPage.enterAccNo("132");
    withdrawalPage.enterAmount("500");
    withdrawalPage.enterDescription("cash");
    withdrawalPage.clickSubmitButton();
    assertEquals(withdrawalPage.getPopUpMessage(),"Account does not exist");


}}
