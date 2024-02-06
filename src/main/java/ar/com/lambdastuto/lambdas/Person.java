package ar.com.lambdastuto.lambdas;

import java.time.LocalDate;

public class Person {

	public enum Sex {
		MALE, FEMALE;
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;

	public LocalDate getBirthday() {
		return birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getName() {
		return name;
	}


}
