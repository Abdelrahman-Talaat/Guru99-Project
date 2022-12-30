package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test(dataProvider ="validData" )
    public void validData(String userName, String password){
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        var homePage=loginPage.clickLoginButton();
        assertEquals(homePage.getWelcomeMessage(),"Welcome To Manager's Page of Guru99 Bank");
        assertEquals(homePage.getManagerId(),"Manger Id : "+userName);
        System.out.println("Valid Login Test");

    }
    @DataProvider(name = "validData")
    public Object[][] validInputdata(){
       Object[][]data=new Object[1][2];
       data[0][0]="mngr465178"; data[0][1]="rAsazev1";
       return data;
    }
    @Test(dataProvider = "invalidData")
    public void inValidLoginTest(String userName, String password){

        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        var homePage=loginPage.clickLoginButton();
        assertEquals(loginPage.getPopUpMessage(),"User or Password is not valid");
        System.out.println("Invalid Login Test");


    }
    @DataProvider(name = "invalidData")
    public Object[][] invalidInputdata(){
        Object[][]data=new Object[1][2];
        data[0][0]="mngr45579"; data[0][1]="pebynuj";
     /*   data[1][0]="mngr455793"; data[1][1]="pebynu";
        data[2][0]="mngr45579"; data[2][1]="pebynu";*/
        return data;



}}

