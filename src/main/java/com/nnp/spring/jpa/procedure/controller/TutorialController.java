package com.nnp.spring.jpa.procedure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nnp.spring.jpa.procedure.model.SearchRequest;
import com.nnp.spring.jpa.procedure.model.Tutorial;
import com.nnp.spring.jpa.procedure.service.TutorialService;

@RestController
@RequestMapping("/api")
public class TutorialController {
	
	@Autowired
	private TutorialService tutorialService;
	
	@PostMapping("/search")
	@Transactional
	public ResponseEntity<List<Tutorial>> searchTutorialsByTitle(@RequestBody SearchRequest searchRequest){
		String searchTitle = searchRequest.getTitle();
		List<Tutorial> results = tutorialService.searchTutorialsByTitle(searchTitle);
        return ResponseEntity.ok(results);
	}
}
