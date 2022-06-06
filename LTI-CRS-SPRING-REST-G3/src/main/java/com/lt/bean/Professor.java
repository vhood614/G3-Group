package com.lt.bean;

public class Professor {
	
	private Long profId;
	private String profName;
	private String profUserName;
	private String profPassword;
	public Long getProfId() {
		return profId;
	}
	public void setProfId(long l) {
		this.profId = l;
	}
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getProfUserName() {
		return profUserName;
	}
	public void setProfUserName(String profUserName) {
		this.profUserName = profUserName;
	}
	public String getProfPassword() {
		return profPassword;
	}
	public void setProfPassword(String profPassword) {
		this.profPassword = profPassword;
	}
	
	public Professor() {
		
	}
	
	public Professor(long i, String profName, String profUserName, String profPassword) {
		super();
		this.profId = i;
		this.profName = profName;
		this.profUserName = profUserName;
		this.profPassword = profPassword;
	}
	
	
	@Override
	public String toString() {
		return "Professor [profId=" + profId + ", profName=" + profName + ", profUserName=" + profUserName
				+ ", profPassword=" + profPassword + "]";
	}
	
	
	
	
	
	

}
