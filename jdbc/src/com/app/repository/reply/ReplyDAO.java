package com.app.repository.reply;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.app.domain.reply.ReplyVO;
import com.app.jdbc.configuration.Configuration;

public class ReplyDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	// 댓글 작성
	public void insertComment(ReplyVO replyVO) {
		String query = "INSERT INTO TBL_REPLY (ID, REPLY_NUMBER, REPLY_CONTENT, CREATED_DATE, UPDATED_DATE, POST_ID, MEMBER_ID) "
				+ "VALUES (SEQ_REPLY.NEXTVAL, ?, ?, SYSDATE, SYSDATE, ?, ?)";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, replyVO.getReplyNumber());
			preparedStatement.setString(2, replyVO.getReplyContent());
			preparedStatement.setLong(3, replyVO.getPostId());
			preparedStatement.setLong(4, replyVO.getMemberId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insertComment(ReplyVO) SQL 오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

	// 댓글 전체 목록
	public ArrayList<ReplyVO> selectAllComments() {
		ArrayList<ReplyVO> comments = new ArrayList<>();
		String query = "SELECT R.ID, R.REPLY_NUMBER, R.REPLY_CONTENT, R.CREATED_DATE, R.UPDATED_DATE, "
				+ "P.POST_TITLE, M.MEMBER_NAME " + "FROM TBL_REPLY R " + "JOIN TBL_POST P ON R.POST_ID = P.ID "
				+ "JOIN TBL_MEMBER M ON R.MEMBER_ID = M.ID";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				ReplyVO replyVO = new ReplyVO();
				replyVO.setId(resultSet.getLong("ID"));
				replyVO.setReplyNumber(resultSet.getLong("REPLY_NUMBER"));
				replyVO.setReplyContent(resultSet.getString("REPLY_CONTENT"));
				replyVO.setCreatedDate(resultSet.getString("CREATED_DATE"));
				replyVO.setUpdatedDate(resultSet.getString("UPDATED_DATE"));
				replyVO.setPostId(resultSet.getLong("POST_ID"));
				replyVO.setMemberId(resultSet.getLong("MEMBER_ID"));
				comments.add(replyVO);
			}
		} catch (SQLException e) {
			System.out.println("selectAllComments() SQL 오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return comments;
	}

	// 댓글 수정
	public void updateComment(ReplyVO replyVO) {
		String query = "UPDATE TBL_REPLY " + "SET REPLY_CONTENT = ?, UPDATED_DATE = SYSDATE " + "WHERE ID = ?";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("updateComment(ReplyVO) SQL 오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

	// 댓글 삭제
	public void deleteComment(Long id) {
		String query = "DELETE FROM TBL_REPLY WHERE ID = ?";

		try {
			connection = Configuration.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("deleteComment(Long) SQL 오류");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}

	}
}
