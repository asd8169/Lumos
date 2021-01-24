package com.spring.camping.admin.userinfoselect;

import java.util.ArrayList;

public interface CUserInfoDao {

	public ArrayList<CUserInfoDto> selectUserInfo(int startNum);
	
	public int getBoardCount();
	
}
