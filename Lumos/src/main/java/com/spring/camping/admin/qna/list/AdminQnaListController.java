package com.spring.camping.admin.qna.list;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminQnaListController {

	private static final Logger logger = LoggerFactory.getLogger(AdminQnaListController.class);

	// xml과 java연결
	@Autowired
	private SqlSession sqlSession;

	// Admin Product List 연결
	@RequestMapping("admin_qna_list")
	public String admin_qna_list(Model model) {
		AdminQnaList_IDao dao = sqlSession.getMapper(AdminQnaList_IDao.class);
		model.addAttribute("list", dao.qnalistDao());

		return "admin/admin_qna_list";
	}

}
