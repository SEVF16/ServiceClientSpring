package com.service.client.springboot.web.service.domain;

import jakarta.persistence.Column;

public class Client {
	private Long clientid;
	

    private String name;
    
    private String lastName;
    
    private String phone;
    
    private String email;
    
	private String address;
    
    private String clienRut;

    private Long comunaIdFk;

	public Long getClientid() {
		return clientid;
	}

	public void setClientid(Long clientid) {
		this.clientid = clientid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getClienRut() {
		return clienRut;
	}

	public void setClienRut(String clienRut) {
		this.clienRut = clienRut;
	}

	public Long getComunaIdFk() {
		return comunaIdFk;
	}

	public void setComunaIdFk(Long comunaIdFk) {
		this.comunaIdFk = comunaIdFk;
	}
    
    
}
