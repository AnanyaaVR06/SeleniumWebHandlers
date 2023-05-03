package com.example.day5.Testingday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task53 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.switchTo().alert().accept();
		String msg=driver.switchTo().alert().getText();
		System.out.print(msg);
		driver.switchTo().alert().accept();
		} 

}
