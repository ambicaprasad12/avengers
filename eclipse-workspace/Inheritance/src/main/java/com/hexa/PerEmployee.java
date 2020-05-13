package com.hexa;

import javax.persistence.Entity;

@Entity

public class PerEmployee extends Employee {
private int sal;
private int bonus;
private String pf;


public PerEmployee() {}
public PerEmployee(int sal, int bonus, String pf) {
	super();
	this.sal = sal;
	this.bonus = bonus;
	this.pf = pf;
}
@Override
public String toString() {
	return "PerEmployee [sal=" + sal + ", bonus=" + bonus + ", pf=" + pf + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + bonus;
	result = prime * result + ((pf == null) ? 0 : pf.hashCode());
	result = prime * result + sal;
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
	PerEmployee other = (PerEmployee) obj;
	if (bonus != other.bonus)
		return false;
	if (pf == null) {
		if (other.pf != null)
			return false;
	} else if (!pf.equals(other.pf))
		return false;
	if (sal != other.sal)
		return false;
	return true;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
public String getPf() {
	return pf;
}
public void setPf(String pf) {
	this.pf = pf;
}



}
