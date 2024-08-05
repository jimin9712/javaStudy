package view;

import com.app.domain.member.MemberVO;
import com.app.domain.post.PostVO;
import com.app.repository.member.MemberDAO;
import com.app.repository.post.PostDAO;

public class View {
	public static void main(String[] args) {
		PostDAO postDAO = new PostDAO();
		PostVO postVO = new PostVO();
		
//		postVO.setPostTitle("테스트 제목1");
//		postVO.setPostContent("테스트 내용1");
//		postVO.setMemberId(1L);
//		
//		postDAO.insert(postVO);
		
		System.out.println(postDAO.select(1L));
		
		
//		MemberDAO memberDAO = new MemberDAO();
//		MemberVO memberVO = new MemberVO();
//		
//		memberVO.setMemberEmail("test1@gmail.com");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberName("테스트");
//		memberVO.setMemberGender(2);
//		memberVO.setMemberAge(20);
//		
//		memberDAO.insert(memberVO);
		
		
		
	}
}














