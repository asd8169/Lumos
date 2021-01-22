package com.spring.camping.admin.userinfosearch;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserInfoSearchController {
	
	
	//xml과 java연결
	@Autowired
	private SqlSession sqlSession;
		
	
	//회원리스트
	@RequestMapping("admin_userinfoSearch")
	public String userinfoSearch(HttpServletRequest request,Model model) {
//		System.out.println(select);
//		System.out.println(content);
		CUserInfoSearchDao dao = sqlSession.getMapper(CUserInfoSearchDao.class);
		System.out.println(request.getParameter("select"));
		System.out.println(request.getParameter("content"));
		model.addAttribute("userInfoList", dao.search(request.getParameter("select"),request.getParameter("content")));
		return "admin/userinfo_view";		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}