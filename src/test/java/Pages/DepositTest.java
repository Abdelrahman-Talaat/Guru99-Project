package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DepositTest extends BaseTest {
    @Test
    public void Deposit(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var depositPage=homePage.clickDeposit();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        depositPage.enterAccNo("123");
        depositPage.enterAmount("500");
        depositPage.enterDescription("cash");
        depositPage.clickSubmitButton();
        assertEquals(depositPage.getMessage(),"Account does not exist");

    }
}
