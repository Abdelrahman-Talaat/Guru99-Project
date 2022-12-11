package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeleteCustomerTest extends BaseTest {
    @Test
    public void DeleteCustomer(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var deleteCustomerPage=homePage.clickDeleteCustomer();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        deleteCustomerPage.setCustomerId("123");
        deleteCustomerPage.clickSubmitButton();
        assertEquals(deleteCustomerPage.getPopUpMessage(),"Do you really want to delete this Customer?");
    }
}
