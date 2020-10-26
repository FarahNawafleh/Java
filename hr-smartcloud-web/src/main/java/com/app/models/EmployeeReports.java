package com.app.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="employee_reports")
public class EmployeeReports implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	

	public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}
		

	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	  return this.getId().equals(((EmployeeReports) obj).getId());
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
	  return buf.toString();
	}
}