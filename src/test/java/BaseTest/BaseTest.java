package BaseTest;

import Pages.LoginPage;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BaseTest {
    public WebDriver driver;
    protected LoginPage loginPage;


    @BeforeMethod
    public void beforeMethod(){
       WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        loginPage=new LoginPage(driver);
        driver.get("https://www.demo.guru99.com/V4/");

    }
    @AfterMethod
    public void screenshot(ITestResult result) throws  IOException , AWTException {
       /* if (ITestResult.FAILURE==result.getStatus()){
            var camera=(TakesScreenshot)driver;
            File screenShot=camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot,new File("resources/screenshots/"+result.getName()+".png"));
            }
            catch (IOException e){
                e.getStackTrace();
            }
        }*/
//      var camera=(TakesScreenshot)driver;
//        File screenShot=camera.getScreenshotAs(OutputType.FILE);
//        try {
//            Files.move(screenShot,new File("resources/screenshots/"+result.getName()+".png"));
//        }
//        catch (IOException e ){
//            e.getStackTrace();
//        }
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image,"png",new File("resources/screenshots/"+result.getName()+".png"));


       driver.quit();
    }

}
