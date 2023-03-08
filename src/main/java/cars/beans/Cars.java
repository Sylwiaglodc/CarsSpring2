package cars.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cars {
	
	@Id
	@GeneratedValue
	private long id;
	private String make;
	private String model;
	private int cylinders;
	private double liters;
	private boolean turbo;

	
	public Cars(long id, String make, String model, int cylinders, double liters, boolean turbo) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.cylinders = cylinders;
		this.liters = liters;
		this.turbo = turbo;
	}
	
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public double getLiters() {
		return liters;
	}
	public void setLiters(double liters) {
		this.liters = liters;
	}
	public boolean isTurbo() {
		return turbo;
	}
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	@Override
	public String toString() {
		return "Cars [id=" + id + ", make=" + make + ", model=" + model + ", cylinders=" + cylinders + ", liters="
				+ liters + ", turbo=" + turbo + "]";
	}
	
	

}
