package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.NavigationUtil;

import java.io.IOException;

public class LoginPage extends NavigationUtil {
    private WebDriver driver;

    public void setUserName(String username){
        driver.findElement(By.id("MainContent_txtUserName")).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
    }

    public void clickSubmit(){
        driver.findElement(By.id("MainContent_btnLogin")).click();
    }

    public LoginPage(WebDriver driver) throws IOException {
        super();
    }
}
