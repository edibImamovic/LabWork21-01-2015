package ba.bitcamp.edibImamovic.path;

import java.io.Serializable;

public class UserClass implements Serializable {

	/**
	 * Version 1
	 */
	private static final long serialVersionUID = 4268018997653180223L;
	private String name;
	private int age;
	private boolean isJavaProgrammer;

	/**
	 * 
	 * @param name
	 * @param age
	 * @param isJavaProgrammer
	 */
	public UserClass(String name, int age, boolean isJavaProgrammer) {

		this.name = name;
		this.age = age;
		this.isJavaProgrammer = isJavaProgrammer;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the isJavaProgrammer
	 */
	public boolean isJavaProgrammer() {
		return isJavaProgrammer;
	}

	/**
	 * @param isJavaProgrammer
	 *            the isJavaProgrammer to set
	 */
	public void setJavaProgrammer(boolean isJavaProgrammer) {
		this.isJavaProgrammer = isJavaProgrammer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserClass [name=" + name + ", age=" + age
				+ ", isJavaProgrammer=" + isJavaProgrammer + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserClass other = (UserClass) obj;
		if (age != other.age)
			return false;
		if (isJavaProgrammer != other.isJavaProgrammer)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
