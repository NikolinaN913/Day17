package domain;

import kindergarten.Kindergarten;

public class Teacher implements Kindergarten{
	private final String teacher;

	public Teacher(String teacher) {
		super();
		this.teacher = teacher;
	}

	public String getTeacher() {
		return teacher;
	}

	@Override
	public String timeToLunch() {
		return "Time to Lunch is from 11:30 to 12:30";
	}

	@Override
	public String timeToSleep() {
		return "Time to Sleep is from 12:30 to 13:30";
	}

	@Override
	public String toString() {
		return "In "+ NAME +" Kindergarten teacher is " + teacher + ". " + timeToLunch() + timeToSleep();
	}
	
	
	
	
	
}
