package org.my.testwarrior.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.my.testwarrior.Dao.CountryDao;
import org.my.testwarrior.Domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CountryDaoImpl implements CountryDao{

private SessionFactory sessionfactory;
	
	@Autowired
	public CountryDaoImpl(SessionFactory sessionfactory){
		this.sessionfactory = sessionfactory;		
	}
	
	private Session currentsession(){
		return sessionfactory.getCurrentSession();
	}

	@Override
	public void createCountry(Country country) {
		// TODO Auto-generated method stub
		currentsession().save(country);
	}

	@Override
	public Country retrieveCountry(int countryId) {
		// TODO Auto-generated method stub
		Country country = (Country)currentsession().get(Country.class, countryId);
		return country;
	}

	@Override
	public void updateCountry(Country country) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCountry(int countryId) {
		// TODO Auto-generated method stub
		
	}
	
	public void fillDummyCountries() {
		Country country1 = new Country();
		country1.setCountryName("INDIA");
		createCountry(country1);
		Country country2 = new Country();
		country2.setCountryName("US");
		createCountry(country2);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Country> retrieveAllCountries() {
		// TODO Auto-generated method stub
		fillDummyCountries();		
		return currentsession().createCriteria(Country.class).list();
	}

}
