package com.app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.Model.DetailsBean;
import com.app.Model.EntryBean;
import com.app.Model.OutputDTO;
import com.app.Repository.APIRepo;

@Service
public class APIService {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@Autowired
	public APIRepo apiRepo;
	
	public List<OutputDTO> CallingAPI(String category) {
		String apiUrl = "https://api.publicapis.org/entries?category="+category;
		ResponseEntity<DetailsBean> responseEntity = restTemplate.getForEntity(apiUrl, DetailsBean.class);
		List<EntryBean> entries = responseEntity.getBody().getEntries();
		List<OutputDTO> finalList = new ArrayList<>(); 
		
		for(EntryBean eb : entries) {
			finalList.add(new OutputDTO(eb.getAPI(), eb.getDescription()));
		} 
		
		return finalList;
	}
	
	public EntryBean saveEntry() {
        ResponseEntity<DetailsBean> re= restTemplate.getForEntity("https://api.publicapis.org/random", DetailsBean.class);
        EntryBean eb = re.getBody().getEntries().get(0);
        
        apiRepo.save(eb);
        
        return eb;
        

	}
}
