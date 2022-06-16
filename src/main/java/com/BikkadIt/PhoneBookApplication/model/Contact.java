package com.BikkadIt.PhoneBookApplication.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="CONTACT_DTLS")
public class Contact {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	@Column(name="CONTACT_ID")
   private Integer  contactId;
	
	@Column(name="CONTACT_NAME")
   private String contactName;
	
	@Column(name="CONTACT_NUMBER")
   private Long contactNumber;
	
	@Column(name="CONTACT_EMAIL")
   private String contactEmail;
	
	@Column(name="CONTACT_ACTIVESW")
	private Character activeSw;
   
	@Column(name="CONTACT_CREATEDATE")
   private LocalDate createDate;
	 
	@Column(name="CONTACT_UPDATEDATE")
   private LocalDate updateDate;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Character getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(Character activeSw) {
		this.activeSw = activeSw;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ ", contactEmail=" + contactEmail + ", activeSw=" + activeSw + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
   
 
}
