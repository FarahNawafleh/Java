package com.app.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="job_title")
public class JobTitle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	

	public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}
		
	public void setName(String name){
	  this.name=name;
	}
	
	public String getName(){
	 return this.name;
	}
		

	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	  return this.getId().equals(((JobTitle) obj).getId());
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
	  buf.append(this.name).append(",");
	  return buf.toString();
	}
}