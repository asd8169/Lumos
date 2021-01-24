package com.spring.camping.admin.product.list;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.camping.admin.userinfoselect.CUserInfoCommand;
import com.spring.camping.icommand.ICommand;

@Controller
public class AdminProductListController {


	// xml과 java연결
	@Autowired
	private SqlSession sqlSession;


	ICommand command = null;
	
	// Admin Product List 연결
	@RequestMapping("product_list")
	public String admin_product_list(HttpServletRequest request,Model model,HttpSession session) throws ServletException, IOException {
//		AdminProductList_IDao dao = sqlSession.getMapper(AdminProductList_IDao.class);
//		model.addAttribute("productlist", dao.productlistDao());

		command = new CProductCommand();
		command.execute(sqlSession, request, model, session);
		
		
		return "admin/admin_Product_list";
	}

}
