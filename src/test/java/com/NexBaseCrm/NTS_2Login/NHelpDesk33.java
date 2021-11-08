package com.NexBaseCrm.NTS_2Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

public class NHelpDesk33 {




            public static void main(String[] args) throws InterruptedException {

                WebDriver driver = new WebDriverFactory().getDriver("chrome");
                driver.manage().window().maximize();
                String url = "http://login2.nextbasecrm.com";
                String helpdeskLogin = "helpdesk3@cybertekschool.com";//wrong userName
                String password = "UserUser";//correct password
                String expectedTitle = "Authorization";

//wrong userName -->correct password
                driver.get(url);

                Thread.sleep(2000);
                WebElement login = driver.findElement(By.cssSelector("input[class='login-inp']"));
                login.sendKeys(helpdeskLogin);
                Thread.sleep(2000);
                WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
                passwordBox.sendKeys(password + Keys.ENTER);
                Thread.sleep(2000);
                System.out.println("Expected Title " + expectedTitle);
                String actualTitle = driver.getTitle();
                System.out.println("ActualTitle " + actualTitle);


                if (actualTitle.equals(expectedTitle)) {
                    System.out.println("Helpdesk33 negative test case passed  Title verified  ");
                } else {
                    System.out.println("Helpdesk33 negative test case failed Title verification failed");
                }


                driver.quit();


            }

    }

