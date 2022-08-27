package hackaton.e_get_debt.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;


@DynamicUpdate
@Entity
@Table(name ="loans")

public class Loan {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="id")
private int id;
@Column(name ="lender_phone_number")
private String lenderPhoneNumber;
@Column(name ="borrower_phone_number")
private String borrowerPhoneNumber;
@Column(name ="loan_amont")
private BigDecimal loanAmount;
@Column(name ="status")
private boolean status;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLenderPhoneNumber() {
	return lenderPhoneNumber;
}
public void setLenderPhoneNumber(String lenderPhoneNumber) {
	this.lenderPhoneNumber = lenderPhoneNumber;
}
public String getBorrowerPhoneNumber() {
	return borrowerPhoneNumber;
}
public void setBorrowerPhoneNumber(String borrowerPhoneNumber) {
	this.borrowerPhoneNumber = borrowerPhoneNumber;
}
public BigDecimal getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(BigDecimal loanAmount) {
	this.loanAmount = loanAmount;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}

}
