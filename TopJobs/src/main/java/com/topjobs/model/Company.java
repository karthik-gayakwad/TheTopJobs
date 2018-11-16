package com.topjobs.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Company {
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "company_Sequence")
    @SequenceGenerator(name = "company_Sequence", sequenceName = "COMPANY_SEQ", initialValue=1, allocationSize=1)
    private Long company_id;
	
	@Column(name = "sCompany")
	String sCompany;
	
	@Column(name = "sCompanySize")
	String sCompanySize;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "company")
    private Set<Employer> employers;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "company")
    private Set<Post> post;

	public String getsCompany() {
		return sCompany;
	}

	public void setsCompany(String sCompany) {
		this.sCompany = sCompany;
	}

	public String getsCompanySize() {
		return sCompanySize;
	}

	public void setsCompanySize(String sCompanySize) {
		this.sCompanySize = sCompanySize;
	}
	
	public Company() {
		
	}
	
	public Company(String sCompany, String sCompanySize) {
		
		super();

		this.sCompany = sCompany;
		this.sCompanySize = sCompanySize;
		
	}

	
}
