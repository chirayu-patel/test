package org.my.testwarrior.Dao;

import org.my.testwarrior.Domain.MobileNumbers;

public interface MobileNumbersDao {
	void createMobileNumber(MobileNumbers mob);
	MobileNumbers retrieveMobileNumber(long mob);
	void updateMobileNumber(MobileNumbers mob);
	void deleteMobileNumber(long mob);
}
