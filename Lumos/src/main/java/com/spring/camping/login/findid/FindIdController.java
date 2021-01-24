package com.spring.camping.login.findid;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FindIdController {

	

	//xml과 java연결
	@Autowired
	private SqlSession sqlSession;
		
	
	//Id찾기 페이지
	@RequestMapping("findId_view")
	public String findId_view() {
		System.out.println("findId_view()");
//		CFindIdDao dao = sqlSession.getMapper(CFindIdDao.class);
//
//		model.addAttribute("userInfoList", dao.findId(userName,userTelno,userEmail));
		return "login/findId_view";		
		
	}
	
	@RequestMapping("findId")
	public String findId(HttpServletRequest request,Model model) {
		System.out.println(request.getParameter("userName"));
		System.out.println(request.getParameter("userTelno"));
		System.out.println(request.getParameter("userEmail"));
		CFindIdDao dao = sqlSession.getMapper(CFindIdDao.class);
		model.addAttribute("userInfoList", dao.findId(request.getParameter("userName"),request.getParameter("userTelno"),request.getParameter("userEmail")));
		return "login/findId";		
	}
	
	
	
	
}
