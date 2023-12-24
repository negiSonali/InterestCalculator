package com.ac.interesthandler;

import com.ac.interest.dto.InterestRequest;
import com.ac.interest.dto.InterestResponse;
import com.ac.interest.service.CompundInterestService;
import com.ac.interest.service.SimpleInterestService;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class InterestHandler implements RequestHandler<InterestRequest, InterestResponse> {

	double output;
	@Override
	public InterestResponse handleRequest(InterestRequest input, Context context) {
		if(input.getResource().equalsIgnoreCase("simple")) {
			SimpleInterestService si = new SimpleInterestService();
			output = si.simpleInterestService(input);
		}else if (input.getResource().equalsIgnoreCase("compound")) {
			CompundInterestService ci = new CompundInterestService();
			output = ci.compundInterestService(input);
		}
		InterestResponse res = new InterestResponse(output);
		return res;
	}

}
