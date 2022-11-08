package model.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{

	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private double baseSalary;
	
	Department department;
	
	public Seller () {
	}

	public Seller(Integer id, String name, String email, Date birthDate, double basesalary, Department departament) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = basesalary;
		this.department = departament;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getBasesalary() {
		return baseSalary;
	}

	public void setBasesalary(double basesalary) {
		this.baseSalary = basesalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartament(Department departament) {
		this.department = departament;
	}

	@Override
	public int hashCode() {
		return Objects.hash(baseSalary, birthDate, department, email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Double.doubleToLongBits(baseSalary) == Double.doubleToLongBits(other.baseSalary)
				&& Objects.equals(birthDate, other.birthDate) && Objects.equals(department, other.department)
				&& Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", basesalary="
				+ baseSalary + ", departament=" + department + "]";
	}
	
	
	
}
