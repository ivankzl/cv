package ar.edu.um.model;

import java.math.BigDecimal;
import java.util.Set;

public class User {

	private BigDecimal DNI;
	private String password;
	private int enabled;
	public BigDecimal getDNI() {
		return DNI;
	}
	public void setDNI(BigDecimal DNI) {
		this.DNI = DNI;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "User [DNI=" + DNI + ", password=" + password + ", enabled="
				+ enabled + "]";
	}
	
	

}