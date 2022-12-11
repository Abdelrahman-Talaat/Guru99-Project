package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BalanceInquiryTest extends BaseTest {
    @Test
    public void BalanceInquiryTest(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var balanceInquirypage=homePage.clickBalanceInquiry();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balanceInquirypage.setAccountNumber("123");
        balanceInquirypage.clickSubmitButton();
        assertEquals(balanceInquirypage.getPopUpMessage(),"Account does not exist");
        balanceInquirypage.acceptAlert();
        assertEquals(balanceInquirypage.getPageMessage(),"Balance Enquiry Form");
    }
}
