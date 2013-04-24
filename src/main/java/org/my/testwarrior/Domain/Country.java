package org.my.testwarrior.Domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int countryId;
	private String countryName;
	@OneToMany(mappedBy="country",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<State> states;
	@OneToMany(mappedBy="country",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<MobileNumbers> mobileNumbers;
	
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}
	public List<MobileNumbers> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<MobileNumbers> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	
	
	
}
