package com.spring.camping.admin.orderlist;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.camping.admin.product.list.CProductCommand;
import com.spring.camping.icommand.ICommand;


@Controller
public class AdminOrderListController {

	@Autowired
	private SqlSession sqlSession;
	
	
	ICommand command = null;
	
	
	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * 
	 */
	@RequestMapping("admin_order_list")
	public String admin_order_list(HttpServletRequest request,Model model,HttpSession session) throws ServletException, IOException {
//		System.out.println("admin_order_list()");
//		AdminOrderList_IDao dao = sqlSession.getMapper(AdminOrderList_IDao.class);
//		model.addAttribute("orderlist", dao.listDao());
		
		
		
		command = new AdminOrderListCommand();
		command.execute(sqlSession, request, model, session);
		
		
		
		return "admin/admin_order_list"; //admin 폴더에 넣어줌
		
	}
	
	
	
	
	
} //----
