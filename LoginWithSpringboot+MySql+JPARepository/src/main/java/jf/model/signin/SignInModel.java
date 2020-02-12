package jf.model.signin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="user", uniqueConstraints = {
		@UniqueConstraint(columnNames = {
		         "emailid"
		    })
})
public class SignInModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userId;
	
	private String firstname;
	private String middlename;
	private String lastname;
	private String dob;
	private String gender;
	private String mobilenumber;
	private String emailid;
	private String password;
	private String adharcardno;
	private String tempararyaddress;
	private String permenentaddress;
	private String city;
	private int pincode;
	private String regiverification;
	private String registrationstatus;
	private String adminconfirmation;
	private String resetcode;
	private String tstamp;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdharcardno() {
		return adharcardno;
	}
	public void setAdharcardno(String adharcardno) {
		this.adharcardno = adharcardno;
	}
	public String getTempararyaddress() {
		return tempararyaddress;
	}
	public void setTempararyaddress(String tempararyaddress) {
		this.tempararyaddress = tempararyaddress;
	}
	public String getPermenentaddress() {
		return permenentaddress;
	}
	public void setPermenentaddress(String permenentaddress) {
		this.permenentaddress = permenentaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getRegiverification() {
		return regiverification;
	}
	public void setRegiverification(String regiverification) {
		this.regiverification = regiverification;
	}
	public String getRegistrationstatus() {
		return registrationstatus;
	}
	
	
	public void setRegistrationstatus(String registrationstatus) {
		this.registrationstatus = registrationstatus;
	}
	public String getAdminconfirmation() {
		return adminconfirmation;
	}
	public void setAdminconfirmation(String adminconfirmation) {
		this.adminconfirmation = adminconfirmation;
	}
	public String getResetcode() {
		return resetcode;
	}
	public void setResetcode(String resetcode) {
		this.resetcode = resetcode;
	}
	public String getTstamp() {
		return tstamp;
	}
	public void setTstamp(String tstamp) {
		this.tstamp = tstamp;
	}
	
	@Override
	public String toString() {
		return "SignInModel [userId=" + userId + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", dob=" + dob + ", gender=" + gender + ", mobilenumber=" + mobilenumber
				+ ", emailid=" + emailid + ", password=" + password + ", adharcardno=" + adharcardno
				+ ", tempararyaddress=" + tempararyaddress + ", permenentaddress=" + permenentaddress + ", city=" + city
				+ ", pincode=" + pincode + ", regiverification=" + regiverification + ", registrationstatus="
				+ registrationstatus + ", adminconfirmation=" + adminconfirmation + ", resetcode=" + resetcode
				+ ", tstamp=" + tstamp + "]";
	}
	
}
