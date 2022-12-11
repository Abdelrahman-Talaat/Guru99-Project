package Pages;

import BaseTest.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChangePasswordTest extends BaseTest {
   @Test(dataProvider = "inputData")
    public void ChangePasswordTest(String oldPassword,String newPassword,String confirmPassword){
       loginPage.setUserName("mngr455793");
       loginPage.setPassword(oldPassword);
       String popUpMessage="Password is Changed"  ;
        var homepage=loginPage.clickLoginButton();
       var changePasswordPage=homepage.clickChangePassword();
       changePasswordPage.enterOldPassword(oldPassword);
       changePasswordPage.enterNewPassword(newPassword);
       changePasswordPage.enterConfirmPassword(confirmPassword);
       changePasswordPage.clickSubmit();
       assertEquals(changePasswordPage.getPopUpMessage(),popUpMessage);
           changePasswordPage.acceptAlert();
           loginPage.setUserName("mngr455793");
       loginPage.setPassword(newPassword);
       var homepage2=loginPage.clickLoginButton();
      assertEquals(homepage2.getWelcomeMessage(),"Welcome To Manager's Page of Guru99 Bank");


      /* changePasswordPage.acceptAlert();*/

   }
   @DataProvider (name ="inputData")
    public Object[][] inputData(){
       Object[][] data=new Object[1][3];
       data[0][0]="123457@";data[0][1]="123457@";data[0][2]="123457@";
       return data;
   }
}
