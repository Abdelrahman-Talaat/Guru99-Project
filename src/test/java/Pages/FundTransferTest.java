package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FundTransferTest extends BaseTest {
    @Test
    public void fundTransfer(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var fundTransferPage=homePage.clickFundTransfer();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        fundTransferPage.enterPayersAccNo("123");
        fundTransferPage.enterPayeesAccNo("124");
        fundTransferPage.enterAmount("600");
        fundTransferPage.enterDescription("cash");
        fundTransferPage.clickSubmitButton();
        assertEquals(fundTransferPage.getPopUpMessage(),"Account 123does not exist!!!");

    }
}
