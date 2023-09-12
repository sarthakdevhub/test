package com.app.Base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	private final Client client;
	
	@Autowired
    public AppController(Client client) {
        this.client = client;
    }

    @GetMapping("/data")
    public DetailsBean getApiData(@RequestBody String Category) {
        return client.CallingAPI(Category);
    }
}
