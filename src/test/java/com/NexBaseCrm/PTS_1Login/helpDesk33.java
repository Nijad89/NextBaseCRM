package com.NexBaseCrm.PTS_1Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class helpDesk33 {

    public static void main(String[] args) throws InterruptedException {
/*
<input class="login-inp" type="text" name="USER_LOGIN" placeholder="Login" value="" maxlength="255">

<input class="login-inp" type="password" name="USER_PASSWORD" placeholder="Password" maxlength="255">



 */
        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.manage().window().maximize();
        String url = "http://login2.nextbasecrm.com";
        String helpdeskLogin = "helpdesk33@cybertekschool.com";
        String password = "UserUser";
        String expectedTitle = "Portal";


        driver.get(url);

        Thread.sleep(2000);
        WebElement login = driver.findElement(By.cssSelector("input[class='login-inp']"));
        login.sendKeys(helpdeskLogin);
        Thread.sleep(2000);
        WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys(password+ Keys.ENTER);
        Thread.sleep(2000);
        System.out.println("Expected Title " + expectedTitle);
        String actualTitle = driver.getTitle();
        System.out.println("ActualTitle " + actualTitle);



        if (actualTitle.equals(expectedTitle)){
            System.out.println("Helpdesk33Login successful Title verification passed");
        }else{
            System.out.println("Helpdesk33Login Failed Title verification failed");
        }












    }


























}
