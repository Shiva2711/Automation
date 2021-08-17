package com.Practice2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.comparators.ReverseComparator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Streams {

	//@Test
	public void f() {
		
		int a[] = {1,1,2,3,4,5};
		
		List<Integer> a1 = Arrays.asList(1,1,2,3,4,5);
		
		a1.stream().distinct().forEach(s->System.out.print(s));
		
		
	}
	
	//@Test
	public void f1() {
		String s = "ssdsdlqwq";
		
		List<String> b =Arrays.asList(s.split("")).stream().distinct().collect(Collectors.toList());
		b.forEach(a->System.out.print(a));
	}
	
	//@Test
	public void f2() {
		String s = "pardon";
		
		String t ="";
		
		for(int i = s.length()-1; i>=0; i--) {
			
		t = t + s.charAt(i);
		
		}
		System.out.println(t);
	}
	
	//@Test
	public void f3() {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webriver.chrome.driver", ("user.dir") + "/chromedriver.exe");
		driver.get("https://www.flipkart.com/");
		
		String Logincolor = driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2HKlqd _3AWRsL']")).getCssValue("Color");
		String background = driver.findElement(By.xpath("//div[@class = '_36HLxm col col-3-5']")).getCssValue("background-color");
		
		System.out.println(Logincolor);
		System.out.println(background);
	}
	
	//@Test
	public void f4() {
		String s = "wdweewr";
		List<String> a = Arrays.asList(s.split(""));
		
		long count =a.stream().filter(b->b.contains("w")).count();
		System.out.println(count);
	}
	
	//@Test
	public void f5() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webriver.chrome.driver", ("user.dir") + "/chromedriver.exe");
		driver.get("https://www.amazon.in/");
		
		List<WebElement> link = driver.findElements(By.xpath("//li/a"));
		
		Actions action = new Actions(driver);
		
		
		/*
		 * for(int i = 0; i<link.size(); i++) {
		 * action.keyDown(Keys.LEFT_CONTROL).click(link.get(i)).keyUp(Keys.LEFT_CONTROL)
		 * .build().perform(); }
		 */
		
		  //List <String> a =link.stream().map(s->s.getText()).collect(Collectors.toList());
		  
		  link.stream().forEach(s->action.keyDown(Keys.LEFT_CONTROL).click(s).keyUp(Keys.LEFT_CONTROL).build().perform()); 
		 
		  //a.forEach(s->System.out.println(s));
		 
		
		driver.quit();
	}
	
	@Test
	public void f6() {
		
		int a[] = {1,2,4,5,6,8};
		
		List<Integer> b = Arrays.asList(1,2,4,5,6,8);
		
		List<Integer> c = b.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(c.get(1));
		
		
	}
}
