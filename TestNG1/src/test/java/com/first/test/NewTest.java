package com.first.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.out.println("second");
  }
  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
	  System.out.println("first");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  Thread.sleep(4000);
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("third");
	  driver.close();
  }

}
