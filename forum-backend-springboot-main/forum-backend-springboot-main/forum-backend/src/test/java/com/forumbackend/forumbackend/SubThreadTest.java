package com.forumbackend.forumbackend;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.forumbackend.forumbackend.forum.SubThread;
import com.forumbackend.forumbackend.forum.SubThreadDaoService;


class SubThreadTest {

	
	@Test
	void testGetTitle() {
		SubThread substhread = new SubThread ("Car", null, null, null);
		assertTrue(substhread.getTitle() == "Car");	
	}
	
	
	@Test
	void testGetCategory() {
		SubThread substhread = new SubThread ("Doubt", null, null, null);
		assertTrue(substhread.getCategory() == "Doubt");	
	}
	
	
	@Test
	void testGetBody() {
		SubThread substhread = new SubThread ("This is a thread body", null, null, null);
		assertTrue(substhread.getBody() == "This is a thread body");	
	}
	
	
	@Test
	void testGetImageLink() {
		SubThread substhread = new SubThread ("https://cdn.pixabay.com/photo/2014/02/27/16/10/flowers-276014__340.jpg", null, null, null);
		assertTrue(substhread.getImageLink() == "https://cdn.pixabay.com/photo/2014/02/27/16/10/flowers-276014__340.jpg");	
	}
	
	
	@Test
	void testGetTitle2() {
		SubThread substhread = new SubThread ("SubThread 2", null, null, null);
		assertTrue(substhread.getTitle() == "SubThread 2");	
	}
	
	
	@Test
	void testGetCategory2() {
		SubThread substhread = new SubThread ("Suggestion", null, null, null);
		assertTrue(substhread.getCategory() == "Suggestion");	
	}
	
	
	@Test
	void testGetBody2() {
		SubThread substhread = new SubThread ("Hello this a thread", null, null, null);
		assertTrue(substhread.getBody() == "Hello this a thread");	
	}
	
	
	@Test
	void testGetImageLink2() {
		SubThread substhread = new SubThread ("https://images.ctfassets.net/hrltx12pl8hq/a2hkMAaruSQ8haQZ4rBL9/8ff4a6f289b9ca3f4e6474f29793a74a/nature-image-for-website.jpg?fit=fill&w=480&h=320", null, null, null);
		assertTrue(substhread.getImageLink() == "https://images.ctfassets.net/hrltx12pl8hq/a2hkMAaruSQ8haQZ4rBL9/8ff4a6f289b9ca3f4e6474f29793a74a/nature-image-for-website.jpg?fit=fill&w=480&h=320");	
	}
	

	
	@Test
	void testGetTitle3() {
		SubThread substhread = new SubThread ("Sparta", null, null, null);
		assertTrue(substhread.getTitle() == "Sparta");	
	}
	
	
	@Test
	void testGetCategory3() {
		SubThread substhread = new SubThread ("Clarification", null, null, null);
		assertTrue(substhread.getCategory() == "Clarification");	
	}
	
	
	@Test
	void testGetBody3() {
		SubThread substhread = new SubThread ("This is Sparta", null, null, null);
		assertTrue(substhread.getBody() == "This is Sparta");	
	}
	
	
	@Test
	void testGetImageLink3() {
		SubThread substhread = new SubThread ("https://cdn.pixabay.com/photo/2018/01/12/10/19/fantasy-3077928__480.jpg", null, null, null);
		assertTrue(substhread.getImageLink() == "https://cdn.pixabay.com/photo/2018/01/12/10/19/fantasy-3077928__480.jpg");	
	}
	
	
	
	
	
	
	
	
	
	
}
