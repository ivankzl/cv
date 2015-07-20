package ar.edu.um.model;
import java.math.BigDecimal;

public class UserRole {

	private Integer userRoleId;
	private BigDecimal DNI; /* agrego esto por ahora (koke)*/
	private String role;
	
	private User user;
	

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public BigDecimal getDNI(){
		return DNI;
	}
	
	public void setDNI(BigDecimal DNI){
		this.DNI = DNI;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}