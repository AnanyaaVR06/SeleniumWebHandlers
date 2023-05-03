package com.example.day5.Testingday5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task54 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver1 =new EdgeDriver();
	    WebDriver driver2 =new EdgeDriver();
	    WebDriver driver3 =new EdgeDriver();
		driver1.get("https://www.google.com/");
	    driver2.get("https://www.google.com/");
	    driver3.get("https://www.google.com/");
	    driver1.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple",Keys.ENTER);
	    driver2.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("selenium",Keys.ENTER);
	    driver3.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Cucumber",Keys.ENTER);
	    String driverid1=driver1.getWindowHandle();
	    String driverid2=driver2.getWindowHandle();
	    String driverid3=driver3.getWindowHandle();
	    System.out.println(driverid1);
	    System.out.println(driverid2);
	    System.out.println(driverid3);
	}

}
