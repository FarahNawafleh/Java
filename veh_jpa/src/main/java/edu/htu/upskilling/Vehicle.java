package edu.htu.upskilling;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Vehicle")
public class Vehicle implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "vehBrand")
	private String vehBrand;
	
	@Column(name = "vehModel")
	private String vehModel;
	
	@Column(name = "vehYear")
	private Integer vehYear;
	
	@Column(name = "vehVin")
	private String vehVin;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setVehBrand(String vehBrand) {
		this.vehBrand = vehBrand;
	}

	public String getVehBrand() {
		return this.vehBrand;
	}

	public void setVehModel(String vehModel) {
		this.vehModel = vehModel;
	}

	public String getVehModel() {
		return this.vehModel;
	}

	public void setVehYear(Integer vehYear) {
		this.vehYear = vehYear;
	}

	public Integer getVehYear() {
		return this.vehYear;
	}

	public void setVehVin(String vehVin) {
		this.vehVin = vehVin;
	}

	public String getVehVin() {
		return this.vehVin;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append(this.vehBrand).append(" ");
		buf.append(",");
		buf.append(this.vehModel).append(" ");
		buf.append(",");
		buf.append(this.vehYear).append(" ");
		buf.append(",");
		buf.append(this.vehVin).append(" ");
		return buf.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		return this.getId() == ((Vehicle) obj).getId();
	}

	@Override
	public int hashCode() {
		if (this.id == null) {
			return toString().hashCode();
		}
		return this.id.hashCode();
	}

}