package com.Theory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String csv = sc.nextLine();
		Map<String,String> map = new HashMap<>();
		String[] inp = csv.split(",");
		
		for(String val : inp) {
			String[] keyValue = val.split(":");
			
			String key = keyValue[0].trim();
			String value = keyValue[1].trim();
			
			if(value.matches("\\d+")) {
				
			}
			
		}
		
		
	}
}
