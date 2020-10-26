package com.app.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="employee_profiles")
public class EmployeeProfiles implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="number")
	private Integer number;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@OneToOne
	@JoinColumn(name="job_title")
	private JobTitle jobTitle;
	
	@OneToOne
	@JoinColumn(name="dgree")
	private AcademicDegree dgree;
	
	@OneToOne
	@JoinColumn(name="nationality")
	private Contries nationality;
	
	@OneToOne
	@JoinColumn(name="address")
	private Cities address;
	

	public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}
		
	public void setNumber(Integer number){
	  this.number=number;
	}
	
	public Integer getNumber(){
	 return this.number;
	}
		
	public void setFirstName(String firstName){
	  this.firstName=firstName;
	}
	
	public String getFirstName(){
	 return this.firstName;
	}
		
	public void setLastName(String lastName){
	  this.lastName=lastName;
	}
	
	public String getLastName(){
	 return this.lastName;
	}
		
	public void setEmail(String email){
	  this.email=email;
	}
	
	public String getEmail(){
	 return this.email;
	}
		

	public void setJobTitle(JobTitle jobTitle){
	  this.jobTitle=jobTitle;
	}
	
	public JobTitle getJobTitle(){
	 return this.jobTitle;
	}
	

	public void setDgree(AcademicDegree dgree){
	  this.dgree=dgree;
	}
	
	public AcademicDegree getDgree(){
	 return this.dgree;
	}
	

	public void setNationality(Contries nationality){
	  this.nationality=nationality;
	}
	
	public Contries getNationality(){
	 return this.nationality;
	}
	

	public void setAddress(Cities address){
	  this.address=address;
	}
	
	public Cities getAddress(){
	 return this.address;
	}
	

	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	  return this.getId().equals(((EmployeeProfiles) obj).getId());
	}

	@Override
	public int hashCode() {
	  if(this.id==null) { 
	    return toString().hashCode(); 
	   }
	  return this.id.hashCode();
	}
	
	@Override
	public String toString(){
	  StringBuffer buf=new StringBuffer();
	  buf.append(this.id).append(",");
	  buf.append(this.number).append(",");
	  buf.append(this.firstName).append(",");
	  buf.append(this.lastName).append(",");
	  buf.append(this.email).append(",");
	  buf.append(this.jobTitle).append(",");
	  buf.append(this.dgree).append(",");
	  buf.append(this.nationality).append(",");
	  buf.append(this.address).append(",");
	  return buf.toString();
	}
}