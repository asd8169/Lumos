package com.spring.camping.icommand;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.spring.camping.admin.userinfoselect.CUserInfoDao;
import com.spring.camping.admin.userinfoselect.CUserInfoDto;

public class CUserInfoCommand implements ICommand {

	@Override
	public void execute(SqlSession sqlSession, HttpServletRequest request, Model model, HttpSession session)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("CUserInfoCommand()");
		final int pageSize = 4;
			
		// qna list 출력
		ArrayList<CUserInfoDto> lists = new ArrayList<CUserInfoDto>();
		
//		ArrayList<CQnaDto>qnadtos = dao.list();
		
//		request.setAttribute("list", qnadtos);	// CQnaDao 리턴값을 list에 저장
		
		int currentPage = 1; 
		if(request.getParameter("page")!=null){ 
			currentPage = Integer.parseInt(request.getParameter("page")); //현재 페이지
			System.out.println("page : " + request.getParameter("page") + "페이지" );
		}
		
		int startNum=((currentPage-1)*pageSize)+1;//전체 페이지 개수	
		
		
		CUserInfoDao dao = sqlSession.getMapper(CUserInfoDao.class);
		model.addAttribute("userInfoList", dao.selectUserInfo(startNum));
		
		
		
		//currentPage와 pageSize는 CMainDao/selectAllBoards메소드 매개변수
		lists = dao.selectUserInfo(startNum);
		
		//lists를 qnadtos에 담아 보낸다
		request.setAttribute("userInfoList", lists);  				
		
		// CMainDao/getBoardCount메소드로 전체 글 갯수 구해서 totalRow에 저장
		int totalRow = dao.getBoardCount();
		
		
		//전체 페이지 갯수 (전체글 개수-1)/페이지당 글 수+1 구해서 totalPage에 저장 
		int totalPage = (totalRow-1)/pageSize+1;  
		
		
		//페이지 그룹화  [1][2][3] [4][5][6] [7][8][9]  =>3페이지가 한그룹
		int pagePerGroup = 3;
		
		
		//시작페이지	((현재페이지-1)/그룹당 보여줄 페이지)*그룹당 보여줄 페이지+1   [1] [4] [7]
		int startPage = ((currentPage-1)/pagePerGroup)*pagePerGroup+1;
		
		
		//끝페이지		시작페이지+그룹당 보여줄 페이지-1  [3] [6] [9]
		int endPage = startPage+pagePerGroup-1;
		
		
		//★만약 endPage가 totalPage보다 크면 endPage에 totalPage를 넣어준다.
		if(endPage>totalPage){
			
			endPage=totalPage;
			
			}
		
		System.out.println("startPage:"+startPage);
		System.out.println("endpage:"+endPage);
		System.out.println("totalPage:"+totalPage);
		System.out.println("totalRow:"+totalRow);
		System.out.println("currentPage:"+currentPage);
		System.out.println("-----------------------------------");
		
		
		//request에 setAttribute를 사용하여 모든 정보를 붙여 보낸다.
		request.setAttribute("currentPage",currentPage); 
		request.setAttribute("totalRow",new Integer(totalRow));  //총 글 갯수 생략 가능성?
		request.setAttribute("totalPage",new Integer(totalPage)); 
		request.setAttribute("startPage",new Integer(startPage)); 
		request.setAttribute("endPage",new Integer(endPage)); 
	}


}
