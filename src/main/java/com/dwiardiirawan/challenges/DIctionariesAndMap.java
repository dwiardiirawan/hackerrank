package com.dwiardiirawan.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DIctionariesAndMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Map<String, Integer> maps = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phoneNumber = in.nextInt();
			maps.put(name, phoneNumber);
		}
		int index=0;
		while(in.hasNext()){
			index++;
			String s = in.next();
			Integer value = maps.get(s);
			if(value!=null){
				System.out.println(s+"="+value);
			}else{
				System.out.println("Not Found");
			}
			
			if(index==n)
				break;
			
		}
		in.close();
		

		
	}

}
