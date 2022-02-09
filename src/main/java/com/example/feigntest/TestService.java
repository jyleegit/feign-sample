package com.example.feigntest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
    TestClient testClient;
	
	public String testFeign() {
        return testClient.testFeign();
    }
}
