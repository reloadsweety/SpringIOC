package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {
	
	@Id
	@NotEmpty
	@Pattern(regexp="^[0-9].*",message="not numeric")
	@Column(name="employeeNumber")
	private String employeeNumber;
	
	@NotEmpty
	@Column(name="lastName"  )
	private String lastName;
	
	@NotEmpty
	@Size(min=3, max=50)
	@Column(name="firstName")
	private String firstName;
	
	@NotEmpty
	@Column(name="extension" )
	private String extension;
	
	@Email
	@Column(name="email" )
	private String email;
	
	@NotEmpty
	@Column(name="officeCode" )
	private String officeCode;
	
	@NotEmpty
	@Size(max=1)
	@Column(name="reportsTo" )
	private String reportsTo;
	
	@NotEmpty
	@Column(name="jobTitle" )
	private String jobTitle;
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
}
