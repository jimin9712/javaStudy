package view;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.app.domain.member.MemberVO;
import com.app.domain.post.PostDTO;
import com.app.domain.post.PostVO;
import com.app.domain.reply.ReplyDTO;
import com.app.domain.reply.ReplyVO;
import com.app.repository.member.MemberDAO;
import com.app.repository.post.PostDAO;
import com.app.repository.reply.ReplyDAO;

public class View {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Long postId = 0L;
      int replyNumber = 0;
      String replyContent = null;
      
//      1. 로그인
      MemberVO memberVO = new MemberVO();
      MemberVO member = null;
      MemberDAO memberDAO = new MemberDAO();
      
      PostDTO post = null;
      PostDAO postDAO = new PostDAO();
      
      ArrayList<ReplyDTO> replies = new ArrayList<ReplyDTO>();
      ReplyVO replyVO = new ReplyVO();
      ReplyDTO reply = null;
      ReplyDAO replyDAO = new ReplyDAO();
      
      memberVO.setMemberEmail("test1@gmail.com");
      memberVO.setMemberPassword("1234");
      
      member = memberDAO.select(memberVO);
      
//      로그인 성공!
      if(member != null) {
//         2. 게시글 상세페이지 이동
         
//         게시글 목록
         System.out.println("보고싶은 게시글 번호를 입력하세요.");
         postDAO.selectAll().forEach(System.out::println);
         System.out.print("게시글 번호: ");
         postId = sc.nextLong();
         sc.nextLine();
         
         post = postDAO.select(postId);
         System.out.println(post);
         
//         3. 댓글 목록
         replies = replyDAO.selectAll(postId);
         if(replies.size() != 0) {
            for(int i = 0; i < replies.size(); i++) {
               System.out.print(i + 1 + ".");
               System.out.println(replies.get(i).getReplyContent());
               System.out.println(replies.get(i).getMemberName());
               System.out.println(replies.get(i).getCreatedDate());
               System.out.println("########################");
            };
         }else {
            System.out.println("작성된 댓글이 없습니다.");
         }
         
//         4. 댓글 작성
         replyVO.setMemberId(member.getId());
         replyVO.setPostId(postId);
         
//         System.out.print("댓글 내용: ");
//         replyVO.setReplyContent(sc.nextLine());
//         
//         replyDAO.insert(replyVO);
         
//         5. 댓글 수정
//         System.out.println("수정할 댓글의 번호를 입력하세요.");
//         replyNumber = sc.nextInt();
//         sc.nextLine();
//         replyNumber--;
//         reply = replies.get(replyNumber);
//         
//         if(reply.getMemberId() == member.getId()) {
//            System.out.print("새로운 댓글 내용: ");
//            replyContent = sc.nextLine();
//            reply.setReplyContent(replyContent);
//            
//            replyDAO.update(reply.toVO());
//            
//            replies = replyDAO.selectAll(postId);
//            if(replies.size() != 0) {
//               for(int i = 0; i < replies.size(); i++) {
//                  System.out.print(i + 1 + ".");
//                  System.out.println(replies.get(i).getReplyContent());
//                  System.out.println(replies.get(i).getMemberName());
//                  System.out.println(replies.get(i).getCreatedDate());
//                  System.out.println("########################");
//               };
//            }else {
//               System.out.println("작성된 댓글이 없습니다.");
//            }
//            
//         }else {
//            System.out.println("다른 사람의 댓글은 수정할 수 없습니다.");
//         }
         
//         6. 댓글 삭제
         System.out.println("삭제할 댓글의 번호를 입력하세요.");
         replyNumber = sc.nextInt();
         sc.nextLine();
         replyNumber--;
         reply = replies.get(replyNumber);
         
         if(reply.getMemberId() == member.getId()) {
            replyDAO.delete(reply.getId());
            
            replies = replyDAO.selectAll(postId);
            if(replies.size() != 0) {
               for(int i = 0; i < replies.size(); i++) {
                  System.out.print(i + 1 + ".");
                  System.out.println(replies.get(i).getReplyContent());
                  System.out.println(replies.get(i).getMemberName());
                  System.out.println(replies.get(i).getCreatedDate());
                  System.out.println("########################");
               };
            }else {
               System.out.println("작성된 댓글이 없습니다.");
            }
            
         }else {
            System.out.println("다른 사람의 댓글은 삭제할 수 없습니다.");
         }
         
         
      }
      
      
//      PostDAO postDAO = new PostDAO();
//      PostVO postVO = new PostVO();
//      
//      postVO.setPostTitle("테스트 제목2");
//      postVO.setPostContent("테스트 내용2");
//      postVO.setMemberId(1L);
//      
//      postDAO.insert(postVO);
      
//      System.out.println(postDAO.select(1L));
      
      
//      MemberDAO memberDAO = new MemberDAO();
//      MemberVO memberVO = new MemberVO();
//      
//      memberVO.setMemberEmail("test2@gmail.com");
//      memberVO.setMemberPassword("9999");
//      memberVO.setMemberName("테스트2");
//      memberVO.setMemberGender(1);
//      memberVO.setMemberAge(50);
//      
//      memberDAO.insert(memberVO);
      
      
      
   }
}














