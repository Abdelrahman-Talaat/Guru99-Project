package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeleteAccountTest extends BaseTest {
    @Test
    public void deleteAccountTest(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var deleteAccountPage=homePage.clickDeleteAccount();
        deleteAccountPage.setAccountNumber("12345");
        deleteAccountPage.clickSubmitButton();
        assertEquals(deleteAccountPage.getPopUpMessage(),"Do you really want to delete this Account?");
        deleteAccountPage.acceptAlert();
        assertEquals(deleteAccountPage.getAlertAcceptionMessage(),"Account does not exist");
        deleteAccountPage.acceptAlert();

    }
}
