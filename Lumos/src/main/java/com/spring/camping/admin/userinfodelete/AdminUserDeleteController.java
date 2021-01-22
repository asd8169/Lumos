package com.spring.camping.admin.userinfodelete;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.camping.admin.orderlist.AdminOrderList_IDao;


@Controller
@RequestMapping("admin/")
public class AdminUserDeleteController {

	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * 
	 */
	@RequestMapping("user_delete")
	public String admin_user_delete(HttpServletRequest request, Model model) {
		System.out.println("admin_user_delete()");
		
		AdminUserDelete_IDao dao = sqlSession.getMapper(AdminUserDelete_IDao.class);
		dao.adminUserDelete(request.getParameter("userId"));
		
		
		return "redirect:userinfo";
	}
	
	
	
	
	
} //----
