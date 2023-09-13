package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.Model.EntryBean;
import com.app.Model.OutputDTO;
import com.app.Service.APIService;

@RestController
public class APIController {
	
	//access h2 database here #http://localhost:8080/h2-console
	
	@Autowired
	private APIService apiService;
	
	@GetMapping("/list")
	public ResponseEntity<List<OutputDTO>> getList(@RequestParam String category){	
		return new ResponseEntity<>(apiService.CallingAPI(category),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<EntryBean> save(){
		return new ResponseEntity<>(apiService.saveEntry(),HttpStatus.CREATED);
	}
	
	
	
	//Question: what are the key things you would consider when creating/consuming an API
	//to ensure that it is secure and reliable?
	
	//-Security measure
	//-Authentication
	//-Parameters
	//-Naming Conventions
	//-People should be able to have access according to authorization
}
