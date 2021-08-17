package com.Practice.collection;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		WebDriver driver;
		
		a.add("Ramu");
		a.add("Kamu");
		a.add("Somu");
		System.out.println(a);
		
		a.remove(0);
		a.remove("Kamu");
		System.out.println(a);
		
		a.add(0, "kannan");
		System.out.println(a);
		
		System.out.println(a.get(1));
		
		System.out.println(a.contains("somu"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.indexOf("kannan"));
		
		System.out.println(a.size());

	}

}