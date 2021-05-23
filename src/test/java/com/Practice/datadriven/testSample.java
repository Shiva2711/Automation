package com.Practice.datadriven;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;


public class testSample {
	
	@Test
	public void f() throws IOException {
		
		DataDriven d = new DataDriven();
		
		ArrayList data = d.getData("Rbtest51");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
	}

}
