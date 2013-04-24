package org.my.testwarrior.Domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class State {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stateId;
	private String stateName;
	@ManyToOne
	private Country country;
	@OneToMany(mappedBy="state",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<MobileNumbers> mobileNumbers;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public List<MobileNumbers> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<MobileNumbers> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	
}
