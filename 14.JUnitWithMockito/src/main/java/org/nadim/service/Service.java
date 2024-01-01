package org.nadim.service;

import java.util.List;
import java.util.stream.Collectors;

import org.nadim.repository.Repository;

public class Service {
	
	private Repository repo;
	
	public List<String> getDataByLength(){
		return repo.getData().stream().filter(d->d.length()<5)
				.collect(Collectors.toList());
	}
}
