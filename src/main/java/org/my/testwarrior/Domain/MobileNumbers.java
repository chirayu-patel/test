package org.my.testwarrior.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class MobileNumbers {
	@Id
	private long mobileNumber;
	private String rackIpAddress;
	private int rackBoardNumber;
	private int rackSlotNumber;
	@ManyToOne
	private Country country;
	@ManyToOne
	private State state;
	private float initialBalance;
	private float localSmsRate;
	private float internationalSmsRate;
	private float localCallRate;
	private float internationalCallRate;
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getRackIpAddress() {
		return rackIpAddress;
	}
	public void setRackIpAddress(String rackIpAddress) {
		this.rackIpAddress = rackIpAddress;
	}
	public int getRackBoardNumber() {
		return rackBoardNumber;
	}
	public void setRackBoardNumber(int rackBoardNumber) {
		this.rackBoardNumber = rackBoardNumber;
	}
	public int getRackSlotNumber() {
		return rackSlotNumber;
	}
	public void setRackSlotNumber(int rackSlotNumber) {
		this.rackSlotNumber = rackSlotNumber;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public float getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(float initialBalance) {
		this.initialBalance = initialBalance;
	}
	public float getLocalSmsRate() {
		return localSmsRate;
	}
	public void setLocalSmsRate(float localSmsRate) {
		this.localSmsRate = localSmsRate;
	}
	public float getInternationalSmsRate() {
		return internationalSmsRate;
	}
	public void setInternationalSmsRate(float internationalSmsRate) {
		this.internationalSmsRate = internationalSmsRate;
	}
	public float getLocalCallRate() {
		return localCallRate;
	}
	public void setLocalCallRate(float localCallRate) {
		this.localCallRate = localCallRate;
	}
	public float getInternationalCallRate() {
		return internationalCallRate;
	}
	public void setInternationalCallRate(float internationalCallRate) {
		this.internationalCallRate = internationalCallRate;
	}
	

	
}
