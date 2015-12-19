package domain;


import java.io.Serializable;
import java.time.LocalDate;

import base.RateDAL;

public class RateDomainModel implements Serializable {
	
	protected int RateID;
	protected int MinCreditScore;
	protected double InterestRate;
	
	public RateDomainModel(RateDomainModel TBLRATE){
		super();
		RateID = TBLRATE.getRateID();
		MinCreditScore = TBLRATE.getMinCreditScore();
		InterestRate = TBLRATE.getInterestRate();
		
	}
	public RateDomainModel(){

	}
	public int getRateID() {
		return RateID;
	}
	public void setRateID(int rateID) {
		RateID = rateID;
	}
	public int getMinCreditScore() {
		return MinCreditScore;
	}
	public void setMinCreditScore(int minCreditScore) {
		MinCreditScore = minCreditScore;
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	
	
}