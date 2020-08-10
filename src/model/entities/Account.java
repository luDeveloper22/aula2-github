package model.entities;
import mode.exception.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balace;
	private Double withdrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balace, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balace = balace;
		this.withdrawLimit = withdrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalace() {
		return balace;
	}
	
	public void setBalace(Double balace) {
		this.balace = balace;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimite(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	
	public void deposit(Double amount) {
		balace += amount;
	}
	
	public void withdraw(Double amount) throws DomainException{
		
		if (amount > withdrawLimit && amount < balace) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		if (amount > withdrawLimit && amount > balace) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		
		if (amount < withdrawLimit && amount > balace) {
			throw new DomainException("Not enough balace");
		}
		
		
		balace -= amount;
	}
	

}
