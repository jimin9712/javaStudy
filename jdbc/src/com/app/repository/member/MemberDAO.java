package com.app.repository.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.domain.member.MemberVO;
import com.app.jdbc.configuration.Configuration;

public class MemberDAO {
   
   private Connection connection;
   private PreparedStatement preparedStatement;
   private ResultSet resultSet;
   
//   추가하기
   public void insert(MemberVO memberVO) {
      String query = "INSERT INTO TBL_MEMBER "
            + "(ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, "
            + "MEMBER_AGE, MEMBER_GENDER) "
            + "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?, ?)";
      
      try {
         connection = Configuration.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberEmail());
         preparedStatement.setString(2, memberVO.getMemberPassword());
         preparedStatement.setString(3, memberVO.getMemberName());
         preparedStatement.setInt(4, memberVO.getMemberAge());
         preparedStatement.setInt(5, memberVO.getMemberGender());
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
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
   
//   조회하기
   public MemberVO select(Long id) {
      MemberVO memberVO = new MemberVO();
      String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, "
            + "MEMBER_AGE, MEMBER_GENDER "
            + "FROM TBL_MEMBER "
            + "WHERE ID = ?";
      
      try {
         connection = Configuration.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         
         resultSet = preparedStatement.executeQuery();
         
         resultSet.next();
         memberVO.setId(resultSet.getLong("ID"));
         memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
         memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
         memberVO.setMemberName(resultSet.getString("MEMBER_NAME"));
         memberVO.setMemberAge(resultSet.getInt("MEMBER_AGE"));
         memberVO.setMemberGender(resultSet.getInt("MEMBER_GENDER"));
         memberVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
         memberVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
         
      } catch (SQLException e) {
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
      return memberVO;
   }
   
//   수정하기
   public void update(MemberVO memberVO) {
      String query = "UPDATE TBL_MEMBER "
            + "SET MEMBER_EMAIL = ?, MEMBER_PASSWORD = ?, MEMBER_NAME = ?, "
            + "MEMBER_AGE = ?, MEMBER_GENDER = ? "
            + "WHERE ID = ?";
      
      try {
         connection = Configuration.getConnection();
         preparedStatement = connection.prepareStatement(query);
         
         preparedStatement.setString(1, memberVO.getMemberEmail());
         preparedStatement.setString(2, memberVO.getMemberPassword());
         preparedStatement.setString(3, memberVO.getMemberName());
         preparedStatement.setInt(4, memberVO.getMemberAge());
         preparedStatement.setInt(5, memberVO.getMemberGender());
         preparedStatement.setLong(6, memberVO.getId());
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
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
   
//   삭제하기
   public void delete(Long id) {
      String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
      
      try {
         connection = Configuration.getConnection();
         preparedStatement = connection.prepareStatement(query);
         
         preparedStatement.setLong(1, id);
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
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
   
//   전체 조회하기
   public ArrayList<MemberVO> selectAll() {
      ArrayList<MemberVO> members = new ArrayList<MemberVO>();
      MemberVO memberVO = null;
      String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, "
            + "MEMBER_AGE, MEMBER_GENDER "
            + "FROM TBL_MEMBER";
      
      try {
         connection = Configuration.getConnection();
         preparedStatement = connection.prepareStatement(query);
         
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            do {
               memberVO = new MemberVO();
               memberVO.setId(resultSet.getLong("ID"));
               memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
               memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
               memberVO.setMemberName(resultSet.getString("MEMBER_NAME"));
               memberVO.setMemberAge(resultSet.getInt("MEMBER_AGE"));
               memberVO.setMemberGender(resultSet.getInt("MEMBER_GENDER"));
               memberVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
               memberVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
               
               members.add(memberVO);
               
            } while(resultSet.next());
         }
         
      } catch (SQLException e) {
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
      return members;
   }
}



















