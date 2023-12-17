package com.dcs.dto;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;

import com.dcs.entity.Response;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
	private Integer commentId;
	@Size(min = 10, max = 200, message = "Text should not be more than 200 characthers and less than 10 characters")
	
	private String text;
	
	private DeveloperDTO createdBy;
	
	private Integer responseId;
	
	private Response response;
	
	@CreatedDate
	private LocalDate createdDate;
	
	private Integer postId;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	@Override
	public String toString() {
		return "CommentDTO [commentId=" + commentId + ", text=" + text + ", createdBy=" + createdBy + ", responseId="
				+ responseId + ", createdDate=" + createdDate + ", postId=" + postId + "]";
	}

	public Integer getResponseId() {
		return responseId;
	}

	public void setResponseId(Integer responseId) {
		this.responseId = responseId;
	}

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public DeveloperDTO getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(DeveloperDTO createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public CommentDTO() {
		super();

	}

}
