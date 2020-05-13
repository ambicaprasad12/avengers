package com.hexa;

import javax.persistence.Entity;

@Entity
public class ContEmployee extends Employee {
	private int wage;
	private String vendor;
	private int duration;
	
	public ContEmployee() {}
	
	
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public ContEmployee(int wage, String vendor, int duration) {
		super();
		this.wage = wage;
		this.vendor = vendor;
		this.duration = duration;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + duration;
		result = prime * result + ((vendor == null) ? 0 : vendor.hashCode());
		result = prime * result + wage;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContEmployee other = (ContEmployee) obj;
		if (duration != other.duration)
			return false;
		if (vendor == null) {
			if (other.vendor != null)
				return false;
		} else if (!vendor.equals(other.vendor))
			return false;
		if (wage != other.wage)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ContEmployee [wage=" + wage + ", vendor=" + vendor + ", duration=" + duration + "]";
	}
	
	
	
	  
	
	
	
	
	
   
}
