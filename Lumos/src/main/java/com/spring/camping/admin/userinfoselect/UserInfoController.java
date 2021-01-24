package com.spring.camping.admin.userinfoselect;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.camping.icommand.CUserInfoCommand;
import com.spring.camping.icommand.ICommand;




/**
 * Handles requests for the application home page.
 */
@Controller
public class UserInfoController {
		
	
	//xml과 java연결
	@Autowired
	private SqlSession sqlSession;
		
	ICommand command = null;
	
//	//회원리스트
	@RequestMapping("admin_userinfo")
	public String userinfo(HttpServletRequest request,Model model,HttpSession session) throws ServletException, IOException {
		
		
		command = new CUserInfoCommand();
		command.execute(sqlSession, request, model, session);
		
		
//		CUserInfoDao dao = sqlSession.getMapper(CUserInfoDao.class);
//		model.addAttribute("userInfoList", dao.selectUserInfo());
		
		return "admin/userinfo_view";		
	}
	

	
	
}
