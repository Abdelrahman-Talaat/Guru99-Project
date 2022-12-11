package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddCustomerTest extends BaseTest {
    @Test
    public void AddCustomerTest(){
        loginPage.setUserName("mngr455793");
        loginPage.setPassword("123457@");
        var homePage=loginPage.clickLoginButton();
        var addCustomerPage=homePage.clickAddNewCustomer();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        addCustomerPage.setCustomerName("Virendra");
        addCustomerPage.selectMaleGender();
         addCustomerPage.setDate("12122013");
     /*   driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("12122013");*/
        addCustomerPage.setAddress("Jamnagar");
        addCustomerPage.setCity("Jamnagar");
        addCustomerPage.setState("Gujarat");
        addCustomerPage.setPIN("567321");
        addCustomerPage.setTelephone("8000439024");
        addCustomerPage.setEmail("Virendra@gmail.com");
        addCustomerPage.setPassword("67902");
        addCustomerPage.clickSubmit();
      assertEquals(addCustomerPage.switchToAlert(),"Email Address Already Exist !!");
      addCustomerPage.acceptAlert();

    }
}
