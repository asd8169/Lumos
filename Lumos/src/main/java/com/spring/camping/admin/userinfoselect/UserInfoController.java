package com.spring.camping.admin.userinfoselect;


import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Handles requests for the application home page.
 */
@Controller
public class UserInfoController {
		
	
	//xml과 java연결
	@Autowired
	private SqlSession sqlSession;
		
	
	//회원리스트
	@RequestMapping("admin_userinfo")
	public String userinfo(Model model) {
		System.out.println("admin_userinfo()");
		CUserInfoDao dao = sqlSession.getMapper(CUserInfoDao.class);
		model.addAttribute("userInfoList", dao.selectUserInfo());
		return "admin/userinfo_view";		
	}
	

	
	
}
