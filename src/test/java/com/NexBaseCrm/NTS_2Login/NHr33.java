package com.NexBaseCrm.NTS_2Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class NHr33 {



        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new WebDriverFactory().getDriver("chrome");
            driver.manage().window().maximize();
            String url = "http://login2.nextbasecrm.com";

            String password = "UserUser";//correct password
            String expectedTitle = "Authorization";
            driver.get(url);

            Thread.sleep(2000);

           //no login -->input only password
            Thread.sleep(2000);
            WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
            passwordBox.sendKeys(password + Keys.ENTER);
            Thread.sleep(2000);
            System.out.println("Expected Title " + expectedTitle);
            String actualTitle = driver.getTitle();
            System.out.println("ActualTitle " + actualTitle);
            WebElement popUpMsg = driver.findElement(By.cssSelector("div[class='errortext']"));
            System.out.println( "PopUpMsg : " + popUpMsg.getText());
            if (popUpMsg.isDisplayed()){
                System.out.println("PopUpMsgIsDisplayed Test case passed");
            }else{
                System.out.println("No popUpMsg Test case failed");
            }

            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Helpdesk33 negative test case passed  Title matched  ");
            } else {
                System.out.println("Hr33 negative test case failed Title verification failed");
            }


driver.quit();


        }



















    }

