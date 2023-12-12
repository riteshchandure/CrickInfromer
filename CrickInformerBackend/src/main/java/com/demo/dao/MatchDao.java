package com.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Match;

public interface MatchDao extends JpaRepository<Match, Integer>{
	//match matching 
	Optional<Match> findByTeamHeading(String teamHeading);
}
