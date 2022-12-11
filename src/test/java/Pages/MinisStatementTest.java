package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinisStatementTest extends BaseTest {
    @Test
    public void MiniStatementTest(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var miniStatementPage=homePage.clickMiniStatement();
        miniStatementPage.setAccountNumber("123");
        miniStatementPage.clickSubmitButton();
        assertEquals(miniStatementPage.getPopUpMessage(),"Account does not exist");
        miniStatementPage.acceptAlert();
        assertEquals(miniStatementPage.getRedirectedToPageMessage(),"Mini Statement Form");

    }
}
