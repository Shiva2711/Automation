package com.Datadriven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RW_File {

	 public static void main(String[] args) throws IOException {
	   
	  String TestFile = System.getProperty("user.dir") + "/data/Data.txt";
	  File FC = new File(TestFile);
	  FC.createNewFile();
	  
	 
	  
	  FileWriter FW = new FileWriter(TestFile);
	  BufferedWriter BW = new BufferedWriter(FW);
	  BW.write("This Is First Line"); //Writing In To File.
	  BW.newLine();//To write next string on new line.
	  BW.write("This Is Second Line"); //Writing In To File.
	  BW.close();
	  
	  
	  FileReader FR = new FileReader(TestFile);
	  BufferedReader BR = new BufferedReader(FR);
	  String Content = "";
	  
	  while((Content = BR.readLine())!= null){
	   System.out.println(Content);
	  }
	 }
	}