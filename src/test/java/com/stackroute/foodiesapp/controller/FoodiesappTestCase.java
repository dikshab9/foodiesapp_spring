package com.stackroute.foodiesapp.controller;

import static org.junit.Assert.*;

import org.apache.catalina.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.stackroute.foodiesapp.FoodiesMain;
import com.stackroute.foodiesapp.domain.FoodiesModel;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FoodiesMain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FoodiesappTestCase {
	
	
	    String user1;
	    @LocalServerPort
	    private int port;
	    TestRestTemplate restTemplate = new TestRestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    FoodiesModel foodiesmodel;
	    @Before
	    public void setUp() throws Exception {
	         foodiesmodel=new FoodiesModel();
	    }
	    private String createURLWithPort(String uri) {
	        return "http://localhost:" + port + uri;
	    }
	    @After
	    public void tearDown() throws Exception {
	    }
	    @Test
	    public void testSaveUser() throws Exception {
	        HttpEntity<FoodiesModel> entity = new HttpEntity<FoodiesModel>(foodiesmodel, headers);
	        ResponseEntity<String> response = restTemplate.exchange(
	                createURLWithPort("/v0.1/FoodiesService/FoodiesModel"),
	                HttpMethod.POST, entity, String.class);
	        assertNotNull(response);
	        String actual = response.getBody();
	        System.out.println(actual);
	        assertEquals("created",actual);
	    }
	    @Test
	    public void testList() throws Exception {
	        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
	        ResponseEntity<String> response = restTemplate.exchange(
	                createURLWithPort("/v0.1/FoodiesService/FoodiesModel"),
	                HttpMethod.GET, entity, String.class);
	        assertNotNull(response);
	    }
	    @Test
	    public void testGetUser() throws Exception {
	    }
	    @Test
	    public void testUpdateUser() throws Exception {
	    }
//	    @Test
//	    public void testDeleteUser() throws Exception {
//	    	HttpEntity<FoodiesModel> entity= new HttpEntity<FoodiesModel>(foodiesmodel,headers);
//	    	ResponseEntity<String> response=restTemplate.exchange(
//	    			createURLWithPort("/v0.1/FoodiesService/FoodiesModel/{id}"),
//	    			HttpMethod.DELETE,entity,String.class);
//	    	assertNotNull(response);
//	    	 String actual = response.getBody();
//		        System.out.println(actual);
//		        assertEquals("Deleted succesfully",actual);
//	    }
	

}
