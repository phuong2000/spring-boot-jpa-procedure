package com.nnp.spring.jpa.procedure.service;

import java.util.List;

import com.nnp.spring.jpa.procedure.model.Tutorial;

public interface TutorialService {
	List<Tutorial> searchTutorialsByTitle(String searchTitle);
}
