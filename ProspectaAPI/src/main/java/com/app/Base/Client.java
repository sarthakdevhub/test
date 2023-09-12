package com.app.Base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Client {
	
	@Autowired
	public RestTemplate restTemplate;
	
	public DetailsBean CallingAPI(String Category) {
		String apiUrl = "https://api.publicapis.org/entries?category="+Category;
         DetailsBean db = restTemplate.getForObject(apiUrl, DetailsBean.class);
//         System.out.print(db);
         return db;
	}
	
}
