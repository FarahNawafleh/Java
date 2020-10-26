
public class Vehicle {

	  private Integer id;
	  private String vehBrand;
	  private String vehModel;
	  private Integer vehYear;
	  private String vehVin;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVehBrand() {
		return vehBrand;
	}
	public void setVehBrand(String vehBrand) {
		this.vehBrand = vehBrand;
	}
	public String getVehModel() {
		return vehModel;
	}
	public void setVehModel(String vehModel) {
		this.vehModel = vehModel;
	}
	public Integer getVehYear() {
		return vehYear;
	}
	public void setVehYear(Integer vehYear) {
		this.vehYear = vehYear;
	}
	public String getVehVin() {
		return vehVin;
	}
	public void setVehVin(String vehVin) {
		this.vehVin = vehVin;
	}
	@Override
	public String toString() {
		return "sid=" + id + ", vehBrand=" + vehBrand + ", vehModel=" + vehModel + ", vehYear=" + vehYear
				+ ", vehVin=" + vehVin ;
	}

}
