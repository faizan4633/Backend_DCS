package com.dcs.dto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	private Integer userId;
	 @NotNull
	private String userName;
	 @Size(min = 5, max = 10, message = "Password should be 5-10 charachters only")
	private String userPassword;
	 @NotNull(message = "Role should be filled")
	private String userRole;
	 
	public UserDTO(@NotNull Integer userId, @NotNull String userName, @Min(5) @Max(10) String userPassword,
			String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
		
}
 