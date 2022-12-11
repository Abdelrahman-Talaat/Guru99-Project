package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.file.WatchEvent;

public class WithdrawalPage {
    private WebDriver driver;
    private By enterAccNoLocator= By.xpath("//input[@name='accountno']");
    private By enterAmountLocator=By.xpath("//input[@name='ammount']");
    private By enterDescriptionLocator=By.xpath("//input[@name='desc']");
    private By clickSubmitButtonLocator=By.xpath("//input[@name='AccSubmit']");


    public WithdrawalPage (WebDriver driver){
        this.driver=driver;
    }
    public void enterAccNo(String accNo){
        driver.findElement(enterAccNoLocator).sendKeys(accNo);
    }
    public void enterAmount(String amount){
        driver.findElement(enterAmountLocator).sendKeys(amount);
    }
    public void enterDescription(String description){
        driver.findElement(enterDescriptionLocator).sendKeys(description);
    }
    public void clickSubmitButton(){
        driver.findElement(clickSubmitButtonLocator).click();
    }
    public String getPopUpMessage(){
        return driver.switchTo().alert().getText();
    }

}
