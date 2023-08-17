package com.app.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop_File {
	
	public static void readprop() {
		try {
			FileReader read  = new FileReader(new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Test_July\\src\\test"
					+ "\\resources\\TestData\\Test.properties"));
			Properties prop =new Properties();
			prop.load(read);
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		readprop();
	}

}
