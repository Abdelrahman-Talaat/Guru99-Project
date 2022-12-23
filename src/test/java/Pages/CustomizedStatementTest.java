package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CustomizedStatementTest extends BaseTest {
    @Test
    public void CustomizedStatement(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var customizedStatementPage=homePage.clickCustomizedStatement();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        customizedStatementPage.setAccountNo("123");
        customizedStatementPage.setFromDate("12122013");
        customizedStatementPage.setToDate("12122014");
        customizedStatementPage.setMinTrsansactionsValue("3");
        customizedStatementPage.setNoOfTransactions("2");
        customizedStatementPage.clickSubmitButton();
        assertEquals(customizedStatementPage.getPopUpMessage(),"Account does not exist");

    }
}
