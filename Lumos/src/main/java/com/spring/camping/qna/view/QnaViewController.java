package com.spring.camping.qna.view;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QnaViewController {
	

	// xml과 java연결
		@Autowired
		private SqlSession sqlSession;

		// Qna View 연결
		@RequestMapping("qna_view")
		public String qna_view(int qnaNo, Model model) {
			QnaView_IDao dao = sqlSession.getMapper(QnaView_IDao.class);
			
			System.out.println("qnaNo : " + qnaNo);
			
			model.addAttribute("qna_view", dao.qnaviewDao(qnaNo));

			return "admin/qna_view";
		}


}
