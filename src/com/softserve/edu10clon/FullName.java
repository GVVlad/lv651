package com.softserve.edu10clon;

public class FullName implements Cloneable {
	public String firstName;
	public String lastName;
	//public StringBuilder lastName;

	public FullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "FullName [ firstName = " + firstName + ", lastName=" + lastName + " ]";
	}

	// /*-
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("\nclone() from FullName");
		return super.clone();
		// FullName myClone = (FullName) super.clone();
		// myClone.setFirstName(new String(firstName));
		// myClone.setLastName(lastName.substring(0));
	}
	// */
}