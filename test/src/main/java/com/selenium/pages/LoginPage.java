package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Page Object Model (POM)
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String loginMethod(String username, String password) {


    	 driver.findElement(By.id("password")).sendKeys("123");                                 					
 	    driver.findElement(By.id("login")).sendKeys("Admin@gmail.com");					
 	    driver.findElement(By.name("operation")).click();

        final WebElement message = driver.findElement(By.id("msg_box"));
        final String actualMsg = message.getText();

        return actualMsg;
    }
}
