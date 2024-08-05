package com.app.repository.post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.domain.post.PostDTO;
import com.app.domain.post.PostVO;
import com.app.jdbc.configuration.Configuration;

public class PostDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	추가하기
	public void insert(PostVO postVO) {
		String query = "INSERT INTO TBL_POST "
				+ "(ID, POST_TITLE, POST_CONTENT, MEMBER_ID) "
				+ "VALUES(SEQ_POST.NEXTVAL, ?, ?, ?)";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, postVO.getPostTitle());
			preparedStatement.setString(2, postVO.getPostContent());
			preparedStatement.setLong(3, postVO.getMemberId());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert(PostVO) SQL 오류");
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
	
//	게시글 존재 여부 검사
	public boolean checkPost(Long id) {
		String query = "SELECT P.ID, P.POST_TITLE, P.POST_CONTENT, M.MEMBER_NAME, "
				+ "P.READ_COUNT, P.CREATED_DATE, P.UPDATED_DATE "
				+ "FROM TBL_MEMBER M JOIN TBL_POST P "
				+ "ON M.ID = P.MEMBER_ID AND P.ID = ?";
		
		boolean check = false;
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			resultSet = preparedStatement.executeQuery();
			check = resultSet.next();
			
		} catch (SQLException e) {
			System.out.println("checkPost(long) SQL 오류");
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
			
		return check;
	}
	
//	조회하기
	public PostDTO select(Long id) {
		PostDTO postDTO = null;
		String query = "SELECT P.ID, P.POST_TITLE, P.POST_CONTENT, M.MEMBER_NAME, "
				+ "P.READ_COUNT, P.CREATED_DATE, P.UPDATED_DATE "
				+ "FROM TBL_MEMBER M JOIN TBL_POST P "
				+ "ON M.ID = P.MEMBER_ID AND P.ID = ?";
		
		if(checkPost(id)) {
			update(id);
		}
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				
				postDTO = new PostDTO();
				postDTO.setId(resultSet.getLong("ID"));
				postDTO.setPostTitle(resultSet.getString("POST_TITLE"));
				postDTO.setPostContent(resultSet.getString("POST_CONTENT"));
				postDTO.setReadCount(resultSet.getInt("READ_COUNT"));
				postDTO.setMemberName(resultSet.getString("MEMBER_NAME"));
				postDTO.setCreatedDate(resultSet.getString("CREATED_DATE"));
				postDTO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
				
				
			}
			
		} catch (SQLException e) {
			System.out.println("select(long) SQL 오류");
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
		
		return postDTO;
	}
	
//	수정하기
	public void update(PostVO postVO) {
		String query = "UPDATE TBL_POST "
				+ "SET POST_TITLE = ?, POST_CONTENT = ?, UPDATED_DATE = SYSDATE"
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, postVO.getPostTitle());
			preparedStatement.setString(2, postVO.getPostContent());
			preparedStatement.setLong(3, postVO.getId());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update(PostVO) SQL 오류");
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
	
//	삭제하기
	public void delete(Long id) {
		String query = "DELETE FROM TBL_POST WHERE ID = ?";
		
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
	
//	전체 조회하기
	public ArrayList<PostDTO> selectAll() {
		PostDTO postDTO = null;
		ArrayList<PostDTO> posts = new ArrayList<PostDTO>();
		
		String query = "SELECT P.ID, P.POST_TITLE, P.POST_CONTENT, M.MEMBER_NAME, "
				+ "P.READ_COUNT, P.CREATED_DATE, P.UPDATED_DATE "
				+ "FROM TBL_MEMBER M JOIN TBL_POST P "
				+ "ON M.ID = P.MEMBER_ID";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				
				do {
					postDTO = new PostDTO();
					postDTO.setId(resultSet.getLong("ID"));
					postDTO.setPostTitle(resultSet.getString("POST_TITLE"));
					postDTO.setPostContent(resultSet.getString("POST_CONTENT"));
					postDTO.setReadCount(resultSet.getInt("READ_COUNT"));
					postDTO.setMemberName(resultSet.getString("MEMBER_NAME"));
					postDTO.setCreatedDate(resultSet.getString("CREATED_DATE"));
					postDTO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
					
					posts.add(postDTO);
					
				} while(resultSet.next());
				
			}
			
		} catch (SQLException e) {
			System.out.println("select(long) SQL 오류");
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
		
		return posts;
	}
	
	private void update(Long id) {
		String query = "UPDATE TBL_POST "
				+ "SET READ_COUNT = READ_COUNT + 1 "
				+ "WHERE ID = ?";
		
		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update(long) SQL 오류");
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

















