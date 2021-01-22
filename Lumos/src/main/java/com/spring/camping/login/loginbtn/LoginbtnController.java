//package com.spring.camping.login.loginbtn;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.spring.camping.icommand.ICommand;
//
//@Controller
//public class LoginbtnController {
//	
//	@Autowired
//	private SqlSession sqlSession;
//	
//	ICommand command = null;
//	
//	
//	@RequestMapping("login")
//	public String login(HttpServletRequest request, Model model, HttpSession session) throws ServletException, IOException {
//		
//		command = new LoginbtnCommand();
//		command.execute(sqlSession, request, model, session);
//		
//		int loginResult = (int) session.getAttribute("loginResult");
//		String id = (String) session.getAttribute("sessionuserId");
//		System.out.println("id : " + id);
//		viewPage = "main.do";
//		if (id.equals("admin")){
//			System.out.println("id들어갔니?" + id);
//			if (loginResult == 1) {	
//				viewPage = "admin_main.jsp";
//			} else {
//
//				viewPage = "login_view.jsp";
//				
//			}
//		}else{
//			System.out.println("id여기로 들어갔니?" + id);
//			if (loginResult == 1) {	
//				viewPage = "main.do";
//			} else {
//				viewPage = "login_view.jsp";
//				
//		}
//		}
//	}
//
//}
