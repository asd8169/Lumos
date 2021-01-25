package com.spring.camping.qna.view;

public class QnaViewDto {

	
	int qnaNo;
	int userNo;
	String pName;
	String qnauserId;
	String qnaTitle;
	String qnaContent;
	String qnaComment;
	
	
	public QnaViewDto() {
		// TODO Auto-generated constructor stub
	} 
	
	
	
	public QnaViewDto(int qnaNo, int userNo, String pName, String qnauserId, String qnaTitle, String qnaContent,
			String qnaComment) {
		super();
		this.qnaNo = qnaNo;
		this.userNo = userNo;
		this.pName = pName;
		this.qnauserId = qnauserId;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.qnaComment = qnaComment;
	}


	public int getQnaNo() {
		return qnaNo;
	}


	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}


	public int getUserNo() {
		return userNo;
	}


	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getQnauserId() {
		return qnauserId;
	}


	public void setQnauserId(String qnauserId) {
		this.qnauserId = qnauserId;
	}


	public String getQnaTitle() {
		return qnaTitle;
	}


	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}


	public String getQnaContent() {
		return qnaContent;
	}


	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}


	public String getQnaComment() {
		return qnaComment;
	}


	public void setQnaComment(String qnaComment) {
		this.qnaComment = qnaComment;
	}
	
	
	
	
	
	
}
