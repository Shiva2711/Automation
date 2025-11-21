package com.Practice;

import java.util.Arrays;
import java.util.List;

//import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class substringOccurance {
	
	@Test
	public void f() {
		
		String Text ="adsfsivawerewrsivaerwerewsivawerersivaaqreqwr";
		String str ="siva";
		
		//int Count = StringUtils.countMatches(Text, str);
		//System.out.println(count);
		System.out.println(countMatches(Text, str));
		
	}
	
	public static int countMatches(String text, String str) {
		
		return text.split(str, -1).length -1;
		
	}
	
	//@Test
	public void f1() {
		String text ="adsfsivawerewrsivaerwerewsivawerersivaaqreqwrsivasivasiva";
		String str ="siva";
		
		List<String> items = Arrays.asList(text.split(str, -1));
		System.out.println(items);
		//System.out.println(text.split(str).length-1);
		int count = countMatches(text, str);
		System.out.println(count);
	}

}
