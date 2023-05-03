package com.example.day5.Testingday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task51 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/droppable/");
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		driver.quit();
}

}
