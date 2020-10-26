package com.app.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="contries")
public class Contries implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="short_name")
	private String shortName;
	
	@Column(name="name")
	private String name;
	

	public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}
		
	public void setShortName(String shortName){
	  this.shortName=shortName;
	}
	
	public String getShortName(){
	 return this.shortName;
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
	  return this.getId().equals(((Contries) obj).getId());
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
	  buf.append(this.shortName).append(",");
	  buf.append(this.name).append(",");
	  return buf.toString();
	}
}