package com.ac.interest.service;

import com.ac.interest.dto.InterestRequest;

public class CompundInterestService {

	//compoundsPerYear
	public double compundInterestService(InterestRequest compoundIntRequest) {
		double amount = compoundIntRequest.getPrincipal()*
				Math.pow(1+ 
						(compoundIntRequest.interestRate/compoundIntRequest.compoundsPerYear), 
						compoundIntRequest.compoundsPerYear + compoundIntRequest.time);
		double compoundInt = amount + compoundIntRequest.getPrincipal();
				
		return compoundInt;		
	}
}
