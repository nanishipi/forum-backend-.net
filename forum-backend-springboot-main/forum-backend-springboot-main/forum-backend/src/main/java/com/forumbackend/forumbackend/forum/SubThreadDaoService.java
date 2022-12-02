package com.forumbackend.forumbackend.forum;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SubThreadDaoService {
	
	private static List<SubThread> subthreads = new ArrayList<>();
	
	static {
		subthreads.add(new SubThread("Car subthread","Doubt","This is a thread body","https://cdn.pixabay.com/photo/2014/02/27/16/10/flowers-276014__340.jpg"));
		subthreads.add(new SubThread("SubThread 2","Suggestion","Hello this a thread","https://images.ctfassets.net/hrltx12pl8hq/a2hkMAaruSQ8haQZ4rBL9/8ff4a6f289b9ca3f4e6474f29793a74a/nature-image-for-website.jpg?fit=fill&w=480&h=320"));
		subthreads.add(new SubThread("Sparta","Clarification","This is Sparta","https://cdn.pixabay.com/photo/2018/01/12/10/19/fantasy-3077928__480.jpg"));
	}
	
	public List<SubThread> findAll() {
		return subthreads;
	}
	
	public void save(SubThread subthread) {
		subthreads.add(subthread);
	}

	public String ConCat(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		return null;
	}
}
