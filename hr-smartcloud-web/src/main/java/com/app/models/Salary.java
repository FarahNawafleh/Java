package com.app.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="salary")
public class Salary implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="from")
	private Integer from;
	
	@Column(name="to")
	private Integer to;
	

	public void setId(Integer id){
	  this.id=id;
	}
	
	public Integer getId(){
	 return this.id;
	}
		
	public void setTitle(String title){
	  this.title=title;
	}
	
	public String getTitle(){
	 return this.title;
	}
		
	public void setFrom(Integer from){
	  this.from=from;
	}
	
	public Integer getFrom(){
	 return this.from;
	}
		
	public void setTo(Integer to){
	  this.to=to;
	}
	
	public Integer getTo(){
	 return this.to;
	}
		

	@Override
	public boolean equals(Object obj) {
	  if (obj == null) {
		return false;
	  }
	  return this.getId().equals(((Salary) obj).getId());
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
	  buf.append(this.title).append(",");
	  buf.append(this.from).append(",");
	  buf.append(this.to).append(",");
	  return buf.toString();
	}
}