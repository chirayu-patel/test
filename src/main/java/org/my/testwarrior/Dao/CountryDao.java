package org.my.testwarrior.Dao;

import java.util.List;

import org.my.testwarrior.Domain.Country;

public interface CountryDao {
	void createCountry(Country country);
	Country retrieveCountry(int countryId);
	List<Country> retrieveAllCountries();
	void updateCountry(Country country);
	void deleteCountry(int countryId);
}
