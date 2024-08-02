package com.app.view;

import com.app.member.domain.PostVO;
import com.app.member.repository.PostDAO;

public class View {
	public static void main(String[] args) {
		
//		MemberDAO memberDAO = new MemberDAO();
//		MemberVO memberVO = new MemberVO();
//		memberVO.setMemberEmail("ljm21252");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberName("이지민");
//		memberVO.setMemberAge(25);
//		memberVO.setMemberGender(MemberVO.GENDER_MEN);
//		
//		memberDAO.insert(memberVO);
		
		PostDAO postDAO = new PostDAO();
		PostVO postVO = new PostVO();
		postVO.setPostTitle("이거 보세요");
		
		postDAO.insert(postVO);
		
	
	
	}

}
