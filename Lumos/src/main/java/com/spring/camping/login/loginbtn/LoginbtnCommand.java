//package com.spring.camping.login.loginbtn;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.ui.Model;
//
//import com.spring.camping.icommand.ICommand;
//
//public class LoginbtnCommand implements ICommand {
//
//	@Override
//	public void execute(SqlSession sqlSession, HttpServletRequest request, Model model, HttpSession session)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String id = request.getParameter("userId");
//		String pw = request.getParameter("userPw");
//		
//	
//		CLoginDao cLoginDao = CLoginDao.getInstance();
//		
//		System.out.println("id : "+id);
//		System.out.println("pw : "+pw);
//		
////		cLoginDao.login(id, pw);
//		
//		int loginResult = cLoginDao.login(id, pw);
//		
//		int userNo = cLoginDao.findUserNo(id);
//		
//		session.setAttribute("loginResult",loginResult);
//		
//		System.out.println("loginResult : " + loginResult);
//		
//		if (loginResult == 1) {
//			
//			//login메소드에 입력된 값이 1이면 loginResult에 리턴값 저장
//			request.setAttribute("loginResult", loginResult);
//		
//			//login메소드에 입력된 값이 1이면 세션에 id값 저장 후 
//			session.setAttribute("sessionuserId", id);
//			session.setAttribute("sessionuserNo", userNo);
//			
//			System.out.println("session :" + session.getAttribute("sessionuserId"));
//			System.out.println("session :" + session.getAttribute("sessionuserNo"));
//			
////			System.out.println("userId : " + id);
////			System.out.println("userNo : " + userNo);
//			
//		}else{
//			
//			//login 메소드의 리턴 값이 1이 아닌 경우 로그인 처리 X
//			session.setAttribute("sessionuserId", id);
//			request.setAttribute("loginResult", loginResult);	
//		}
//	}
//
//}
