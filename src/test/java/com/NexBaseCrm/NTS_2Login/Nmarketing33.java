package com.NexBaseCrm.NTS_2Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class Nmarketing33 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().window().maximize();
        String url = "http://login2.nextbasecrm.com";
        String marketing33Login = "marketing33@cybertekschool.com";

        String expectedTitle = "Authorization";

/*
<input type="submit" value="Log In" class="login-btn" onclick="BX.addClass(this, 'wait');">



 */
        driver.get(url);
//only login no password
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.cssSelector("input[class='login-inp']"));
        login.sendKeys("marketing33@cybertekschool.com");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
        submit.click();

        System.out.println("Expected Title " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("ActualTitle " + actualTitle);


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("marketing33Login : Title verification matched negative test case passed");
        } else {
            System.out.println("marketing33Login :Title verification failed negative test case failed");
        }
driver.quit();

    }

    }
