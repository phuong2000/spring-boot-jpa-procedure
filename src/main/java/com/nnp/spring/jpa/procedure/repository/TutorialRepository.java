package com.nnp.spring.jpa.procedure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.nnp.spring.jpa.procedure.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	
	@Procedure(name = "SearchTutorialsByTitle")
	List<Tutorial> searchTutorialsByTitle(@Param("searchTitle") String searchTitle);
}
