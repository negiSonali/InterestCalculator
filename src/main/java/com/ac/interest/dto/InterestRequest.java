package com.ac.interest.dto;

public class InterestRequest {

	public String resource;
	
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public double principal;
	public double interestRate;
	public double time;
	public int compoundsPerYear;
	
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getTime() {
		return time;
	}
	
	public int getCompoundsPerYear() {
		return compoundsPerYear;
	}
	public void setCompoundsPerYear(int compoundsPerYear) {
		this.compoundsPerYear = compoundsPerYear;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public InterestRequest(String resource, double principal, double interestRate, double time, int compoundsPerYear) {
		super();
		this.resource = resource;
		this.principal = principal;
		this.interestRate = interestRate;
		this.time = time;
		this.compoundsPerYear = compoundsPerYear;
	}
	public InterestRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
