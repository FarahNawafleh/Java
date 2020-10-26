package com.app.models;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="hr_employee")
public class Employee implements Serializable {

  @Id
  @Column(name="emp_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name="emp_name" )
  private String name;

  @Column(name="emp_salary" )
  private Double salary;

  @Column(name="emp_email" )
  private String email;


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

  public void setSalary(Double salary){
    this.salary=salary;
  }

  public Double getSalary(){
   return this.salary;
  }

  public void setEmail(String email){
    this.email=email;
  }

  public String getEmail(){
   return this.email;
  }
  @Override
  public String toString(){
    StringBuffer buf=new StringBuffer();
    buf.append(this.name).append(" ");
    buf.append(",");
    buf.append(this.salary).append(" ");
    buf.append(",");
    buf.append(this.email).append(" ");
    return buf.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
	  return false;
    }
    return this.getId() == ((Employee) obj).getId();
  }


  @Override
  public int hashCode() {
    if(this.id==null) { 
      return toString().hashCode(); 
     }
    return this.id.hashCode();
  }

}