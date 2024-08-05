package com.app.repository.reply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.domain.post.PostDTO;
import com.app.domain.post.PostVO;
import com.app.domain.reply.ReplyDTO;
import com.app.domain.reply.ReplyVO;
import com.app.jdbc.configuration.Configuration;

public class ReplyDAO {
   private Connection connection;
   private PreparedStatement preparedStatement;
   private ResultSet resultSet;
   
//   댓글 작성
   public void insert(ReplyVO replyVO) {
      String query = "INSERT INTO TBL_REPLY "
            + "(ID, REPLY_CONTENT, POST_ID, MEMBER_ID) "
            + "VALUES(SEQ_REPLY.NEXTVAL, ?, ?, ?)";
      
      try {
         connection = Configuration.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, replyVO.getReplyContent());
         preparedStatement.setLong(2, replyVO.getPostId());
         preparedStatement.setLong(3, replyVO.getMemberId());
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("insert(ReplyVO) SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
   }
   
//   댓글 전체 목록
   public ArrayList<ReplyDTO> selectAll(Long postId) {
      ReplyDTO replyDTO = null;
      ArrayList<ReplyDTO> replies = new ArrayList<ReplyDTO>();
      
      String query = "SELECT R.ID, R.REPLY_CONTENT, R.POST_ID, R.MEMBER_ID, M.MEMBER_NAME, " 
            + "R.CREATED_DATE, R.UPDATED_DATE "
            + "FROM TBL_MEMBER M JOIN TBL_REPLY R "
            + "ON M.ID = R.MEMBER_ID AND R.POST_ID = ? "
            + "ORDER BY ID DESC";
      
      try {
         connection = Configuration.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, postId);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            
            do {
               replyDTO = new ReplyDTO();
               replyDTO.setId(resultSet.getLong("ID"));
               replyDTO.setReplyContent(resultSet.getString("REPLY_CONTENT"));
               replyDTO.setMemberId(resultSet.getLong("MEMBER_ID"));
               replyDTO.setMemberName(resultSet.getString("MEMBER_NAME"));
               replyDTO.setPostId(resultSet.getLong("POST_ID"));
               replyDTO.setCreatedDate(resultSet.getString("CREATED_DATE"));
               replyDTO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
               
               replies.add(replyDTO);
               
            } while(resultSet.next());
            
         }
         
      } catch (SQLException e) {
         System.out.println("selectAll(long) SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
      
      return replies;
   }
   
//   댓글 수정
   public void update(ReplyVO replyVO) {
      String query = "UPDATE TBL_REPLY "
            + "SET REPLY_CONTENT = ?, UPDATED_DATE = SYSDATE "
            + "WHERE ID = ?";
      
      try {
         connection = Configuration.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, replyVO.getReplyContent());
         preparedStatement.setLong(2, replyVO.getId());
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("update(ReplyVO) SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
   }
   
//   댓글 삭제
   public void delete(Long id) {
      String query = "DELETE FROM TBL_REPLY WHERE ID = ?";
      
      try {
         connection = Configuration.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("delete(long) SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
   }
}



















