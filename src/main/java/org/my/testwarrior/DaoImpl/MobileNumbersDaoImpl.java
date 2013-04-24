package org.my.testwarrior.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.my.testwarrior.Dao.MobileNumbersDao;
import org.my.testwarrior.Domain.MobileNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class MobileNumbersDaoImpl implements MobileNumbersDao{

private SessionFactory sessionfactory;
	
	@Autowired
	public MobileNumbersDaoImpl(SessionFactory sessionfactory){
		this.sessionfactory = sessionfactory;
	}
	
	private Session currentsession(){
		return sessionfactory.getCurrentSession();
	}
	
	
	@Override
	public void createMobileNumber(MobileNumbers mob) {
		currentsession().save(mob);
		
	}

	@Override
	public MobileNumbers retrieveMobileNumber(long mob) {
		MobileNumbers mobile = (MobileNumbers)currentsession().get(MobileNumbers.class, mob);
		return mobile;
	}

	@Override
	public void updateMobileNumber(MobileNumbers mob) {
		currentsession().update(mob);
		currentsession().flush();		
	}

	@Override
	public void deleteMobileNumber(long mob) {
		MobileNumbers mobile = (MobileNumbers)currentsession().get(MobileNumbers.class, mob);
		currentsession().delete(mobile);
	}

}
