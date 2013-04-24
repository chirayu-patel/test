package org.my.testwarrior.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.my.testwarrior.Dao.StateDao;
import org.my.testwarrior.Domain.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StateDaoImpl implements StateDao{

private SessionFactory sessionfactory;
	
	@Autowired
	public StateDaoImpl(SessionFactory sessionfactory){
		this.sessionfactory = sessionfactory;
	}
	
	private Session currentsession(){
		return sessionfactory.getCurrentSession();
	}

	@Override
	public void createState(State State) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public State retrieveState(int stateId) {
		// TODO Auto-generated method stub
		State state = (State)currentsession().get(State.class, stateId);
		return state;
	}

	@Override
	public void updateState(State State) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteState(int stateId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<State> retrieveStatesOfCountry(int countryId) {
		// TODO Auto-generated method stub
		Query query = currentsession().createQuery("from State where State.country = :countryId");
		query.setInteger("countryId", countryId);
		return query.list();
	}

}
