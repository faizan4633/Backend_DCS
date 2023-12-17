package com.dcs.dto;

import java.time.LocalDate;
import java.util.List;

import com.dcs.entity.Developer;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

//import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeveloperDTO extends UserDTO {
	
	@NotBlank(message = "Developer name cannot be blank")
	@Size(max = 20, message = "devName field cannot exceed maximum length of 20")
	private String devName;
	
	@NotBlank(message = "Developer skill cannot be blank")
	private String devSkill; 
	
	@NotNull(message = "Member since cannot be null")
	@PastOrPresent(message = "Date must be in the pas ot present")
	private LocalDate memberSince;
	// If no. of Upvote on Post is 5, then reputation value is 1
	// If no. of Upvote on Post is 10, then reputation value is 2 and so on
	
	@Max(value = 100, message = "Reputation cannot exceed 100")
	@NotNull(message = "Reputation cannot be null")
	private Integer reputation;
	

//	public List<PostDTO> getListOfPosts() {
//		return listOfPosts;
//	}
//
//	public void setListOfPosts(List<PostDTO> listOfPosts) {
//		this.listOfPosts = listOfPosts;
//	}

	// Block or Unblock

	private String status;
	private List<PostDTO> listOfPosts;

	private Integer noOfPosts;

	public DeveloperDTO(Developer developer1, Developer developer12, Developer developer13, Developer developer14) {
		// super();
	}

	public DeveloperDTO() {
		super();
	}

	

	public DeveloperDTO(Integer userId, @NotNull String userName, @Min(5) @Max(10) String userPassword,
			String userRole, @NotNull String devName, String devSkill, LocalDate memberSince, Integer reputation,
			String status, List<PostDTO> listOfPosts, Integer noOfPosts) {
		super(userId, userName, userPassword, userRole);
		this.devName = devName;
		this.devSkill = devSkill;
		this.memberSince = memberSince;
		this.reputation = reputation;
		this.status = status;
		this.listOfPosts = listOfPosts;
		this.noOfPosts = noOfPosts;
	}

	public Integer getNoOfPosts() {
		return noOfPosts;
	}

	public void setNoOfPosts(Integer noOfPosts) {
		this.noOfPosts = noOfPosts;
	}

	public String getDevName() {
		return devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getDevSkill() {
		return devSkill;
	}

	public void setDevSkill(String devSkill) {
		this.devSkill = devSkill;
	}

	public LocalDate getMemberSince() {
		return memberSince;
	}

	public void setMemberSince(LocalDate memberSince) {
		this.memberSince = memberSince;
	}

	public Integer getReputation() {
		return reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DeveloperDTO [devName=" + devName + ", devSkill=" + devSkill + ", memberSince=" + memberSince
				+ ", reputation=" + reputation + ", status=" + status + ", listOfPosts=" + listOfPosts + ", noOfPosts="
				+ noOfPosts + "]";
	}

}