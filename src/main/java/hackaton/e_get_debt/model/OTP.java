package hackaton.e_get_debt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@DynamicUpdate
@Entity
@Table(name ="otp")
public class OTP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	@Column(name = "OTPCode")
	private String OTPCode;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "expireTime")
	final private int expireTime= 5;
	@Column(name = "borrower_otp")
	private String borrowerOTP;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOTPCode() {
		return OTPCode;
	}
	public void setOTPCode(String oTPCode) {
		OTPCode = oTPCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBorrowerOTP() {
		return borrowerOTP;
	}
	public void setBorrowerOTP(String borrowerOTP) {
		this.borrowerOTP = borrowerOTP;
	}
	public int getExpireTime() {
		return expireTime;
	}
	
}
