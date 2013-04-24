package org.my.testwarrior.Dao;

import java.util.List;

import org.my.testwarrior.Domain.State;

public interface StateDao {
		void createState(State State);
		State retrieveState(int stateId);
		List<State> retrieveStatesOfCountry(int countryId);
		void updateState(State State);
		void deleteState(int stateId);
}
