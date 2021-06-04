package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {

    public static void main(String[] args) {

        final WebDriver edge = SetUp.get("http://localhost:8083/MOVIE-TICKET/movie/", 3000);

        final WebElement fileUpload = edge.findElement(By.id("image"));
        fileUpload.sendKeys("E:\\Pictures\\Images\\1.jpg");

        edge.findElement(By.id("operation")).click();

       

        edge.quit();

        edge.close();
    }
}
