package com.cs208.microservice2;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class Handler {

	@GetMapping("/bloat")
	public String allocateMemory(String sleepTime, String size) {
		try {
			Thread.sleep(new Long(sleepTime));
		}catch(Exception e) {
		}
			
		String[] arr = new String[Integer.parseInt(size)];
		String testString = "CS208 Project";
		
		for (int i=0;i<Integer.parseInt(size);i++) {
			String tempStr = "";
			for(int j=0;j<testString.length();j++) {
				tempStr = tempStr + testString.charAt(j);
			}
			arr[i] = tempStr;
		}
		
		String returnString = "The total number of memory allocated is "+size;
		return returnString;
	}
	
}