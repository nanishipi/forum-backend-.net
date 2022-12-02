package com.forumbackend.forumbackend.forum;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubThreadResourse {
	
	private SubThreadDaoService service;
	
	public SubThreadResourse(SubThreadDaoService service) {
		this.service = service;
	}
	
	@GetMapping("/subthreads")
	public List<SubThread> retrieveAllSubThreads() {
		return service.findAll();
	}
	
	@PostMapping("/subthreads")
	public void createSubThread(@RequestBody SubThread subthread) {
		service.save(subthread);
	}
}
