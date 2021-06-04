package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Chrome {

    public static void main(String[] args) {

//        File file = new File("D:\\Softwares\\web-drivers\\chromedriver.exe");

//        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");


		
		WebDriver driver=new ChromeDriver();			
	    driver.get("http://localhost:8083/MOVIE-TICKET/login");	
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    
	    //Thread.sleep(10000);
	    
	    //driver.findElement(By.id("postjob")).click();			

	    driver.findElement(By.id("password")).sendKeys("123");                                 					
	    driver.findElement(By.id("login")).sendKeys("Admin@gmail.com");					
	    driver.findElement(By.name("operation")).click();	

	    driver.close();
	    
    }
}
