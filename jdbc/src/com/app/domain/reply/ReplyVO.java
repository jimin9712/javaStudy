package com.app.domain.reply;

import java.util.Objects;

public class ReplyVO {
    
    private Long id;
    private Long replyNumber;
    private String replyContent;
    private String createdDate;
    private String updatedDate;
    private Long postId;
    private Long memberId;

    public ReplyVO() {;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReplyNumber() {
        return replyNumber;
    }

    public void setReplyNumber(Long replyNumber) {
        this.replyNumber = replyNumber;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "ReplyVO [id=" + id + ", replyNumber=" + replyNumber + ", replyContent=" + replyContent + 
               ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + 
               ", postId=" + postId + ", memberId=" + memberId + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReplyVO other = (ReplyVO) obj;
        return Objects.equals(id, other.id);
    }
}
