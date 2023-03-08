package com.italloramon.springwebmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.italloramon.springwebmvc.model.Jedi;

@Repository
public class JediRepository {
	
	private List<Jedi> jedi;
	
	public JediRepository() {
		jedi = new ArrayList<>();
		jedi.add(new Jedi("Luke", "Skywalker"));
	}
	
	public List<Jedi> getAllJedi() {	
		return jedi;
	}

	public void add(Jedi jedi) {
		this.jedi.add(jedi);
	}
	
}
