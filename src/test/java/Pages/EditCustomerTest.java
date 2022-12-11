package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EditCustomerTest extends BaseTest {
    @Test
    public void EditCustoemr(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var editCustomerPage=homePage.clickEditCustomer();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        editCustomerPage.setSetCustomerId("123");
        editCustomerPage.clickSubmitButton();
        assertEquals(editCustomerPage.getPopUpMessage(),"Customer does not exist!!");
        editCustomerPage.acceptAlert();
        assertEquals(editCustomerPage.redirectedToEditPage(),"Edit Customer Form");

    }
}
