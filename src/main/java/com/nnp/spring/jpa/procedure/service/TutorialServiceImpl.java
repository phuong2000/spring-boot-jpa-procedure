package com.nnp.spring.jpa.procedure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nnp.spring.jpa.procedure.model.Tutorial;
import com.nnp.spring.jpa.procedure.repository.TutorialRepository;

@Service
public class TutorialServiceImpl implements TutorialService{
	
	@Autowired
	private TutorialRepository tutorialRepository;
	
	@Override
	@Transactional
	public List<Tutorial> searchTutorialsByTitle(String searchTitle) {
		return tutorialRepository.searchTutorialsByTitle(searchTitle);
	}
	
}
