package com.ac.interest.service;

import com.ac.interest.dto.InterestRequest;

public class SimpleInterestService {

	public double simpleInterestService(InterestRequest simpleIntRequest) {
		double si = (simpleIntRequest.getPrincipal()*
				simpleIntRequest.getInterestRate()*
				simpleIntRequest.getTime())/100.00;
		
		return si;		
	}
}
